package _Root.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object InstallNodejs6debian : Template({
    uuid = "c3589e09-0a1c-448a-8338-d9f7def0333d"
    extId = "Multiformats_JavaScript_JsMultiaddr_InstallNodejs6debian"
    name = "install-nodejs-6-debian"

    steps {
        script {
            name = "Install NodeJS"
            id = "RUNNER_4"
            scriptContent = """
                which node > /dev/null && exit 0 # exit early if node already exists
                curl -sL https://deb.nodesource.com/setup_6.x | bash -
                apt-get install -y nodejs
            """.trimIndent()
        }
    }
})
