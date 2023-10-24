Por: Stalin Patricio Riofrío Terrazas
Ejercicio 1: T-PRB-001-CA01 Validacion de productos
1. Obtener todos los productos de su tienda y validar que uno de sus productos estrellas con un rate de 4.8, tenga el id 11,
su categoria corresponda con electronics y que su título coincida con Silicon Power 256GB SSD 3D NAND A55 SLC Cache Performance Boost SATA III 2.5

2. Luego necesita validar que en el catalogo de productos, cuando busca por categoria electronics, venga 6 productos en total
y que esté el producto con el id 11

API: https://fakestoreapi.com

## Requisitos

Para ejecutar el proyecto es necesario tener instalado lo siguiente:

  - Maquina local con el sistema windows/linux
  - JDK versión 17 (debe estar en la variable de entorno) o descargar desde preferencias de intellij
  - Intellij-Idea Comunity o Ultimate version 2023.1.2
  - Gradle 8.0



## Ejecucion
- Para ejecutar el proyecto
        1. Abrir el IDE IntellijIdea
        2. Ingresar en la opción File -> Open y ubicarse en el proyecto (abrir)
        3. Esperar unos minutos para que se descargen las despendencias (gradle)
        4. Opciòn de ejecución: Ubicarse y ejecutar la clase ManagementTestPrueba.java (src/test/java/PruebaNTTData/ManagementTestPrueba.java).
            - La clase ejecutara los features de forma paralela los escenarios
            - ## Reporte Karate: Una vez finalizada la ejecución se crea el informe propio de Karate para visualizarlo ubicarse en la ruta target/karate-reports/karate-summary.html

   NOTA: Los datos para el consumo de la API se encuentran en la ruta main/resources/Datos/parametrosFakes.csv, aqui puede cambiar los valores
   para poder ser match con lo que desea buscar segun sea la llamada de la API


## Información adicional
Referencia karate: https://www.karatelabs.io/
Repositorio Karate: https://github.com/karatelabs/karate
Repositorio Stalin Riofrío:


