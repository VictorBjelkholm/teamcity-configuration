package Multiformats_JavaScript_JsMultiaddr

import Multiformats_JavaScript_JsMultiaddr.buildTypes.*
import Multiformats_JavaScript_JsMultiaddr.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "f4949ea1-4f90-4e28-8024-1514afd61d40"
    extId = "Multiformats_JavaScript_JsMultiaddr"
    parentId = "Multiformats_JavaScript"
    name = "js-multiaddr"

    vcsRoot(Multiformats_JavaScript_JsMultiaddr_HttpGithubComMultiformatsJsMultiaddrRefsHead)

    buildType(Multiformats_JavaScript_JsMultiaddr_InstallDependencies)
    buildType(RunTests)
    buildType(Multiformats_JavaScript_JsMultiaddr_InstallNodeJS)
    buildTypesOrder = arrayListOf(Multiformats_JavaScript_JsMultiaddr.buildTypes.Multiformats_JavaScript_JsMultiaddr_InstallNodeJS, Multiformats_JavaScript_JsMultiaddr.buildTypes.Multiformats_JavaScript_JsMultiaddr_InstallDependencies, Multiformats_JavaScript_JsMultiaddr.buildTypes.RunTests)
})
