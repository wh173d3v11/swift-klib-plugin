plugins {
    id("java-gradle-plugin")
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.gradle.publish)
}

dependencies {
    implementation(gradleApi())
    implementation(libs.plugin.kotlin)

    testImplementation(gradleTestKit())
    testImplementation(libs.test.junit.jupiter)
    testImplementation(libs.test.kotest.assertions)
    testRuntimeOnly(libs.test.junit.jupiter.launcher)
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

version = "0.7.0-dev"
group = "io.github.wh173d3v11"

kotlin {
    jvmToolchain(17)
}

@Suppress("UnstableApiUsage")
gradlePlugin {
    website = "https://github.com/wh173d3v11/swift-klib-plugin"
    vcsUrl = "https://github.com/wh173d3v11/swift-klib-plugin"

    plugins {
        create("swiftklib") {
            id = "io.github.wh173d3v11.swiftklib"
            displayName = "SwiftKlib Gradle Plugin"
            description = "Gradle Plugin to inject Swift-code for Kotlin Multiplatform iOS target"
            implementationClass = "io.github.wh173d3v11.swiftklib.gradle.SwiftKlibPlugin"
            tags = listOf("kotlin-multiplatform", "swift")
        }
    }
}
