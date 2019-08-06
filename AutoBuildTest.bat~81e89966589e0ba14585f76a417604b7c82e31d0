@ECHO OFF

cd src
call javac -classpath ./../libs/* sourceCode/*.java
call javac -classpath ./../libs/*;./sourceCode/*;./*; testCases/*.java
call java -classpath ./../libs/*;./sourceCode/*;./*; testCases.TestCasesRunner
call java sourceCode.ControllerModule
cd ..

