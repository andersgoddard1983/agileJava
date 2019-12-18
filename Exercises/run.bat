@echo off
javac -classpath U:\JavaProjects\agileJava\Exercises;U:\JUnit\junit-3.8.1.jar *.java chess\*.java pieces\*.java
if not errorlevel 1 java -cp U:\JavaProjects\agileJava\Exercises;U:\JUnit\junit-3.8.1.jar junit.awtui.TestRunner AllTests