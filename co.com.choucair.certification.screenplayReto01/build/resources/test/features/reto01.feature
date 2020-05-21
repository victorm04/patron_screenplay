#Autor: Victor Rodriguez
@stories
Feature: Automation demo site
  Like an automation student, I want to develop the challenge 01

  @scenario1
  Scenario: Web Automation
    Given than Carlos wants to access to the Web Automation Demo Site
    When he does the register on the site
      | name   | lastname | address   | email           | phone    | gender | hobbie1 | hobbie2 | language1 | language2 | skills | country | country2 | year | month | day | password | cpassword |
      | Carlos | Rojas    | Doral, FL | correo@mail.com | 65874787 | male   | Movies  | Hockey  | spanish   | english   | Java   | Panama  | India    | 1989 | March | 18  | c0ntr4s3 | c0ntr4se  |
    Then he verify that the page loaded has the text Double Click on Edit Icon to EDIT the Table Rowl