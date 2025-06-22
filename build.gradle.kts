plugins {
    id("java")
    id("maven-publish")
}

group = "szuc.kqn"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

}

tasks.test {
    useJUnitPlatform()
}