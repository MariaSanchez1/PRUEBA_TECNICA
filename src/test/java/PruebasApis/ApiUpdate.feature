@METODOSUPDATE
Feature: Prueba API UPDATE

  @METODOUPDATE
  Scenario Outline: Prueba de API con metodo UPDATE <nombrecaso>
	Given url 'https://dummy.restapiexample.com/public/api/v1/update/<id>'
	When request {"<name>": <vname>,"<salary>": "<vsalary>","<age>": "<vage>"}
	And method POST
	Then status <STATUS>
	Examples:
	  | nombrecaso   | id | vname | salary | vsalary | age | vage | STATUS |
	  | caso exitoso | 12 | test  | salary | 1877    | age | 23   | 200    |