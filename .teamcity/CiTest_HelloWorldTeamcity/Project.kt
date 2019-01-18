package CiTest_HelloWorldTeamcity

import CiTest_HelloWorldTeamcity.buildTypes.*
import CiTest_HelloWorldTeamcity.vcsRoots.*
import CiTest_HelloWorldTeamcity.vcsRoots.CiTest_HelloWorldTeamcity_HttpsGithubComSatishMHelloWorldTeamcityRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "61db6a5b-89e4-4aa6-831e-1ee9eed8ae06"
    id = "CiTest_HelloWorldTeamcity"
    parentId = "CiTest"
    name = "Hello World Teamcity"

    vcsRoot(CiTest_HelloWorldTeamcity_HttpsGithubComSatishMHelloWorldTeamcityRefsHeadsMaster)

    buildType(CiTest_HelloWorldTeamcity_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = CiTest_HelloWorldTeamcity_HttpsGithubComSatishMHelloWorldTeamcityRefsHeadsMaster.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
