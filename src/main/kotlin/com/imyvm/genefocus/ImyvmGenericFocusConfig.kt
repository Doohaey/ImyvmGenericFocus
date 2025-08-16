package com.imyvm.genefocus

import com.imyvm.hoki.config.ConfigOption
import com.imyvm.hoki.config.HokiConfig
import com.imyvm.hoki.config.Option
import com.typesafe.config.Config

class ImyvmGenericFocusConfig : HokiConfig("imyvm-generic-focus.conf") {
    companion object {
        @JvmField
        @ConfigOption
        val LANGUAGE = Option(
            "core.imyvm-generic-focus.language",
            "en_US",
            "The language setting for the mod."
        ) { obj: Config, path : String? ->
            obj.getString(path)
        }
    }

}