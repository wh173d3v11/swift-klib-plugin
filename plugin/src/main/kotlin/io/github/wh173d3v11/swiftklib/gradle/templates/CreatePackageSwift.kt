package io.github.wh173d3v11.swiftklib.gradle.templates

internal fun createPackageSwiftContents(
    cinteropName: String,
): String = """
    // swift-tools-version:5.5
    import PackageDescription

    let package = Package(
        name: "$cinteropName",
        platforms: [.iOS(.v13)],
        products: [
            .library(
                name: "$cinteropName",
                type: .static,
                targets: ["$cinteropName"])
        ],
        dependencies: [],
        targets: [
            .target(
                name: "$cinteropName",
                dependencies: [],
                path: "$cinteropName")
        ]
    )
""".trimIndent()
