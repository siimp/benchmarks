# JVM

build
```
gradlew clean build -Dquarkus.package.type=uber-jar
```

run  
```
java -jar build\simple-web-1.0.0-SNAPSHOT-runner.jar
```


# GraalVM

build
```
gradlew build -Dquarkus.package.type=native
```

run  
```
build\simple-web-1.0.0-SNAPSHOT-runner.exe
```