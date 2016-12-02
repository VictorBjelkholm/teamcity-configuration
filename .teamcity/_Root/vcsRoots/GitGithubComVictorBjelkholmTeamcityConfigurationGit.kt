package _Root.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object GitGithubComVictorBjelkholmTeamcityConfigurationGit : GitVcsRoot({
    uuid = "8885d93b-98c4-4899-9d44-7fb7e0c90891"
    extId = "GitGithubComVictorBjelkholmTeamcityConfigurationGit"
    name = "git@github.com:VictorBjelkholm/teamcity-configuration.git"
    url = "git@github.com:VictorBjelkholm/teamcity-configuration.git"
    authMethod = defaultPrivateKey {
    }
})
