package Multiformats_JavaScript_JsMultihashingAsync

import Multiformats_JavaScript_JsMultihashingAsync.buildTypes.*
import Multiformats_JavaScript_JsMultihashingAsync.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "6bee9136-4151-42fd-b1ef-8985f599fc38"
    extId = "Multiformats_JavaScript_JsMultihashingAsync"
    parentId = "Multiformats_JavaScript"
    name = "js-multihashing-async"

    vcsRoot(Multiformats_JavaScript_JsMultihashingAsync_HttpsGithubComMultiformatsJsMultihas)

    buildType(Multiformats_JavaScript_JsMultihashingAsync_InstallNodeJS)
    buildType(InstallDependencies)
    buildType(RunTests)

    buildTypesOrder = arrayListOf(
            Multiformats_JavaScript_JsMultihashingAsync.buildTypes.Multiformats_JavaScript_JsMultihashingAsync_InstallNodeJS,
            Multiformats_JavaScript_JsMultihashingAsync.buildTypes.InstallDependencies,
            Multiformats_JavaScript_JsMultihashingAsync.buildTypes.RunTests
    )
})
