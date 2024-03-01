plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.coding.studentsparks"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.coding.studentsparks"
        minSdk = 21
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }


    dependencies {

        implementation("androidx.appcompat:appcompat:1.6.1")
        implementation("androidx.credentials:credentials:1.3.0-alpha01")

        // optional - needed for credentials support from play services, for devices running
        // Android 13 and below.
        implementation("androidx.credentials:credentials-play-services-auth:1.3.0-alpha01")
        implementation(platform("com.google.firebase:firebase-bom:32.7.1"))
        implementation("com.google.android.libraries.identity.googleid:googleid:1.1.0")
        implementation("com.google.firebase:firebase-analytics")
        implementation("com.google.android.material:material:1.11.0")
        implementation("androidx.constraintlayout:constraintlayout:2.1.4")
        implementation("androidx.preference:preference:1.2.0")
        implementation("androidx.gridlayout:gridlayout:1.0.0")
        implementation("androidx.navigation:navigation-ui:2.7.7")
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
        implementation("com.google.android.gms:play-services-auth:21.0.0")

        implementation("androidx.core:core-splashscreen:1.0.0")



    }
}
dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.annotation:annotation:1.7.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.media3:media3-common:1.2.1")
}
