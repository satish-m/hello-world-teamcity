package CiTest_HelloWorldTeamcity.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object CiTest_HelloWorldTeamcity_HttpsGithubComSatishMHelloWorldTeamcityRefsHeadsMaster : GitVcsRoot({
    uuid = "c6c42baa-ea65-4ca0-a50c-530f6edfc6b4"
    id = "CiTest_HelloWorldTeamcity_HttpsGithubComSatishMHelloWorldTeamcityRefsHeadsMaster"
    name = "https://github.com/satish-m/hello-world-teamcity#refs/heads/master"
    url = "https://github.com/satish-m/hello-world-teamcity"
    authMethod = password {
        userName = "satish-m"
        password = "credentialsJSON:c816a2cf-41bf-4993-b9e6-629f5a11d2f3"
    }
})
