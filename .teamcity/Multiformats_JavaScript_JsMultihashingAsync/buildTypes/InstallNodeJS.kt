package Multiformats_JavaScript_JsMultihashingAsync.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object InstallNodeJS : BuildType({
    template(_Root.buildTypes.Multiformats_JavaScript_JsMultiaddr_InstallNodejs6debian)
    uuid = "5d83d3b8-498c-44b9-8275-481d97721b19"
    extId = "Multiformats_JavaScript_JsMultihashingAsync_InstallNodeJS"
    name = "Install NodeJS"
})
