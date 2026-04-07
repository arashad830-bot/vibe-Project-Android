plugins {
    id("com.android.application") version "8.0.0"
    kotlin("android") version "1.8.0"
}

android {
    namespace = "com.vibeproject"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.vibeproject"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
}
