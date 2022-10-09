# Bunq Reactive Client

### What is it? 

This is an example of a client for bunq using WebClient to enable reactive interactions with Bunq. 

It has the following features:
* Automatic Session Restoration 
* Automatic Depagination
* Automatic Validation of payloads
* Automatic Encryption of payloads.

### Tools used

* **Java 11**: Access to Streams, modern Java functional methods
* **Lombok**: Used to ease the amount of Boilerplate needed
* **Spring Boot**: Usually a framework that allows for DI minimises the amount of Boilerplate code needed.   
* **Reactor**: Reactor was chosen in order to enable easy multicasting, functional methods to convert things, and easy batching. 
* **Spring Webflux** The Webflux client that this is based around

