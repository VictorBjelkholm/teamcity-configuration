package Multiformats_JavaScript_JsMultiaddr.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object RunTests : BuildType({
    template(_Root.buildTypes.RunJavascriptTests)
    uuid = "82243eb5-2677-4a61-a0ea-5fef47404e93"
    extId = "Multiformats_JavaScript_JsMultiaddr_RunTests"
    name = "Run Tests"

    vcs {
        root(Multiformats_JavaScript_JsMultiaddr.vcsRoots.Multiformats_JavaScript_JsMultiaddr_HttpGithubComMultiformatsJsMultiaddrRefsHead)

    }

    dependencies {
        dependency(Multiformats_JavaScript_JsMultiaddr.buildTypes.InstallDependencies) {
            snapshot {
                runOnSameAgent = true
            }
        }
        dependency(Multiformats_JavaScript_JsMultiaddr.buildTypes.InstallNodeJS) {
            snapshot {
                runOnSameAgent = true
            }
        }
    }
})
