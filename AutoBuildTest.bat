@ECHO OFF

cd src
call javac -classpath ./../libs/* RunningCode/*.java
call javac -classpath ./../libs/*;./RunningCode/*;./*; TestCases/*.java
call java -classpath ./../libs/*;./RunningCode/*;./*; TestCases.TestCasesRunner
call java RunningCode.ControllerModule
cd ..

 pause