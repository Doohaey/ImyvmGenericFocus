package com.imyvm.genefocus

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents
import org.slf4j.LoggerFactory

object ImyvmGenericFocus : ModInitializer {
    private val logger = LoggerFactory.getLogger("imyvm-generic-focus")

	override fun onInitialize() {
		logger.info("Initializing Imyvm Generic Focus...")

		logger.info("Imyvm Generic Focus initialized successfully!")
	}
}