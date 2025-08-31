plugins {
    kotlin("jvm") version "2.2.0"
    application
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.squareup.retrofit2:retrofit:2.9.0") // HTTP client
    implementation("com.squareup.retrofit2:converter-gson:2.9.0") // JSON parser
    implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")
}

application {
    mainClass.set("org.example.MainKt")
}

kotlin {
    jvmToolchain (24)
}
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(24))
    }
}