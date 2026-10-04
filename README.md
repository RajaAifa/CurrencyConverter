# Currency Converter

A Java SOAP web service project built with JAX-WS and deployed on GlassFish, exposing two independent web services: a simple greeting service and a Dinar/Euro currency converter.

## Overview

This project demonstrates SOAP-based web service development using Java EE (JAX-WS). It exposes two web services:

- **HelloService:** a greeting service that returns a personalized "Hello" message for a given name.
- **ConvertisseurMonnaieService:** a currency conversion service that converts amounts between Tunisian Dinar (TND) and Euro (EUR) using a fixed exchange rate.

## Technologies Used

- **Language:** Java 1.8
- **Web Services:** JAX-WS (`javax.jws` — `@WebService`, `@WebMethod`)
- **Application Server:** GlassFish (Java EE 7 Web Profile)
- **Build Tool:** Apache Ant (NetBeans project)
- **IDE:** NetBeans

## Prerequisites

- JDK 8
- GlassFish Server (4.x or compatible with Java EE 7 Web Profile)
- NetBeans IDE (recommended, includes Ant build integration) or Apache Ant

## Run Locally

Clone the repository:

    git clone https://github.com/RajaAifa/CurrencyConverter.git

Go to the project directory:

    cd CurrencyConverter/HelloWorldService5

Open the folder in NetBeans (**File > Open Project**), or build it directly with Ant:

    ant build

### Deploy to GlassFish

Deploy the generated WAR file (`dist/HelloWorldService5.war`) to your GlassFish domain, or run the project from NetBeans, which starts GlassFish and deploys the app automatically.

### Access the services

Once deployed, the WSDL of each service is available at:

    http://localhost:8080/HelloWorldService5/HelloService?wsdl
    http://localhost:8080/HelloWorldService5/ConvertisseurMonnaieService?wsdl

## How to Use

**HelloService**

- `sayHello(String name)` returns `"Hello " + name + " !"`.

**ConvertisseurMonnaieService**

- `dinarToEuro(double dinar)` converts an amount in Dinar to Euro (rate: 1 TND = 0.30 EUR).
- `euroToDinar(double euro)` converts an amount in Euro to Dinar.

Both services can be tested from the GlassFish auto-generated tester page:

    http://localhost:8080/HelloWorldService5/HelloService?Tester
    http://localhost:8080/HelloWorldService5/ConvertisseurMonnaieService?Tester

## Project Structure

    CurrencyConverter/
    ├── README.md
    └── HelloWorldService5/
        ├── src/java/soa/tp1/service/
        │   ├── Hello.java                  # Greeting SOAP web service
        │   └── ConvertisseurMonnaie.java   # Currency conversion SOAP web service
        ├── web/
        │   ├── index.html                  # Landing page
        │   └── WEB-INF/web.xml             # Deployment descriptor
        ├── nbproject/                      # NetBeans project configuration
        ├── build.xml                       # Ant build script
        └── dist/HelloWorldService5.war     # Deployable WAR archive
