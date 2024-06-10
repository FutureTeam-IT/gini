plugins {
    id("gini.common-conventions")
    id("gini.publish-conventions")
}

dependencies {
    implementation("com.zaxxer:HikariCP:5.1.0")
    compileOnly("io.papermc.paper:paper-api:1.20.6-R0.1-SNAPSHOT")
}
