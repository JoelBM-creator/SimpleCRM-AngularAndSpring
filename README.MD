This project: [https://github.com/JoelBM-creator/AppCustumers-AngularAndSpring](https://github.com/JoelBM-creator/AppCustumers-AngularAndSpring)
<br />
## SUMMARY // RESUMEN
<br />
SP: SimpleCRM que ayuda a administrar fácilmente a los clientes.
<br />
ENG: SimpleCRM helps you easily manage your contacts clients.
<br /><br />
SP: Para esta aplicación necesitamos primero tener instalado MySQL Workbench y crear una conexión a la DB.
<br />
ENG: For this application we first need to have MySQL Workbench installed and create a connection to the DB.
<br /><br />
SP: La conexión se gestiona através del SPRING, tendremos que modificar el fichero application.properties que se encuentra en la carpeta resources.
<br />
ENG: The connection is managed through SPRING, we will have to modify the application.properties file found in the resources folder.
<br />
SP: En dicho fichero, podemos configurar para acceder al MySQL y añadir las credenciales de nombre y contraseña.
<br />
ENG: In this file, we can configure to access MySQL and add the name and password credentials.
<br />
### `RUNING THE APP IN THE SPRING`
![RUNNING APP IN SPRING](https://github.com/JoelBM-creator/AppCustumers-AngularAndSpring/Captura.PNG)
<br />
SP: En la imagen se puede ver, como al iniciar el Spring se creara automaticamente la base de datos y añadire los clientes a la DB.
<br />
ENG: In the image you can see how when starting Spring the database will be created automatically and the clients will be added to the DB.
<br />
SP: Ya que esto lo hacemos a través de la clase Cliente ya que implementa la interfaz Serializable, y se ejecutara al iniciar el Spring.
<br />
ENG: Since we do this through the Client class since it implements the Serializable interface, and it will be executed when Spring starts.
<br /> <br />
SP: Con el RestController lo que haremos será crear el API poder obtener los clientes, también obtener un único cliente através del GetMapping, también podremos crear un POST de clientes, un PUT para settear los clientes en la DB y un Delete para borrar los clientes con ID.
<br />
ENG: With the RestController what we will do is create the API to obtain the clients, also obtain a single client through GetMapping, we can also create a POST of clients, a PUT to set the clients in the DB and a Delete to delete the clients with ID .
<br /> <br />
SP: El fichero ClienteService de la carpeta Clientes, es donde conectamos la parte de Front con el Backend de la API de Spring.
<br />
ENG: The ClientService file in the Clients folder is where we connect the Front part with the Spring API Backend.

<br /> <br />
You can modify and use this repository however you want <br /> but please refer the creator, thanks ♥ .
<br />

## About me
Right now, I'm studying in a higher degree of multiplatform application development.
<br />
"Spring Boot, Java, Hibernate, DBs..."
<br /><br />
To contact me: [https://www.linkedin.com/in/joel-berenguer/](https://www.linkedin.com/in/joel-berenguer/)

<br /><br />
## Dependencies
For run this project, need this Dependencies:
<br />
-------- ANGULAR DEPENDENCIES ----------
1.  @angular/animations
2.  @angular/cdk
3.  @angular/common
4.  @angular/compiler
5.  @angular/core
6.  @angular/forms
7.  @angular/material
8.  @angular/platform-browser
9.  @angular/platform-browser-dynamic
10. @angular/router
11. rxjs
12. sweetalert2
13. tslib
14. zone.js
 <br />  <br />

## RUN THE PROJECT
In the project directory, you can run:
<br />
¡Fisrt run the Spring project! <br />
Next step is: 
<br />
### `npm install`
To install the dependencies.<br />
### `ng serve`
Runs the app in the development mode.<br />
Open [http://localhost:4200](http://localhost:4200) to view it in the browser.

### `Page View`
![View page](https://github.com/JoelBM-creator/AppCustumers-AngularAndSpring/Captura1.PNG)
### `Edit client`
![Edit client](https://github.com/JoelBM-creator/AppCustumers-AngularAndSpring/Captura2.PNG)
### `Create client`
![Create client](https://github.com/JoelBM-creator/AppCustumers-AngularAndSpring/Captura3.PNG)
### `Edit Client Correctly`
![Edit Client Correctly](https://github.com/JoelBM-creator/AppCustumers-AngularAndSpring/Captura4.PNG)