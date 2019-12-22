@echo off
javac -classpath C:\Users\agoddard\Documents\JavaProjects\agileJava\Exercises;C:\Program Files\Java\junit-4.13-rc-2.jar *.java chess\*.java pieces\*.java
if not errorlevel 1 java -cp C:\Users\agoddard\Documents\JavaProjects\agileJava\Exercises;C:\Program Files\Java\junit-4.13-rc-2.jar junit.awtui.TestRunner AllTests