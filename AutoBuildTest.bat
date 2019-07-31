@ECHO OFF

cd src
call javac -classpath ./../libs/* sourceCode/*.java
call javac -classpath ./../libs/*;./sourceCode/*;./*; TestCases/*.java
call java -classpath ./../libs/*;./sourceCode/*;./*; TestCases.TestCasesRunner
call java sourceCode.ControllerModule
cd ..

