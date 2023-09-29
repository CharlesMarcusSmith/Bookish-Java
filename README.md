# Bookish

## Getting Started

1. Fork this repo
    * Click `Fork` in the top-right of the page - this will create a copy of this repo in **your own GitHub account**

2. Clone (download) the repo
    * Go to your newly-created fork of the repo (on GitHub).
    * Click `Clone or download` (the green button on the right).
    * Make sure the page says `Clone with SSH` (rather than `Clone with HTTPS`).
    * Open your git client (e.g. GitKraken) and use this link to clone the repo.  
      Your trainer will able to help you with this.

3. "Cloning the repo" will create a folder on your computer with the files from this repo.  
   Open this folder in VSCode.

4. Open a command-prompt in this same folder.  
   Your trainer can show you how to do this, if you need any help.

5. Make sure you've got PostgreSQL installed. You'll notice that your `application.properties` file contains POSTGRES config variables. As well as installing Postgres we need to make sure we have a user set up to match that config, with the right permissions to create the database when the app runs. All instructions for this step are in the `Setting up Postgres` section below.

6. Run `./gradlew run` in the console.

7. You should now be able to find your code running at: `http://localhost:8080/books`

## Setting up Postgres

Before you run the app you will need to make sure you've got Postgres installed and a database set up by following the instructions below.

### Install Postgres

1. Download and install the [PostgreSQL server software](https://www.postgresql.org/download/) if you haven't already.

### Start Postgres

#### Windows

Open the Windows Start menu and search for "pgAdmin". When you start "pgAdmin" for the first time, you'll be asked to set a password for your superuser.

#### Mac

Run Postgres.app

#### Linux

Ubuntu users try `sudo systemctl enable postgresql.service`


### Set up Bookish user

1. Inside your `PostgreSQL <version number>` server, right-click on Login/Group Roles and create a new Login/Group Role with the name `bookish` (in the General tab), the password `bookish` (in the Definition tab) and the ability to log in and create databases (in the Privileges tab).

2. Click `Save` to create the user.

### Set up Bookish database

1. Inside your `PostgreSQL` server, right-click on *Databases* and create a new Database with the name `bookish` and the owner `bookish` (both in the General tab).

2. Click `Save` to create the database.



SPIRNG NOTES:
Is an application framework, typically used to build the start point for us.

Spring Boot is all about the rapid production of projects, create quickly, without configuration.
Will allow us to create and configure a program that will have API capabilities.

Bean: a managed object, requiring classes.
@RestController is an example of a bean
^ Rest as in a REST API.

Inversion of control, contrtol of the framework is given to the framework.

@Repository - tells spring that this class is used for data access, which is the component of our API that interacts with the database.
@ Service - this will be responsible for business logic, and seperated for ease of config managing?
^! FYI We didnt use this in our project, but in my Hotel-Project you can see how its used if curious, it just seperated functionality from controller
   into another class for coding principle reasons, it's just good practice but not absolutely neccessary while learning.
@Controller (@Controller & @ RestController) - used for request handling, listening for requests (potentially multiple), any requests the API needs to be handled need ot be in this class.
   ^ A @RestController is for incoming and outgoing JSON format data.
@Entity - Classes that we wil create - these should match tables, and using getters and setters like normal, which are for the columns of our table.
^ Entities are used to store records as objects, and using beans (@) we can tell Java how to interact with the database based of this.
^ For example Primary Keys are listed here, and in my BookAuth and BookAuthPK we have listen how the forien keys.
^ The data types must match / be compatible with the data types in our database, for example I have used the Date type in Java as it matches the format of the date type in SQL.
^ ! Important thing to note about Entities is they typically must have a primary key; 
that is why when I was making my conjunction (BookAuth) entity containing two foreign keys, I had to make a second Entity class which combined the two foreign keys of the tables listed,
and combine them in the BookAuthPK Entity class to make a new primary key, which was then passed into the BookAuth Entity class.

See the book classes and BookAuth classes for notes,














