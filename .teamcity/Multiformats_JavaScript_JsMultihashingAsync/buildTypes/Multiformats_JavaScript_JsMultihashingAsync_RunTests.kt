package Multiformats_JavaScript_JsMultihashingAsync.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object RunTests : BuildType({
    template(_Root.buildTypes.RunJavascriptTests)
    uuid = "9942bf1a-c084-495c-9829-9ac3353866c6"
    extId = "Multiformats_JavaScript_JsMultihashingAsync_RunTests"
    name = "Run Tests"

    vcs {
        root(Multiformats_JavaScript_JsMultihashingAsync.vcsRoots.Multiformats_JavaScript_JsMultihashingAsync_HttpsGithubComMultiformatsJsMultihas)

    }

    dependencies {
        dependency(Multiformats_JavaScript_JsMultihashingAsync.buildTypes.Multiformats_JavaScript_JsMultihashingAsync_InstallDependencies) {
            snapshot {
                runOnSameAgent = true
            }
        }
        dependency(Multiformats_JavaScript_JsMultihashingAsync.buildTypes.Multiformats_JavaScript_JsMultihashingAsync_InstallNodeJS) {
            snapshot {
                runOnSameAgent = true
            }
        }
    }
})
