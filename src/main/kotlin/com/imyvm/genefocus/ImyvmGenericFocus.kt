package com.imyvm.genefocus

import com.imyvm.genefocus.ImyvmGenericFocus.Companion.CONFIG
import com.imyvm.genefocus.ImyvmGenericFocus.Companion.logger
import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory
import org.slf4j.Logger

class ImyvmGenericFocus : ModInitializer {
	override fun onInitialize() {
		logger.info("Initializing Imyvm Generic Focus...")

		CONFIG.loadAndSave()

		logger.info("Imyvm Generic Focus initialized successfully!")
	}

	companion object {
		const val MOD_ID = "imyvm_generic_focus"

		@JvmField
		val logger: Logger = LoggerFactory.getLogger(MOD_ID)
		val CONFIG: ImyvmGenericFocusConfig = ImyvmGenericFocusConfig()

	}
}