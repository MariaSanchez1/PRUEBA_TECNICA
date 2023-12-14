#language: es

@Utest
Característica: Registro de usuario
  Como Usuario quiero Realizar el registro de usuario en el aplicativo Utest,
  Para verificar el registro en el aplicativo

  Antecedentes:Ingreso al aplicativo
    Dado Angelica ingresa al aplicativo de Utest

  Esquema del escenario: Registro de usuario exitoso en el aplicativo Utest
    Cuando inicio en el apartado de join today
    Y completa los datos de cuentanos de ti
      | nombre   | apellido   | correo   | mes   | dia   | year   | lenguaje   |
      | <nombre> | <apellido> | <correo> | <mes> | <dia> | <year> | <lenguaje> |
    Y completa los datos de Direccion
      | ciudad   | cod_postal   | pais   |
      | <ciudad> | <cod_postal> | <pais> |
    Y lleno los datos de mis los dispositivos
      | computador   | version   | lenguaje2   | dispositivo   | modelo   | sistema_operativo   |
      | <computador> | <version> | <lenguaje2> | <dispositivo> | <modelo> | <sistema_operativo> |
    Y lleno los datos de mi contrasenna
      | contrasena   | confirmar_contrasena   |
      | <contrasena> | <confirmar_contrasena> |
    Entonces Verificamos que se haya realizado el registro del usuario

    Ejemplos:
      | nombre | apellido | correo            | mes | dia | year | lenguaje | ciudad | cod_postal | pais     | computador | version | lenguaje2 | dispositivo | modelo | sistema_operativo | contrasena   | confirmar_contrasena |
      | Luis   | Torrez   | ltorrez@gmail.com | May | 23  | 1993 | Spanish  | Bogota | 110141     | Colombia | Windows    | 10      | Spanish   | Motorola    | W220   | Java ME           | 23@LuisT2023 | 23@LuisT2023         |

