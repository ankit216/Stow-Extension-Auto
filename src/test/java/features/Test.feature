@smokeTest
Feature: Action In Extension

  //Scenario: TC 16 Add Collection
  Given Open Stow Extension In Chrome Browser
  Then Verify To Stow Extension Page
  When Add 1st Collection "My First Collection"
  When Verify 1st Added Collection
  When Add 2nd Collection "My Second Collection"
  When Verify 2nd Added Collection
  Then Browser Close

  //Scenario: Open Multiple Tab And Store Tabs
  Given Open Stow Extension In Chrome Browser
  Then Verify To Stow Extension Page
  When Open New Tab Google "http://www.google.com"
  Then New Tab Google Verification
  And Back To Stow Extension
  When Open New Tab wikipedia "https://en.wikipedia.org"
  And New Tab Wikipedia Verification
  And Verify To Stow Extension Page
  And Open New Tab Vigoreport "https://vigoreport.io"
  And New Tab Vigoreport Verification
  And Store Tabs
  And Store Tabs Verification
  Then Browser Close


  //Scenario: TC 2 To verify Extension page when new tab open
  Given Open Chrome Browser
  When Click on new tab button
  Then Verify To Stow Extension Page
  Then Browser Close

  //Scenario: TC 9 To verify Extension "Open Tabs" functionality
  Given Open Stow Extension In Chrome Browser
  Then Verify To Stow Extension Page
  When Open New Tab Google "http://www.google.com"
  Then New Tab Google Verification
  And Back To Stow Extension
  When Open New Tab wikipedia "https://en.wikipedia.org"
  And New Tab Wikipedia Verification
  And Verify To Stow Extension Page
  And Open New Tab Vigoreport "https://vigoreport.io"
  And New Tab Vigoreport Verification
  And Verify Open Tabs
  Then Browser Close

  //Scenario: TC 10 To verify Extension "Listed Tabs" functionality
  Given Open Stow Extension In Chrome Browser
  When Verify To Stow Extension Page
  When Open New Tab Google "http://www.google.com"
  Then New Tab Google Verification
  And Back To Stow Extension
  When Open New Tab wikipedia "https://en.wikipedia.org"
  And New Tab Wikipedia Verification
  And Verify To Stow Extension Page
  And Open New Tab Vigoreport "https://vigoreport.io"
  And New Tab Vigoreport Verification
  And Verify Open Tabs
  And Click On Listed Tab
  And Verify Listed Open Tabs
  Then Browser Close

  //Scenario: TC 12 To verify ">>" (SHOW,HIDE) button functionality
  Given Open Stow Extension In Chrome Browser
  When Verify To Stow Extension Page
  When Click On SHOW HIDE Button
  Then Verify HIDE Open Tab Section
  When Click On SHOW HIDE Button
  And Verify SHOW Open Tab Section
  Then Browser Close

  //Scenario: TC 13 To verify 'Delete tab' functionality of open tabs section
  Given Open Stow Extension In Chrome Browser
  When Verify To Stow Extension Page
  When Open New Tab Google "http://www.google.com"
  Then New Tab Google Verification
  And Back To Stow Extension
  When Open New Tab wikipedia "https://en.wikipedia.org"
  And New Tab Wikipedia Verification
  And Verify To Stow Extension Page
  And Open New Tab Vigoreport "https://vigoreport.io"
  And New Tab Vigoreport Verification
  And Verify Open Tabs
  And Close Opened Tab In Open Tab Section
  Then Browser Close

  //Scenario: TC 17 To verify selected collection tabs are displayed
  Given Open Stow Extension In Chrome Browser
  Then Verify To Stow Extension Page
  When Open New Tab Google "http://www.google.com"
  Then New Tab Google Verification
  And Back To Stow Extension
  When Open New Tab wikipedia "https://en.wikipedia.org"
  And New Tab Wikipedia Verification
  And Verify To Stow Extension Page
  And Open New Tab Vigoreport "https://vigoreport.io"
  And New Tab Vigoreport Verification
  And Store Tabs
  And Store Tabs Verification
  When Click On Added Collection
  When Verify My Collection
  When Click On Backlog Collection
  When Verify My Collection
  Then Browser Close

  Scenario: TC 18 To verify "Sorting" functionality
    Given Open Stow Extension In Chrome Browser
    Then Verify To Stow Extension Page
    When Add 1st Collection "My First Collection"
    Then Verify 1st Added Collection
    When Add 2nd Collection "My Second Collection"
    Then Verify 2nd Added Collection
    When Add 3rd Collection "My Third Collection"
    Then Verify 3rd Added Collection
    When Add 4th Collection "My Fourth Collection"
    Then Verify 4th Added Collection
    When Click On Favorite Of 1st Collection
    Then Verify Click On Favorite 1st Collection
    When Click On Favorite Of 3rd Collection
    Then Verify Click On Favorite 3rd Collection


