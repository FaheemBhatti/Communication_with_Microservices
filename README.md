# Communication_with_Microservices

 [![License](https://img.shields.io/badge/License-propriety-blue.svg)](https://opensource.org/licenses/Apache-2.0)

## Installation
There are two microservices named as apple and samsung, first we have to start those services to make the data available for the store application.

To run those two services copy and paste bash commands below

```bash
git clone https://github.com/FaheemBhatti/Communication_with_Microservices.git
cd Communication_with_Microservices
```
Starting first service
```bash
cd Apple
mvn install
cd target
java -jar Apple-0.0.1-SNAPSHOT.jar
```
Our apple microservice is up on https://localhost:8082/devices

Starting second service

```bash
cd Samsung
mvn install
cd target
java -jar Samsung-0.0.1-SNAPSHOT.jar 
```
Our samsung microservice is up on https://localhost:8081/devices

Starting store application
```bash
cd Store_APP
mvn install
cd target
java -jar  web-thymeleaf-1.0.jar
```

## Usage
Go to your favourite browser and type url: https://localhost:8080

P.S: Now you know I am not a frond-end developer and no effort was made to make it appealing. Moreover to have a better discovery of microservices ```Eureka server``` will be added later on, depends on time availability. 

