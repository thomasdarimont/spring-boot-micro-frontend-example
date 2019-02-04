# Spring Boot Frontend Integration with ParcelJS 

This example demonstrates a simple approach for including a Javascript frontend in a Spring Boot App.

## Overview
The example contains 3 maven modules: 
* acme-example-api
* acme-example-ui-plain
* acme-example-app

The `acme-example-api` contains the backend API and the `acme-example-ui-plain` contains
the Javascript based frontend. Both modules are pulled in as a dependency by `acme-example-app`.

The `acme-example-ui-plain` maven module uses the `com.github.eirslett:frontend-maven-plugin`
to delegate to the yarn / node tooling during the maven build process. 

As a build tool we use `yarn` which delegates to the `parceljs` buil-tool.

## Setup
To build the example execute the following in your shell: 
```
mvn clean verify
```

## Running
To run the example execute the following in your shell: 
```
java -jar acme-example-app/target/*.jar
```

Then open http://localhost:8080/acme/app/ in your browser.

## Workflow

For development start the Spring Boot app `acme-example-app` in debug mode and run the `yarn watch` command 
in the `acme-example-ui-plain` folder. This will automatically rebuild the Javascript/CSS/html 
artifacts when any code beneath the `src/main/frontend` is changed. Source maps and Live-reload are 
also enabled by default.

For deployment simply build the `acme-example-app` maven project via `mvn clean verify` and run the resulting jar. 
The artifact from the `acme-example-ui-plain` module will be included in the generated fat-jar.
