# Spring Boot Rest API

## Build
```
mvn clean install
```

## Run
```
mvn spring-boot:run
```

## Test hello operation with curl

```
curl -X GET http://localhost:8080/hello
```

## Test reverse operation

```
curl http://localhost:8080/reverse?text=hello
```

## Test removeVowels

```
curl http://localhost:8080/removeVowels?text=hello
```

## Run unit test
    
``` 
mvn test
```

## Containerize the application

### Build the docker image

```
docker build -t demo0811 .
```

### Run the docker image

```
docker run -p 8080:8080 demo0811
```

