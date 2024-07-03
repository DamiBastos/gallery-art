# Art Gallery

Este proyecto es una galería de arte en línea que permite gestionar y visualizar obras de arte. Para que funcione correctamente, necesitas crear una base de datos y una tabla específica en MySQL.

## Requisitos

- MySQL
- Acceso a la consola de MySQL o a una herramienta de administración de bases de datos como phpMyAdmin

## Configuración de la Base de Datos

### 1. Crear la Base de Datos

Primero, necesitas crear una base de datos llamada `art_gallery`. Puedes hacerlo con el siguiente comando:

```sql
CREATE DATABASE art_gallery;
```

### 2. Crear la tabla Obra

Segundo, necesitas crear una tabla llamada `obra`. Puedes hacerlo con el siguiente comando:

```sql
CREATE TABLE `obra` (
  `id` int NOT NULL AUTO_INCREMENT,
  `titulo` varchar(255) NOT NULL,
  `anio` date NOT NULL,
  `descripcion` text,
  `img` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```

### 3. Insertar obras

Por último, insertar datos de prueba:

```sql
INSERT INTO `obra` VALUES (1,'Composition','1956-01-01','Pintura abstracta de Joan Miró, un referente del arte surrealista.','abstracto-1.jpg'),(2,'Composición II','1910-01-01','Pintura abstracta de Piet Mondrian, uno de los pioneros del arte abstracto.','Abstracto-2.jpg'),(3,'El Dormitorio en Arlés','1888-10-01','Pintura de Vincent van Gogh, muestra su dormitorio en la Casa Amarilla.','cuarto.jpg'),(4,'La Creación de Adán','1512-01-01','Fresco de Miguel Ángel en la Capilla Sixtina, representa el momento en que Dios da vida a Adán.','la-creacion.jpg'),(5,'La Gran Ola de Kanagawa','1831-01-01','Obra de Katsushika Hokusai, una de las imágenes más icónicas del arte japonés.','la-ola.jpg'),(6,'American Gothic','1930-01-01','Pintura de Grant Wood, muestra a un granjero y su hija frente a su casa.','los-granjeros.jpg'),(7,'El Hijo del Hombre','1964-01-01','Pintura de René Magritte, muestra a un hombre con una manzana verde flotando frente a su rostro.','magritte.jpg'),(8,'La Noche de París','1889-09-01','Pintura de Vincent van Gogh, muestra la vista nocturna de París.','noche-de-paris.jpg'),(9,'Mushrooms','1965-01-01','Pintura de Yayoi Kusama, muestra hongos con un fondo rosado.','yayoi.jpg');
```
