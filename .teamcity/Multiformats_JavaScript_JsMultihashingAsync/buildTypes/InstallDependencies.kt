package Multiformats_JavaScript_JsMultihashingAsync.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object InstallDependencies : BuildType({
    template(_Root.buildTypes.InstallJavascriptDependencies)
    uuid = "33a028c8-9d93-49d1-b2bd-7b46fe9a0cc3"
    extId = "Multiformats_JavaScript_JsMultihashingAsync_InstallDependencies"
    name = "Install Dependencies"

    vcs {
        root(Multiformats_JavaScript_JsMultihashingAsync.vcsRoots.Multiformats_JavaScript_JsMultihashingAsync_HttpsGithubComMultiformatsJsMultihas)

    }

    dependencies {
        dependency(Multiformats_JavaScript_JsMultihashingAsync.buildTypes.Multiformats_JavaScript_JsMultihashingAsync_InstallNodeJS) {
            snapshot {
                runOnSameAgent = true
            }
        }
    }
})
