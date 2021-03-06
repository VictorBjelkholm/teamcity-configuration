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

    buildType(InstallNodeJS)
    buildType(InstallDependencies)
    buildType(RunTests)

    buildTypesOrder = arrayListOf(
            Multiformats_JavaScript_JsMultiaddr.buildTypes.InstallNodeJS,
            Multiformats_JavaScript_JsMultiaddr.buildTypes.InstallDependencies,
            Multiformats_JavaScript_JsMultiaddr.buildTypes.RunTests
    )
})
