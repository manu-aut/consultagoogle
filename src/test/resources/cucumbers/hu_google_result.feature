#Author:psstv
Feature: get a list of results in the googleSearchApp applications
  
  As a webuser 
  I want to access in the aplications google search
  To visualize the results in the first page

  Scenario: Obtener y validar lista de consulta
    When se escribe la palabra
      | palabra |
      | pruebaz |
    And se valida la sugerencia como pruebas
    Then el visualizaria que la cantidad del resultado es mayor que 6
