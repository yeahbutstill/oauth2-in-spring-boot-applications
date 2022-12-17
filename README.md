# oauth2-in-spring-boot-applications

## Download and Install [keycloak](https://www.keycloak.org/getting-started/getting-started-zip)
- run keycloack
- Create admin user
- Login to the admin console
- Create realm
- Create user
- Secure client app

## Run resource eureka server, album, photo app web client and spring clouds api gateways
- discoveryservice
- album-resource-server
- photo-app-web-client
- api-getway

```shell
mvn clean install spring-boot:run
```

# Deploy config provider keycloak
- copy my-remote-user-storage-provider.jar to keycloak provider path
- and run this to build
```shell
bin/kc.sh build
```
- to review config
```shell
kc.sh show-config
```

## Referencer
- https://edwin.baculsoft.com/tag/keycloak
- https://www.keycloak.org/guides
- https://spring.io/guides/gs/gateway/
- https://spring.io/guides/gs/spring-cloud-loadbalancer/
- https://www.appsdeveloperblog.com/creating-oauth-2-scope-in-keycloak/
- https://spring.io/guides/gs/service-registration-and-discovery/