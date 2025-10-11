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
    compileOnly("org.projectlombok:lombok:1.18.42")
    annotationProcessor("org.projectlombok:lombok:1.18.42")


    // DB
    implementation("mysql:mysql-connector-java:8.0.33")
    implementation("com.h2database:h2:2.4.240")

    // Testing
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
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