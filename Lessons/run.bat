@echo off
javac -classpath U:\JavaProjects\agileJava\Lessons;U:\JUnit\junit-3.8.1.jar studentinfo\*.java
if not errorlevel 1 java -cp U:\JavaProjects\agileJava\Lessons;U:\JUnit\junit-3.8.1.jar junit.awtui.TestRunner studentinfo.AllTests