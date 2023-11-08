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


## Deploy to AKS

### Environment variables

```
export RESOURCE_GROUP=aks-demo-alb-rg
export CLUSTER_NAME=demo
export NAMESPACE=demo0811
```

### Get AKS credentials

```
az aks get-credentials --resource-group $RESOURCE_GROUP --name $CLUSTER_NAME
```

### Create namespace

```
kubectl create namespace $NAMESPACE
```

### Deploy the application

```
kubectl apply -f k8s/application.yaml -n $NAMESPACE
```

### Get the external IP address

```
export SVC_IP=`kubectl get svc demo0811 -n $NAMESPACE -o jsonpath='{.status.loadBalancer.ingress[0].ip}'`
```

### Test the application

```
curl http://$SVC_IP/hello
```

