# Bunq Splitwise App

### What is it? 
Me and my partner have recently moved in together. One thing that we have decided is that we'd report joint expenses such as groceries on Splitwise.

I am incredibly forgetful.

So instead of trying to improve my ability to be a functioning adult, I decided instead to write a Bunq Integration so that I'd no longer have to report these things manually. It will take any expense from a debit card with the last 4 digits as indicated by me and import them directly to Splitwise. 

I have an apple pay card with bunq that I intend to use for all my joint expenses. 

As stated earlier I am very lazy so this uses an existing project as a baseline [twitter-stream]()

### Tools used

* **Java 11**: Access to Streams, modern Java functional methods
* **Lombok**: Used to ease the amount of Boilerplate needed
* **Spring Boot**: Usually a framework that allows for DI minimises the amount of Boilerplate code needed.   
* **Reactor**: Reactor was chosen in order to enable easy multicasting, functional methods to convert things, and easy batching. 

### Design 

As described above, it uses a lot of reactive programming paradigms. 

The reason this was chosen was because the requirements called for extensibility, threading, etc.  

We are able to pass around the Flux<TweetData> easily. This in turn allowed me to create multiple consumers, one for the stats, for instance, but the other for the printing. 

The threading aspect of this was also made simpler. We can have one background thread producing the methods, and easily multicast this to other observers. 



