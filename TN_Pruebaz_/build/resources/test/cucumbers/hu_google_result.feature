#Author:psstv
Feature: get a list of results in the googleSearchApp applications
  
  As a webuser 
  I want to access in the aplications google search
  To visualize the results in the first page

  Background: 
    Given se encuentra en el home de la webAplications

  Scenario: Obtener y validar la cantidad de resultados de la primera pagina de google
    When se escribe la palabra pruebaz
    And se valida la palabra correcta pruebas
    Then el visualizaria que la cantidad del resultado es mayor que 6
