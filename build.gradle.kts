plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.kotlinAndroid) apply false
}
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        // save args
        classpath(libs.androidx.navigation.safe.args.gradle.plugin)
    }
}