@echo off
javac -classpath U:\JUnit\junit-3.8.1.jar *.java
if not errorlevel 1 java -cp .;U:\JUnit\junit-3.8.1.jar junit.awtui.TestRunner StudentTest