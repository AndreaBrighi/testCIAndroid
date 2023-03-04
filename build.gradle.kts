// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.0-beta04")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
    }
}

plugins {
    id("com.android.application") version "8.0.0-beta04" apply false
    id("com.android.library") version "8.0.0-beta04" apply false
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
}