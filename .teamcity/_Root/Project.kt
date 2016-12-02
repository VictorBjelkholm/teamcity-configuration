package _Root

import _Root.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "e0e566ea-1e08-48ba-8db9-b0ccb8890dc1"
    extId = "_Root"
    name = "<Root project>"
    description = "Contains all other projects"

    template(Multiformats_JavaScript_JsMultiaddr_RunJavascriptTests)
    template(Multiformats_JavaScript_JsMultiaddr_InstallJavascriptDependencies)
    template(Multiformats_JavaScript_JsMultiaddr_InstallNodejs6debian)

    cleanup {
        preventDependencyCleanup = false
    }
})
