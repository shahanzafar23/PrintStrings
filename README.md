# PrintStrings
PrintStrings is a maven based project in order to run the program with 10MB of ram please run the following steps

1 - Build code with mvn clean install
2 - Go into target and run 'java -jar -Xmx10m PrintStrings-1.0-SNAPSHOT-jar-with-dependencies.jar {{x}}'
3 - Output will be a file having 'x' number of strings in each line in the target directory



CI/CD also added to cover the unit tests as well