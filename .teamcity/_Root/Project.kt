package _Root

import _Root.buildTypes.*
import _Root.vcsRoots.*
import _Root.vcsRoots.GitGithubComVictorBjelkholmTeamcityConfigurationGit
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "cd4c2c9e-f22f-4c50-a2eb-f30afe2addea"
    extId = "_Root"
    name = "<Root project>"
    description = "Contains all other projects"

    vcsRoot(GitGithubComVictorBjelkholmTeamcityConfigurationGit)

    template(Multiformats_JavaScript_JsMultiaddr_RunJavascriptTests)
    template(Multiformats_JavaScript_JsMultiaddr_InstallJavascriptDependencies)
    template(Multiformats_JavaScript_JsMultiaddr_InstallNodejs6debian)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = GitGithubComVictorBjelkholmTeamcityConfigurationGit.extId
            showChanges = true
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }

    cleanup {
        preventDependencyCleanup = false
    }
})
