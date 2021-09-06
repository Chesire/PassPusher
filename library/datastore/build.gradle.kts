plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = 30
    defaultConfig {
        minSdk = 21
        targetSdk = 30

        consumerProguardFiles("consumer-rules.pro")
    }
}
