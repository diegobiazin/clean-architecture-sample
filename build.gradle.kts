import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
	repositories {
		mavenCentral()
	}

	dependencies {
		classpath("io.spring.gradle:dependency-management-plugin:1.0.11.RELEASE")
	}
}

plugins {
	id("org.springframework.boot") version "2.5.4" apply false
	id("io.spring.dependency-management") version "1.0.11.RELEASE" apply false
	kotlin("jvm") version "1.5.21" apply false
	kotlin("plugin.spring") version "1.5.21" apply false
}

allprojects {
	group = "com.diegobiazin"
	version = "0.0.1-SNAPSHOT"

	repositories {
		mavenCentral()
	}

	tasks.withType<JavaCompile> {
		sourceCompatibility = "11"
		targetCompatibility = "11"
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs = listOf("-Xjsr305=strict")
			jvmTarget = "11"
		}
	}
}

subprojects {
	repositories {
		mavenCentral()
	}

	apply {
		plugin("org.springframework.boot")
		plugin("io.spring.dependency-management")
		plugin("kotlin")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
