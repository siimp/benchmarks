> These comparisons are meant to be out of the box comparisons. This must be kept in mind when reviewing the results. I know that some comparisons are unfair, meaning that some frameworks do not run in most optimized way and in recommended production environment.

# Benchmarks
Simple web frameworks benchmarks

## Software
- Windows 10
- Abache ab from httpd-2.4.46-win64-VS16

## Runtimes
- OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.10+9)
- graalvm-ce-java11-21.0.0.2
- go version go1.15.8 windows/amd64
- rustc 1.52.0-nightly (5fa22fe6f 2021-02-14)
- Python 3.9.1

## Frameworks
- spring-boot 2.4.2 (JVM)
- micronaut 2.3.2 (JVM, GraalVM native-image)
- quarkus 1.11.3.Final (JVM, GraalVM native-image)
- gin v1.6.3 (Go)
- rocket 0.4.7 (Rust)
- flask 1.1.2 (Python)

## Measurements
- Throughput test was run 5 times ```ab -k -c 20 -n 100000 http://localhost:8080/```
- Memory usage is measured with windows task manager Peak working set (memory)

## Simple GET request results

| Framework                         | Throughput (req/s) | Memory usage | Comments                 |
| --------------------------------- | ------------------ | ------------ | ------------------------ |
| flask-simple                      |                    |              |                          |
| gin-simple                        |                    |              |                          |
| micronaut-simple                  |                    |              |                          |
| micronaut-simple                  |                    |              | GraalVM                  |
| quarkus-simple                    |                    |              |                          |
| quarkus-simple                    |                    |              | GraalVM                  |
| quarkus-simple-reactive           |                    |              | reactive-routes          |
| quarkus-simple-reactive           |                    |              | reactive-routes, GraalVM |
| rocket-simple                     |                    |              |                          |
| spring-boot-simple                |                    |              |                          |
| spring-boot-simple-reactive       |                    |              | webflux                  |

## Notes
Build and run information is under README.md for each project.