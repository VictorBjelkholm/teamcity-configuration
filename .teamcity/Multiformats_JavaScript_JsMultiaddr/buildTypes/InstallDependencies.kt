package Multiformats_JavaScript_JsMultiaddr.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object InstallDependencies : BuildType({
    template(_Root.buildTypes.InstallJavascriptDependencies)
    uuid = "e44ea349-5900-4f03-9933-b8f9c223395d"
    extId = "InstallDependencies"
    name = "Install Dependencies"

    vcs {
        root(Multiformats_JavaScript_JsMultiaddr.vcsRoots.Multiformats_JavaScript_JsMultiaddr_HttpGithubComMultiformatsJsMultiaddrRefsHead)

    }

    dependencies {
        dependency(Multiformats_JavaScript_JsMultiaddr.buildTypes.Multiformats_JavaScript_JsMultiaddr_InstallNodeJS) {
            snapshot {
                runOnSameAgent = true
            }
        }
    }
})
