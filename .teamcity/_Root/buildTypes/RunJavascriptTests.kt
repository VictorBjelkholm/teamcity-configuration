package _Root.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object RunJavascriptTests : Template({
    uuid = "d07ba884-4a37-46f9-8a0d-6dcae31e735f"
    extId = "RunJavascriptTests"
    name = "run-javascript-tests"

    steps {
        script {
            name = "Run JavaScript Tests"
            id = "RUNNER_6"
            scriptContent = "npm run test:node"
        }
    }
})
