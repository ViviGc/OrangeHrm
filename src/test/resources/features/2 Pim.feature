Feature: validar PIM

  @Regresion
    @HU002
    Scenario Outline: Add Employee
    Given abrir el navegador
    And el usuario diligencia usuario <userName> diligencia password <password>
    When el usuario ingresa add employee diligencia el formulario <firstName> <middle>  <lastName>

    Examples:
      |userName|password|firstName|middle|lastName|
      |Admin   |admin123|Viviana  |tatan |Gaviria |

