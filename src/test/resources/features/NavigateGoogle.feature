Feature: NAvigate to Google and search with some texts

  @Google
  Scenario: Verify Google search with 'Software'
    Given Navigate to url "https://www.google.com"
    And Enter the serach text "Software"
    When Verify the logo
    And Close browser
    
     @Google
  Scenario: Verify Google search with 'Ahamed' 
    Given Navigate to url "https://www.google.com"
    And Enter the serach text "Ahamed"
    When Verify the logo
    And Close browser
