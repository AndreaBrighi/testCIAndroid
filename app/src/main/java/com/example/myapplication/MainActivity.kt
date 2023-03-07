package com.example.myapplication

import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val version =try {
                        val pInfo: PackageInfo =
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                                packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0.toLong()))
                            } else {
                                packageManager.getPackageInfo(packageName, 0)
                            }
                        pInfo.versionName
                    } catch (e: PackageManager.NameNotFoundException) {
                        e.printStackTrace()
                        "0.0.0"
                    }
                    Greeting("Android", version)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, version: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! from $version",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android", "0.0.0")
    }
}