plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.finalprojectmobileapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.finalprojectmobileapplication"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures {
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

configurations {
    create("cleanedAnnotations")
    implementation {
        exclude(group = "org.jetbrains", module = "annotations")
    }
}


dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.auth)
    implementation(libs.firebase.database)
//    implementation(libs.core)
    implementation(libs.firebase.encoders.json)
//    implementation(libs.google.material)
    implementation(libs.circleimageview)
    implementation(libs.circleindicator)
    implementation(libs.gson)
    implementation(libs.eventbus)
    implementation(libs.exoplayer)
    implementation(libs.flexbox)
    implementation(libs.paypal.android.sdk)

//    implementation(libs.android.core)

    implementation(libs.glide)
    implementation(libs.material.dialogs)
    implementation(libs.flowlayout)
    implementation(libs.zxing.core)
    implementation(libs.zxing.embedded)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}