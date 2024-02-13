Feature: Eleccion de productos

  @EleccionProducto
  Scenario Outline: Eleccion de 5 productos aelatoriamente
	Given que ingreso a la pagina Exito
	And visualizo la pagina principal
	When doy click a Menu se despliega la lista de categorias
	And selecciono la categoria "<NomCategoria>"
	And selecciono la subcategoria "<NomSubcategoria>"
	And selecciono la ciudad "<ciudad>" y el almacen "<almacen>"
	Then selecciono <cantidad> productos aleatoriamente
	And visualizo que los productos sean los correctos

	Examples:
	  | cantidad | NomCategoria | NomSubcategoria | ciudad   | almacen                |
	  | 5        | Mercado      | Frutas          | Anapoima | Punto Entrega Anapoima |