package fr.kynapse.freedas.api.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod.GET
import org.springframework.web.bind.annotation.ResponseBody

/**
 * <h1>Simple bootstrapped Hello Controller :: Just for Fun :D</h1>
 */
@Controller
@RequestMapping("/hello")
class HelloSpringBootController {

    @RequestMapping( value = "/{name}", method = arrayOf(GET))
    @ResponseBody
    fun hello(@PathVariable("name") name: String) = "Hello $name"
}