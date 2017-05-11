package fr.kynapse.freedas.api.controller

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
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

    @RequestMapping(value = "/{name}", method = arrayOf(GET))
    @ResponseBody
    @ApiOperation(
            value = "Say Hello",
            response = String::class,
            tags = arrayOf("hello", "fun")
    )
    fun sayHello(@PathVariable("name") name: String) = "Hello $name from FreeDaS"
}