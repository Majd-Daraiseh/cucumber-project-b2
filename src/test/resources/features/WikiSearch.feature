Feature: Wiki search verification functionality
  Background:
    Given User is on Wikipedia home page

  @B2G3-166 @B2G3-236
  Scenario:Wikipedia Search Functionality Title Verification
      When User types "Steve Jobs" in the wiki search box
      Then User clicks wiki search button
      Then User sees "Steve Jobs - Wikipedia" is in the wiki title

  @B2G3-166 @B2G3-238
  Scenario: Wikipedia Search Functionality Header Verification
      When User types "Steve Jobs" in the wiki search box
      Then User clicks wiki search button
      Then User sees "Steve Jobs" is in the main header

  @B2G3-166 @B2G3-239
  Scenario:Wikipedia Search Functionality Image Header Verification
    When User types "Steve Jobs" in the wiki search box
    Then User clicks wiki search button
    Then User sees "Steve Jobs" is in the image header
