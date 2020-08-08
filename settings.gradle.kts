plugins {
    id("com.gradle.enterprise") version "3.3.1"
}

rootProject.name = "bowler-display"

include(":logging")
include(":proto")
include(":testUtil")
include(":util")

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}
