plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("8.5.0").apply(false)
    id("com.android.library").version("8.5.0").apply(false)
    kotlin("android").version("2.0.21-RC").apply(false)
    id("org.jetbrains.kotlin.plugin.compose").version("2.0.21-RC").apply(false)
    kotlin("multiplatform").version("2.0.21-RC").apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
