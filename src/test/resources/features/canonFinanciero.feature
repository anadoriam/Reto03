
@stories
Feature: Canon Financiero
  Verificar el funcionamiento de la pantalla de simulación de Canon Financiero expuesta
  por el grupo Bancolombia - Leasing, en cuanto a la presentación de los valores calculados.
  @scenario1
  Scenario:Funcionamiento Canon Finanicero
    Given Ana quiere ingrsar al simulador Canon Financiero
    When Ana ingrese los campos solicitiados
    Then puede visualizar la simulacion de Canon Financiero
