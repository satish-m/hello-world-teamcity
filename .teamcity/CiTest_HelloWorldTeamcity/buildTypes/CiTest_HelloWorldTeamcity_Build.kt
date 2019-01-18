package CiTest_HelloWorldTeamcity.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object CiTest_HelloWorldTeamcity_Build : BuildType({
    uuid = "0b318867-f8e5-44a4-a123-8ad2b215178d"
    id = "CiTest_HelloWorldTeamcity_Build"
    name = "Build"

    vcs {
        root(CiTest_HelloWorldTeamcity.vcsRoots.CiTest_HelloWorldTeamcity_HttpsGithubComSatishMHelloWorldTeamcityRefsHeadsMaster)

    }

    steps {
        maven {
            goals = "clean test"
            mavenVersion = defaultProvidedVersion()
            jdkHome = "%env.JDK_18%"
        }
    }

    triggers {
        vcs {
        }
    }
})
