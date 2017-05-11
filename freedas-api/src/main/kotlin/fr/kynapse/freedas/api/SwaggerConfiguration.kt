package fr.kynapse.freedas.api

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.RequestMethod
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.builders.ResponseMessageBuilder
import springfox.documentation.schema.ModelRef
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2


/**
 * <h1>Swagger 2 Configuration</h1>
 */
@Configuration
@EnableSwagger2
open class SwaggerConfiguration {


    @Bean
    open fun api(): Docket =
            Docket(DocumentationType.SWAGGER_2).
                    select().
                    apis(RequestHandlerSelectors.basePackage("fr.kynapse.freedas.api.controller")).
                    paths(PathSelectors.any()).
                    build().
                    apiInfo(ApiInfo("FreeDaS API", "Somme FreeDaS API description", "v1", "Terms of service", "gregory.prince@kynapse.fr", "License...", "API license URL")).
                    useDefaultResponseMessages(false).
                    globalResponseMessage(
                            RequestMethod.GET,
                            arrayListOf(
                                    ResponseMessageBuilder().
                                            code(500).message("Oh what a shame! Sorry, ou server was Crash...").
                                            responseModel(ModelRef("Error")).
                                            build(),
                                    ResponseMessageBuilder().
                                            code(403).message("Ah ah ah! Sorry, but you didn't say the magic word...").
                                            build()))

}