# Gradiente

## Descripción

El proyecto Gradiente tiene como objetivo principal administrar las lecturas de los usuarios, permitiéndoles organizar sus libros en diferentes categorías como lista de deseos, lista de libros en proceso y lista de libros leídos. Su propósito es ayudar a los usuarios a alcanzar sus metas de lectura anuales al proporcionarles una lista de libros leídos, determinar los libros restantes para alcanzar la meta y mostrar el porcentaje de avance hacia la misma.

## Instrucciones de instalación

Para utilizar el proyecto Gradiente, asegúrate de tener instaladas las siguientes versiones:

- JDK 19
- Jakarta EE 10 web
- Maven 3.8.7

## Arquitectura del proyecto

El proyecto Gradiente está desarrollado en Java utilizando el patrón Modelo-Vista-Controlador (MVC). A continuación, se detalla la estructura de directorios utilizada:

- **DAOs**: Contiene las clases encargadas de interactuar con la base de datos para el acceso a los datos.
- **Modelo**: Incluye las clases que representan el modelo de datos del proyecto.
- **Controlador**: Contiene las clases que manejan la lógica de negocio y coordinan las interacciones entre la vista y el modelo.
- **Conexion**: Contiene la clase encargada de establecer la conexión con la base de datos utilizando JDBC.
- **Log**: Incluye las clases y configuraciones para el registro de errores y eventos en el proyecto.
- **Vista**: Contiene las vistas de usuario, implementadas utilizando tecnologías web como HTML, CSS y JavaScript.


## Bases de datos
La base de datos esta realizada originalmente con Mysql/MariaDB usando XAMPP. Pero puede cambiar de base de datos a la preferencia.
El script para MySQL o MariaDB es:
<br>
<br>
<br>
CREATE DATABASE IF NOT EXISTS LibreriaGradiente;
USE LibreriaGradiente;

CREATE TABLE IF NOT EXISTS Rol (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS Usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombreUsuario VARCHAR(255) NOT NULL,
    uppassword VARCHAR(255) NOT NULL,
    uemail VARCHAR(255) NOT NULL,
    idRol INT,
    FOREIGN KEY (idRol) REFERENCES Rol(id)
);

CREATE TABLE IF NOT EXISTS Perfil (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nickname VARCHAR(255),
    Preferencia_de_Lecturas TEXT,
    Generos_favoritos TEXT,
    DescripcionUsuario TEXT,
    idUsuario INT,
    meta INT,
    FOREIGN KEY (idUsuario) REFERENCES Usuarios(id)
);

CREATE TABLE IF NOT EXISTS Libro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombreLibro VARCHAR(255) NOT NULL,
    Editorial VARCHAR(255),
    tema VARCHAR(255),
    idiomaLibro VARCHAR(255),
    EstadoLectura INT
);

CREATE TABLE IF NOT EXISTS Autor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombresAutor VARCHAR(255),
    Apellidos VARCHAR(255),
    Nacionalidad VARCHAR(255),
    idLibro INT,
    FOREIGN KEY (idLibro) REFERENCES Libro(id)
);

CREATE TABLE IF NOT EXISTS Coleccion (
    id INT AUTO_INCREMENT PRIMARY KEY,
    idLibro INT,
    idPerfil INT,
    FOREIGN KEY (idLibro) REFERENCES Libro(id),
    FOREIGN KEY (idPerfil) REFERENCES Perfil(id)
);

CREATE TABLE IF NOT EXISTS Resena (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Resena TEXT,
    calificacionLibro INT,
    idColeccion INT,
    fechaAgregada DATE,
    FOREIGN KEY (idColeccion) REFERENCES Coleccion(id)
);

#### Además para que funcione correctamente la administración de roles se debe insertar los siguientes registros
INSERT INTO rol (nombre) VALUES ('ADMINISTRADOR'), ('USUARIO') 


## Contribución

El proyecto Gradiente ha sido desarrollado de manera individual y no se aceptan contribuciones externas en la versión actual.

## Autor

- Oscar Acuña Rivas
- Correo electrónico: oscarboris@outlook.cl

## Estado del proyecto

El proyecto Gradiente es un prototipo desarrollado con fines demostrativos y no está destinado a un uso comercial.
