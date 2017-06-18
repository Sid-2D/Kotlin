@echo on
call kotlinc %1.kt -include-runtime -d %1.jar
call java -jar %1.jar