![travis CI:build status](https://travis-ci.org/gprince/FreeDaS.svg) [![Coverage Status](https://coveralls.io/repos/github/gprince/FreeDaS/badge.svg?branch=master)](https://coveralls.io/github/gprince/FreeDaS?branch=master) [![Stories in Ready](https://badge.waffle.io/gprince/FreeDaS.png?label=ready&title=Ready)](https://waffle.io/gprince/FreeDaS?utm_source=badge)

# FreeDaS

a Freemium Data Science authoring platform


## Building

This project use Kotlin 1.1.2-2

To build:

```
mvn clean package
```

This produces an exectuable jar in the `target` folder.

To run:

```
java -jar target/freedas-api-0.0.1-SNAPSHOT.jar
```

## API documentation

[Swagger 2 API Docs](http://localhost:8080/freedas/v1/v2/api-docs)

[Browse in Swagger UI](http://localhost:8080/freedas/v1/swagger-ui.html)
