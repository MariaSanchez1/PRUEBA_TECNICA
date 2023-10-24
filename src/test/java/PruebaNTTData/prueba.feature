@REQ_PRB-001 @Agente1
  Feature: Prueba api fakestore
    Background:
      * def urlBase = 'https://fakestoreapi.com/products'
      @id:1 @Pruebafake @productos
        Scenario Outline: T-PRB-001-CA01 Validacion de productos
        * def identificador = <id> - 1
        Given url urlBase
        When method GET
        Then status 200
        * print response
        * def idRespuesta = response[identificador].id
        And match idRespuesta == <id>
        * string rateRespuesta = response[identificador].rating.rate
        And match rateRespuesta == "<rate>"
        * string tituloRespuesta = response[identificador].title
        And match tituloRespuesta contains "<titulo>"
        * string categoriaRespuesta = response[identificador].category
        And match categoriaRespuesta == "<categoria>"
        
        Examples:
        |read('classpath:../Datos/parametrosFakes.csv')|
        
    @id:2 @PruebasFake @categoria
      Scenario Outline: T-PRB-001-CA02 Validacion de categorias 
      Given url urlBase
      And path '/category/' + "<categoria>"
      When method GET
      Then status 200
      * print response
      And match response == '#[6]'
      And match $..id contains <id>

      Examples:
        |read('classpath:../Datos/parametrosFakes.csv')|
  



