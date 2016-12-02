package _Root.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object Multiformats_JavaScript_JsMultiaddr_InstallJavascriptDependencies : Template({
    uuid = "f7400eec-b0c2-44ba-84d8-20e772d8beef"
    extId = "Multiformats_JavaScript_JsMultiaddr_InstallJavascriptDependencies"
    name = "install-javascript-dependencies"

    steps {
        script {
            name = "Install JavaScript Dependencies"
            id = "RUNNER_5"
            scriptContent = "npm install"
        }
    }
})
