plugins {
    id("java")
    id("maven-publish")
    id("io.github.goooler.shadow") version "8.1.8"
}

version = "1.0.0"

repositories {
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.yaml:snakeyaml:2.2")
    implementation("mysql:mysql-connector-java:8.0.33")
}

tasks.build {
    dependsOn(tasks.shadowJar)
}

publishing.publications.create<MavenPublication>("maven") {
    artifact(tasks["shadowJar"])
}

tasks.shadowJar {
    manifest {
        attributes("Main-Class" to "wordle.project.Wordle")
    }
}