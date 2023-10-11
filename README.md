# Dillinger
## _The Last Markdown Editor, Ever_

[![N|Solid](https://cldup.com/dTxpPi9lDf.thumb.png)](https://nodesource.com/products/nsolid)

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Dillinger is a cloud-enabled, mobile-ready, offline-storage compatible,
AngularJS-powered HTML5 Markdown editor.

- Type some Markdown on the left
- See HTML in the right
- ✨Magic ✨

## Features

# Getting Started

## Project

Implementation of paciente microservice for the Safh application.
The paciente microservice provides the following functionalities:
- Registrar Paciente
- Obtener Todos los Pacientes
- Obtenr Paciente
- Eliminar Paciente
- 

The following scripts are provided for the MongoDB database/collections creation:
* usuariodb_creation.js
* estado_collection.js
* tipo_domicilio_collection.js
* load_collections_data.js


## Deploy

`// TODO `

## Test

Execute the next `curl` command to validate the deploy of the service. 

- Registrar Paciente

```shell
curl -X 'POST' \
  'http://localhost:8082/api/pacientes/registro' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{"paciente": {"nombre": "Prueba","telefonoCelular": "11-11-11-11","ultimoIngreso": "28/10/2016"},"domicilio": {"calle": "Olivo2","numExterior": "102","numInterior": "A202"}}'
```

The expected result should looks like:

```
{
  "id": "65260ea2c730a617f0b1aa28",
  "nombre": "Prueba",
  "telefonoCelular": "11-11-11-11",
  "ultimoIngreso": "28/10/2016",
  "domicilios": [
    {
      "calle": "Olivo2",
      "numExterior": "102",
      "numInterior": "A202"
    }
  ]
}
```

- Obtener Todos los Pacientes
```shell
curl -X 'GET' \
  'http://localhost:8082/api/pacientes' \
  -H 'accept: application/json'
```

The expected result should looks like:

```
[
  {
    "id": "652541dd6b50cf6125fa7426",
    "nombre": "Pedro",
    "telefonoCelular": "32-23-34-32",
    "ultimoIngreso": "28/10/2012",
    "domicilios": [
      {
        "calle": "Fresno",
        "numExterior": "107",
        "numInterior": "A201"
      }
    ]
  },
  {
    "id": "6525d9615fd1344e714d29d4",
    "nombre": "Luis",
    "telefonoCelular": "32-23-11-55",
    "ultimoIngreso": "28/10/2015",
    "domicilios": [
      {
        "calle": "Olivo",
        "numExterior": "107",
        "numInterior": "A201"
      }
    ]
  },
  {
    "id": "6525e76ac57b397430f6dab4",
    "nombre": "Paco",
    "telefonoCelular": "32-23-11-00",
    "ultimoIngreso": "28/10/2015",
    "domicilios": [
      {
        "calle": "Olivo",
        "numExterior": "107",
        "numInterior": "A201"
      }
    ]
  },
  {
    "id": "65260ea2c730a617f0b1aa28",
    "nombre": "Prueba",
    "telefonoCelular": "11-11-11-11",
    "ultimoIngreso": "28/10/2016",
    "domicilios": [
      {
        "calle": "Olivo2",
        "numExterior": "102",
        "numInterior": "A202"
      }
    ]
  }
]
```

- Obtenr Paciente
```shell
curl -X 'GET' \
  'http://localhost:8082/api/pacientes/65260ea2c730a617f0b1aa28' \
  -H 'accept: application/json'
```

The expected result should looks like:

```
{
  "id": "65260ea2c730a617f0b1aa28",
  "nombre": "Prueba",
  "telefonoCelular": "11-11-11-11",
  "ultimoIngreso": "28/10/2016",
  "domicilios": [
    {
      "calle": "Olivo2",
      "numExterior": "102",
      "numInterior": "A202"
    }
  ]
}

Response head
```

- Eliminar Paciente
```shell
curl -X 'DELETE' \
  'http://localhost:8082/api/pacientes/65260ea2c730a617f0b1aa28' \
  -H 'accept: application/json'
```

The expected result should looks like:

```
204

 connection: keep-alive  date: Wed,11 Oct 2023 03:05:07 GMT  keep-alive: timeout=60  vary: Origin,Access-Control-Request-Method,Access-Control-Request-Headers 
Response head
```


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.15/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.15/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.15/reference/htmlsingle/index.html#web)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/2.7.15/reference/htmlsingle/index.html#data.nosql.mongodb)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)

