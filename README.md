# Lab 11

## Project's Title :
Songr:
application contain albums for artist 

## Description
application contain the albums for artist you can see each albums title ,who's songr ,the image for album .song count and length



# Lab-12: Spring and REST
## Overview
The requirement for this lab is how the user can add albums to the albums page by fill the forms.

## Router:
http://localhost:8081/addAlbum
This route is for a page that contains a form that users fill in to add albums to the album page.

##Getting Started
To run the app you shoud follow the folloing steps:
1) [Getting started with Spring](https://spring.io/guides/gs/serving-web-content/): This website show you how to build an application by Spring.
- This is the dependencies build.gradle file
  ```dependencies {
  implementation 'org.springframework.boot:spring-boot-starter-thymeleaf:2.5.5'
  implementation 'org.springframework.boot:spring-boot-starter-web:2.5.5'
  developmentOnly 'org.springframework.boot:spring-boot-devtools:2.5.5'
  testImplementation 'org.springframework.boot:spring-boot-starter-test:2.5.5'
  implementation 'org.springframework.boot:spring-boot-starter-data-jpa:2.5.5'
  runtimeOnly 'org.postgresql:postgresql:42.2.24.jre7'

  }
  ```
  2) In application.properties file you shode put thess lines:

`server.port=8081
spring.datasource.platform=postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/albums
spring.datasource.username=ghaida
spring.datasource.password=0000
spring.jpa.hibernate.ddl-auto=update
spring.datasource.initialization-mode=always`

3) You should run the POSTGRESQL on the trminal by using these commands"

sudo service postgresql start

sudo -i -u postgres

psql

\connect <<database name>>

\dt

select * from album;
