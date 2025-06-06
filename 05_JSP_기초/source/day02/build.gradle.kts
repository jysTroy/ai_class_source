plugins {
    id("java")
}

group = "org.koreait"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.38")
    compileOnly("jakarta.servlet.jsp:jakarta.servlet.jsp-api:4.0.0")
    compileOnly("jakarta.servlet:jakarta.servlet-api:6.1.0")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}