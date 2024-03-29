plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.judas"
    compileSdk = 34

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }

    defaultConfig {
        applicationId = "com.example.judas"
        minSdk = 24
        targetSdk = 33
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

}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("androidx.navigation:navigation-fragment:2.3.0")
    implementation ("androidx.navigation:navigation-ui:2.3.0")
    implementation ("androidx.viewpager2:viewpager2:1.0.0")
    implementation ("com.google.android.material:material:1.3.0-alpha03")
    implementation ("com.google.android.material:material:1.4.0")
    implementation ("androidx.navigation:navigation-fragment:2.3.0")
    implementation ("androidx.navigation:navigation-ui:2.3.0")
    implementation ("androidx.viewpager2:viewpager2:1.0.0")
    implementation ("com.google.android.material:material:1.3.0-alpha03")
    implementation ("com.google.android.exoplayer:exoplayer-core:2.11.5")
    implementation ("com.google.android.exoplayer:exoplayer-dash:2.11.5")
    implementation ("com.google.android.exoplayer:exoplayer-ui:2.11.5")
    implementation ("com.google.android.exoplayer:exoplayer-hls:2.11.5")
    implementation ("com.google.android.exoplayer:exoplayer-smoothstreaming:2.11.5")
    implementation ("com.google.android.exoplayer:exoplayer:2.15.1")
    implementation ("com.google.android.exoplayer:exoplayer-core:2.X.X")
    implementation ("com.google.android.exoplayer:exoplayer-ui:2.X.X")
    implementation ("com.google.android.exoplayer:exoplayer-core:2.X.X")
    implementation ("com.google.android.exoplayer:exoplayer-dash:2.X.X")
    implementation ("com.google.android.exoplayer:exoplayer-ui:2.X.X")
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")
    implementation ("com.google.android.material:material:1.5.0")


}