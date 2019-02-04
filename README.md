# DynamicPlayerSearch

An application for Dynamic PlayerSearch using Java Servlets, Angular JS, Bootstrap, MySQL.


## How it works?

Type the name of the player you wish to search and there will be an AJAX GET Request made to the server which in turn will go to the MySQL Database and fetch the details, for the specfic player and send it back to the client which would generate the datatable. The datatable will be re-generated as new results are added each time you make a change in the input box. 

## How to install the Application

* Do a git clone of the git repository: https://github.com/e-business-app/DynamicPlayerSearch.git

* There is a SQL Script, Player.sql, located in the dbms directory, run it in your preffered MySQL data management tool or via command line.

* Go to the src.com.config folder and replace the username and password with your current DB Username and Password, which has access to the player database.

* Configure your build path by adding the folder of your apache tomcat installation.

* Run it on the server, it should work like a charm!

## Documentation of the Application

https://e-business-app.github.io/DynamicPlayerSearch/


## Dataset provided from:

https://www.kaggle.com/thec03u5/fifa-18-demo-player-dataset

