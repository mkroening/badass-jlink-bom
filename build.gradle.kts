plugins {
    application
    id("org.javamodularity.moduleplugin") version "1.4.1"
    id("org.beryx.jlink") version "2.6.6"
}

repositories {
    jcenter()
}

dependencies {
    implementation("com.google.code.gson:gson:2.8.5")
    implementation("dom4j:dom4j:1.6.1")
}

application {
    mainClassName = "$moduleName/io.github.mkroening.badassjlinkbom.App"
}
