// Top-level build file where you can add configuration options common to all sub-projects/modules.

// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
    }

    dependencies {

        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.5")
    }
}


plugins {

    id ("com.android.library") version "7.3.1" apply false
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false

    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}