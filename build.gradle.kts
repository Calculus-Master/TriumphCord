plugins {
    id("java")
}

group = "com.calculusmaster"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("net.dv8tion:JDA:5.0.0-beta.11")
    implementation("ch.qos.logback:logback-classic:1.2.9")
    implementation("org.apache.commons:commons-math3:3.6.1")
    implementation("org.mongodb:mongodb-driver-sync:4.8.2")
    implementation("org.jgrapht:jgrapht-core:1.5.2")
}

tasks.test {
    useJUnitPlatform()
}