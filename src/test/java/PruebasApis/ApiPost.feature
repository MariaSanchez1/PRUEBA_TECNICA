@METODOSPOST
Feature: Prueba API POST

  @METODOPOST
  Scenario Outline: Prueba de API con metodo POST <nombrecaso>
	Given url 'https://dummy.restapiexample.com/api/v1/create'
	When request {"<name>": <vname>,"<salary>": "<vsalary>","<age>": "<vage>"}
	And method POST
	Then status <status>
	Examples:
	  | nombrecaso   | name | vname | salary | vsalary | age | vage | status |
	  | caso exitoso | name | test  | salary | 187     | age | 23   | 200    |
