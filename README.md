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

7. You should now be able to find your code running at: `http://localhost:8080/`

## Setting up Postgres

Before you run the app you will need to make sure you've got Postgres installed and a database set up by following the instructions below.

### Install Postgres

1. Download and install the [PostgreSQL server software](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads) if you haven't already.

2. Make sure you've added Postgres to your PATH (`C:\Program Files\PostgreSQL\<your version number>\bin`).

3. Open the Windows Start menu and search for "pgAdmin". When you start "pgAdmin" for the first time, you'll be asked to set a password for your superuser.

### Set up Bookish user

1. Inside your `PostgreSQL <version number>` server, right-click on Login/Group Roles and create a new Login/Group Role with the name `bookish` (in the General tab), the password `bookish` (in the Definition tab) and the ability to log in and create databases (in the Privileges tab).

2. Click `Save` to create the user.

### Set up Bookish database

1. Inside your `PostgreSQL <version number>` server, right-click on Databases and create a new Database with the name `bookish` and the owner `bookish` (both in the General tab).

2. Click `Save` to create the database.
