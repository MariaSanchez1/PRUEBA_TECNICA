Feature: Eleccion de Categoria y Subcategoria

  @CategoriaSubcategoria
  Scenario Outline: Categoria y Subcategoria
	Given que ingreso a la pagina Exito
	And visualizo la pagina principal
	When doy click a Menu se despliega la lista de categorias
	And selecciono la categoria "<NomCategoria>"
	And selecciono la subcategoria "<NomSubcategoria>"
	Then visualizo los productos existentes

	Examples:
	  | NomCategoria | NomSubcategoria |
	  | Mercado      | Frutas          |


