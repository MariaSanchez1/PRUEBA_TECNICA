@METODOSDELETE
Feature: Prueba API DELETE

  @METODODELETE
  Scenario Outline: Prueba de API con metodo DELETE <nombrecaso>
	Given url 'https://dummy.restapiexample.com/public/api/v1/delete/<id>>'
	When method DELETE
	Then status <STATUS>
	Examples:
	  | nombrecaso   | id |  STATUS |
	  | caso exitoso | 12 |  204    |