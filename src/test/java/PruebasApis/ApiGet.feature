@METODOSGET
Feature: Prueba API GET

  @METODOGET
  Scenario Outline: Prueba de API con metodo GET <nombrecaso>
	Given url 'https://dummy.restapiexample.com/api/v1/employees'
	When method GET
	Then status <status>
	* print response

	Examples:
	  | nombrecaso   | status |
	  | caso exitoso | 200    |

  @METODOGETID
  Scenario Outline: Prueba de API con metodo GET con ID <nombrecaso>
	Given url 'https://dummy.restapiexample.com/api/v1/employee/<id>'
	When method GET
	Then status <status>
	* print response

	Examples:
	  | nombrecaso   | id | status |
	  | caso exitoso | 4  | 200    |
