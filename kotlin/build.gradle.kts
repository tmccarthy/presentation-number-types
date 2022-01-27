plugins {
  java
  kotlin("jvm") version "1.6.10"
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.typelevel:spire_3:0.18.0-M3")

  testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
  testImplementation("org.assertj:assertj-core:3.22.0")
}

tasks.named<Test>("test") {
  // Use JUnit Platform for unit tests.
  useJUnitPlatform()
}
