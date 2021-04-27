ITP2200 Exam - Introduction to software testing 

  
How to to get the code and tests up and running.  

 
Start up with importing the project into IntelliJ by using git. Press File -> New -> Project from version control -> And copy and paste the url.  


Now you need to make sure your JDK is setup. Press File -> Project structure -> Project -> Project SDK and select the latest Java version. 

  
To make sure the program knows what files it can run. The /exam folder is marked as the source root folder, and the /test folder as the test root folder. 

 
You will also need JUnit to run all the tests and you can access this by pressing the settings wheel in the top right corner followed by Libraries -> + -> from maven -> junit:junit:4.12 
(or simply by right clcking the import java.util above the code and importing JUnit from there) 

  
Now you can expect all the tests in the program to run and pass. From our diet-plan you can expect the tests to run at 99% coverage. 
