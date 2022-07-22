package com.artingame.logger


import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LoggerController {
    @PostMapping(value = ["/trading-view"])
    fun logging(@RequestBody value:String):String{
        LOGGER.warn("trading webhook result - {}", value);
        return value
    }
    companion object{
        private val LOGGER=LoggerFactory.getLogger(javaClass)
    }
}