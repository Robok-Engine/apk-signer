plugins {
  `maven-publish`
  `java-library`
}

group = "org.robok"
version = libs.versions.lib.version.get()

java {
  sourceCompatibility = JavaVersion.VERSION_17
  targetCompatibility = JavaVersion.VERSION_17
}

afterEvaluate {
  publishing {
    publications {
      register("mavenRelease", MavenPublication::class) {
        groupId = "org.robok"
        artifactId = "apk-signer"
        version = libs.versions.lib.version.get()
        from(components["java"])
      }
    }
  }
}