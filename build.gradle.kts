// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.application) apply false
    alias(libs.plugins.library) apply false
    alias(libs.plugins.android) apply false
    alias(libs.plugins.kotlin.jvm)
}

buildscript {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
    dependencies {
        classpath(libs.build.gradle)
        classpath(libs.gradle.plugin)
    }
}
