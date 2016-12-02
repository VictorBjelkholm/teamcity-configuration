package Multiformats_JavaScript_JsMultiaddr.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object InstallNodeJS : BuildType({
    template(_Root.buildTypes.InstallNodejs6debian)
    uuid = "cac3f408-a294-472f-ba54-468bb369ab55"
    extId = "Multiformats_JavaScript_JsMultiaddr_InstallNodeJS"
    name = "Install NodeJS"
})
