Feature: Checking All the Interior Paints and Textures Products is showing in appropiate page
  As a, User 
  I Want to Check whether all the interior products are showing or not, 
  So that i can buy interior paints

  Background: 
    Given User opens the browser
    When User enters the url
    And User moves cursor to Paints and Texture tab

  Scenario: Checking Wall Paints Products for Interior
    And User Click on the Wall Paints Link
    And User select type and Click on that type
    Then Verify All the Wall Paints products are shown or not
    And Close the browser

  Scenario: Checking Wall Textures Products for Interior
    And User Click on the Wall Textures Link
    And User Click on filter by button
    And User select type and Click on that type textures
    Then Verify All the Wall Textures products are shown or not
    And Close the browser

  Scenario: Checking Kids World Products for Interior
    And User Click on the Kids World Link
    And User Click on the kids category
    Then Verify All the Kids World products are shown or not
    And Close the browser

  Scenario: Checking Stencils Products for Interior
    And User Clicks on the Stencils link
    And User Select and Clicks on the stencils type
    And User Clicks on Filter By button
    And User Select and Clicks on tones
    And User Clicks on the Apply button in stencils
    Then Verify All the stencils products are showing or not
    And Close the browser
