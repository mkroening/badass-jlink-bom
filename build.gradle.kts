plugins {
    application
    id("org.javamodularity.moduleplugin") version "1.4.1"
    id("org.beryx.jlink") version "2.6.6"
}

repositories {
    jcenter()
}

dependencies {
    // import a BOM
    implementation(platform("org.springframework.boot:spring-boot-dependencies:2.1.3.RELEASE"))

    // define dependencies without versions
    implementation("com.google.code.gson:gson")
    implementation("dom4j:dom4j")
}

application {
    mainClassName = "$moduleName/io.github.mkroening.badassjlinkbom.App"
}
