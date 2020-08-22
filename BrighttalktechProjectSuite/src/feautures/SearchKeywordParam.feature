
@tag
Feature: BrightTalk  Sample Tes
   Search keyword paramerisation using scenario Outline.

  @tag1
  Scenario Outline: Paramerisation using scenario outline and Examples table
    Given that I navigates to https://stackoverflow.com
    When I enter the SearchKeyword "<title>". Click search button
    When I should see the page title
    When close the browser4

   Examples: 
     | title             |  
     | Java compiler     | 
     | Python            | 
     | VB.Net            | 
     | SQL  join         | 
     | API  Training     | 
     | C# Issue          |    
     
     


