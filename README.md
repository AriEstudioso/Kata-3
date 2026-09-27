# Kata 3 - Generación de Histogramas en Memoria

## Descripción

Esta práctica amplía la kata anterior para permitir la generación dinámica de histogramas en memoria a partir de un atributo seleccionado del dataset.

Se ha implementado un mecanismo basado en inyección de dependencias mediante expresiones lambda, permitiendo construir histogramas de forma genérica sin depender de un atributo concreto. Además, se ha desarrollado una clase `Histogram` que actúa como modelo para almacenar las frecuencias observadas.

---

## Estructura del proyecto

```
src/main/java
├── app
│   └── Main.java
├── io
│   ├── CSVSongParser.java
│   ├── CSVSongReader.java
│   ├── SongParser.java
│   └── SongReader.java
├── model
│   └── Song.java
├── tasks
│   └── HistogramBuilder.java
└── viewmodel
    └── Histogram.java
```

---

## Objetivos de la práctica

- Permitir la selección dinámica del atributo sobre el que generar el histograma.
- Implementar inyección de dependencias mediante expresiones lambda.
- Crear una clase `Histogram` para almacenar los valores y sus frecuencias.
- Generar histogramas en memoria a partir de los datos cargados.
- Mantener un diseño genérico y reutilizable.
- Separar las responsabilidades en diferentes clases.

---

## Clases del proyecto

### Main.java
Punto de entrada de la aplicación.

### Song.java
Clase inmutable que representa una canción y sus atributos.

### SongReader.java
Interfaz que define la lectura de canciones.

### CSVSongReader.java
Clase encargada de leer el archivo CSV.

### SongParser.java
Interfaz que define cómo convertir una línea del archivo en un objeto `Song`.

### CSVSongParser.java
Clase encargada de transformar cada línea del CSV en un objeto `Song`.

### HistogramBuilder.java
Clase encargada de generar histogramas en memoria a partir de una colección de objetos y del atributo seleccionado mediante una expresión lambda.

### Histogram.java
Clase view model que almacena los valores y las frecuencias observadas en el histograma.

---

## Uso de Git

Se han realizado commits durante el desarrollo para registrar los cambios del proyecto y facilitar el seguimiento de la práctica.

---

## Nota

Esta práctica forma parte del aprendizaje sobre procesamiento de datos y separación de responsabilidades. La representación visual del histograma se desarrollará en la siguiente kata.
