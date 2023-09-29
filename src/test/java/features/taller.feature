Feature: Realizar divison y multiplicacion en Basic Calculator



  Scenario Outline: Realizar Multiplicacion

    Given Ingreso a basic calculator multiplicacion ingresa <numero_01> multiplicado por <numero_02>
    When  seleccione tipo de operacion
    Then  me deberia dar <resultado>

    Examples:
      | numero_01    |  numero_02 |  resultado  |
      | 4            |  2         |  8          |
      | 5            |  10        |  50         |
      | 2            |  6         |  10         |
      | 3            |  9         |  30         |


  Scenario Outline: Realizar Division

    Given Ingreso este numero <numero_03> dividido por <numero_04>
    When  seleccion de division
    Then  me deberia dar division <resultado_div>

    Examples:
      | numero_03    |  numero_04 |  resultado_div  |
      | 4            |  2         |  2            |
      | 45           |  9         |  5            |
      | 15           |  6         |  10           |
      | 3            |  9         |  30           |
