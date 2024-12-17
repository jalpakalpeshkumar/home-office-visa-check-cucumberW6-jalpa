@regression
Feature: Check requirement
  As a User
  I need visa to come to the UK

  @smoke
  Scenario: Australian coming to UK for Tourism
    Given I am on homepage
    When I click on start button
    And I select a nationality Australia
    And I click on continue button
    And I select reason Tourism
    And I click on continue button
    Then I should see result You will not need a visa to come to the UK

  @sanity
  Scenario: Chilean coming to the Uk for work and plans on staying for longer than six months
    Given I am on homepage
    When I click on start button
    And I select a Nationality Chile
    And I click on continue button
    And I select reason Work, academic visit or business
    And I click on continue button
    And I select intendent to stay for longer than 6 months
    And I click on continue button
    And I select have planning to work for Health and care professional
    And I click on continue button
    Then I should see result You need a visa to work in health and care


  Scenario: Columbian national coming to UK to join a partner for a long stay they do have an article 10 or 20 card
    Given I am on homepage
    When I click on start button
    And I select a nationality Colombia
    And I click on continue button
    And I select reason Join partner or family for a long stay
    And I click on continue button
    And I Select state My partner of family member have uk immigration status yes
    And I click on continue button
    Then I should see result You’ll need a visa to join your family or partner in the UK