package io.github.ttypic.swiftklib.gradle.templates

internal fun createPackageSwiftContents(
    cinteropName: String,
): String = """
    // swift-tools-version:5.5
    import PackageDescription

    let package = Package(
        name: "$cinteropName",
        platforms: [.iOS(.v13),
                    .macOS(.v11)],
        products: [
            .library(
                name: "$cinteropName",
                type: .static,
                targets: ["$cinteropName"])
        ],
        dependencies: [
        .package(name: "onnxruntime", url: "https://github.com/microsoft/onnxruntime-swift-package-manager", .exact("1.19.2")),
        ],
        targets: [
            .target(
                name: "$cinteropName",
                dependencies: ["onnxruntime"],
                path: "$cinteropName")
        ]
    )
""".trimIndent()
