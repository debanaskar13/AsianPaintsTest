Feature: Check Budget Calculator Functionality
  As a, User 
  I Want to Check whether budget calculator functionality is working or not, 
  So that, I can calculate Budget for Paints

  Background: 
    Given User open the browser
    When User Enter the url
    And User hover on Paints and Texture tab
    And User Clicks on the Paint Budget Calculator Link

  Scenario: Verify Budget Calculator Functionality
    And User select type of project
    And User select space
    And Size of home
    And User enters Carpet area
    Then User Click on the Calculate Now button
    And Verify whether the recommended products are showing or not
    And Closed the browser

  Scenario Outline: Verify the Advanced Budget Calculator Functionality for Interior space
    And User Clicks on Advanced Calculator Link
    And User Select Painting type
    And User Select space Interior for Paints
    And User Select number of rooms '<number_of_rooms>'
    And User enters Width '<width>' Height '<height>' Length '<length>' of the room
    And User enters number of windows '<number_of_windows>' and doors '<number_of_doors>'
    And User Select type of paint for WallA
    And User Select type of paint for WallB
    And User Select type of paint for WallC
    And User Select type of paint for WallD
    And User Select including ceiling or not '<include_ceiling>'
    And User choose paints type and select paints
    And User choose textures type and select textures
    And User choose wallpaper type and select wallpaper
    Then User Clicks on the Calculate now button
    And Verify whether user gets the paints within this budget
    And Closed the browser

    Examples: 
      | number_of_rooms | width | height | length | number_of_windows | number_of_doors | include_ceiling |
      |               1 |    10 |     10 |     13 |                 3 |               1 | True            |

  Scenario Outline: Verify the Advanced Budget Calculator Functionality for Interior space for invalid width
    And User Clicks on Advanced Calculator Link
    And User Select Painting type
    And User Select space Interior for Paints
    And User Select number of rooms '<number_of_rooms>'
    And User enters Width '<width>'
    And Verify whether user gets error message for invalid width
    And Closed the browser

    Examples: 
      | number_of_rooms | width |
      |               1 | asda  |

  Scenario Outline: Verify the Advanced Budget Calculator Functionality for Interior space for invalid length
    And User Clicks on Advanced Calculator Link
    And User Select Painting type
    And User Select space Interior for Paints
    And User Select number of rooms '<number_of_rooms>'
    And User enters length '<length>'
    And Verify whether user gets error message for invalid length
    And Closed the browser

    Examples: 
      | number_of_rooms | length |
      |               1 | asda   |

  Scenario Outline: Verify the Advanced Budget Calculator Functionality for Interior space for invalid length
    And User Clicks on Advanced Calculator Link
    And User Select Painting type
    And User Select space Interior for Paints
    And User Select number of rooms '<number_of_rooms>'
    And User enters height '<height>'
    And Verify whether user gets error message for invalid height
    And Closed the browser

    Examples: 
      | number_of_rooms | height |
      |               1 | asda   |

  Scenario Outline: Verify the Advanced Budget Calculator Functionality for Exterior space for valid credentials
    And User Clicks on Advanced Calculator Link
    And User Select Painting type '<painting_type>'
    And User Select space Exterior for Paints
    And User Enters carpet Area data '<carpet_area>'
    Then User Click on the Calculate Now button for Exterior
    And Verify whether user gets the exterior paints within this budget
    And Closed the browser

    Examples: 
      | painting_type | carpet_area |
      | Re-Painting   |        1500 |

  Scenario Outline: Verify the Advanced Budget Calculator Functionality for Exterior space for invalid carpet area
    And User Clicks on Advanced Calculator Link
    And User Select Painting type '<painting_type>'
    And User Select space Exterior for Paints
    And User Enters invalid carpet Area data '<carpet_area>'
    Then User Click on the Calculate Now button for Exterior
    And Verify whether user gets the error message '<expResult>'
    And Closed the browser

    Examples: 
      | painting_type | carpet_area | expResult                                             |
      | Re-Painting   | abdg        | Field should contain non-decimal value greater than 0 |
