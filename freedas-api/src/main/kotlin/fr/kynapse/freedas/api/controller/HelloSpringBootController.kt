package fr.kynapse.freedas.api.controller

import fr.kynapse.freedas.api.model.Message
import io.swagger.annotations.Api
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod.GET
import org.springframework.web.bind.annotation.ResponseBody

/**
 * <h1>Simple bootstrapped Hello Controller :: Just for Fun :D</h1>
 */
@Controller
@RequestMapping(value = "/sayHello")
@Api(value = "Hello from FreeDaS", tags = arrayOf("Hello from FreeDaS"), description = "Simple foo Controller to say Hello from FreeDaS :smile:")
class HelloSpringBootController {

    @RequestMapping(value = "/{name}", method = arrayOf(GET), produces = arrayOf(MediaType.APPLICATION_JSON_UTF8_VALUE))
    @ResponseBody
    fun sayHello(@PathVariable("name") name: String): Message = Message("Hello $name from FreeDaS")
}