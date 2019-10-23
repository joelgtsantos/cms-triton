# cms-triton
[![Build Status](https://travis-ci.org/joelgtsantos/cms-triton.svg?branch=master)](https://travis-ci.org/joelgtsantos/cms-triton)

# Based on Zuul proxy from Netflix

Gateway service based on Zuul proxy server from Netflix handles all the HTTP requests between the CMS Frontend and the whole back-end architecture.

### How to use 

To run

```bash
$ mvn spring-boot:run
    
```

### Application properties

It's necessary to add some properties with the URL to the back-end orbit applications into the configuration file before running the application

- Triton port number
- CMS users-admin application URL
- CMS Galatea application URL
- CMS SAO application URL

### Docker Image

A docker image can be run by setting up the properties to the back-end orbit applications

```bash
$ docker run -t -i -e 'ZUUL_ROUTES_CMSUSERS_URL=http://localhost:8081' -e 'ZUUL_ROUTES_GALATEA_URL=http://localhost:8082' -e 'ZUUL_ROUTES_SAO_URL=http://localhost:8000' -p 9000:9000 joelgtsantos/cms-triton:latest

```