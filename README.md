 Run the tests from the command line.

Step1: Go to the project path directory, you will pom.xml file.(e.g: cd /opt/test/).
Step2: run the below command
'mvn -Dtest=GitHubLogin test' , here GitHubLogin is testng class name

Step3: once execution done, go to the /opt/test/target/surefire-reports directory.
Note:In github go to the target/surefire-reports folder to see the emailable-report.html

Step4: run 'ls' command, you will see one emailable-report.html file created.
step5: open file using command 'google-chrome emailable-report.html'.
Step6: you will see the pass/fail report




