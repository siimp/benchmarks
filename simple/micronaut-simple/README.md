# JVM

build
```
gradlew clean assemble jar
```

run  
```
java -jar build\libs\simple-0.1-all.jar
```


# GraalVM  
via x64 Native Tools Command Prompt for VS 2019

build
```
gradlew clean assemble jar
native-image --no-server -cp build\libs\simple-0.1-all.jar
```

run  
```
simple.exe
```