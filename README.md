# Kitchen Service

Produces a food and drinks menu for present time.

## Running locally
```cmd
./gradlew runFunction
```
> ALTERNATIVE 
> 
> java -jar java-function-invoker-1.0.2.jar \
>     --classpath build/libs/kitchen-service-0.1-all.jar \
>     --target io.micronaut.gcp.function.http.HttpFunction \
>     --port 8080

### Verify locally
```bash
curl  \
    localhost:8080/KitchenService
```

## Deployment

```bash
./gradlew clean shadowJar
(cd build/libs
gcloud beta functions deploy kitchen_service \
    --allow-unauthenticated \
    --entry-point io.micronaut.gcp.function.http.HttpFunction \
    --runtime java11 --trigger-http)
```

### Test invocation
```bash
HTTP_TRIGGER_URL=$(gcloud beta functions describe kitchen_service \
    --format='value(httpsTrigger.url)')
curl ${HTTP_TRIGGER_URL}/kitchenservice/menu 