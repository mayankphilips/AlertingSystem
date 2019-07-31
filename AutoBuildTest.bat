@ECHO OFF
ECHO This is the Test Execution of the Auto-Build file.
javac src/RunningCode/InputGeneratingModule.java
javac src/RunningCode/PatientIdGeneratingModule.java
javac src/RunningCode/RandomValuesGeneratingModule.java
javac src/RunningCode/AlertRaisingModule.java
javac src/RunningCode/ValidatingModule.java
javac src/RunningCode/VitalCheckModule.java
javac src/RunningCode/controllerModule.java

java src/RunningCode/controllerModule.java


PAUSE