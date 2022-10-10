## Step 1: Create Dockerfile
### build image
```
docker build -t demo/spring-boot-app-dev .
```
### run container
```
docker run -it -p 8080:8080 demo/spring-boot-app-dev app-dev
```

### testing
```
http://localhost:8080/v1/simulators
{"message":"Simulated!"}
```

## Step 2: k8s locally
### start minikube
```
minikube start
```

### powershell
```
minikube docker-env
minikube -p minikube docker-env --shell powershell | Invoke-Expression
```

### create deployment
```
minikube kubectl -- create -f deployment.yaml
minikube kubectl -- get events --watch
minikube kubectl -- get pods
```

### create service
```
minikube kubectl -- create -f service.yaml
```

### testing
```
minikube kubectl -- create -f curl-pod.yaml
minikube kubectl -- exec --stdin --tty my-curl -- /bin/sh
curl --location --request GET 'http://app-dev.default/v1/simulators'
{"message":"Simulated!"}
```

### take note
```
minikube kubectl -- delete deployment app-dev
```