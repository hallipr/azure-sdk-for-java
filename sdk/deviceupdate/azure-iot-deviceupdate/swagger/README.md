# Azure Device Update for IoT Hub for Java

> see https://aka.ms/autorest

### Setup
```ps
Fork and clone https://github.com/Azure/autorest.java 
git checkout main
git submodule update --init --recursive
mvn package -Dlocal
npm install
npm install -g autorest
```

### Generation
```ps
cd <swagger-folder>
autorest --java --use=C:/work/autorest.java
```

## Generate autorest code
```yaml
input-file: https://github.com/Azure/azure-rest-api-specs/blob/main/specification/deviceupdate/data-plane/Microsoft.DeviceUpdate/preview/2021-06-01-preview/deviceupdate.json
java: true
output-folder: ../
regenerate-pom: false
title: DeviceUpdateClient
generate-sync-async-clients: true
generate-client-as-impl: true
generate-client-interfaces: false
add-context-parameter: true
artifact-id: azure-iot-deviceupdate
data-plane: true
sync-methods: all
generate-samples: true
license-header: MICROSOFT_MIT_SMALL
namespace: com.azure.iot.deviceupdate
service-name: DeviceUpdate
context-client-method-parameter: true
azure-arm: false
credential-types: tokencredential
credential-scopes: https://api.adu.microsoft.com/.default
service-versions:
  - '2021-06-01-preview'
```
