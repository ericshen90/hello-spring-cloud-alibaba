# Spring Cloud Alibaba

### Dependencies Version
1. `Java: 1.8`
2. `Spring Boot: 2.1.10.RELEASE`
3. `Spring Cloud: Greenwich.SR3`
4. `Spring Cloud Alibaba: 2.1.1.RELEASE`
5. [`Nacos 1.1.4 Standalone`](https://github.com/nacos-group/nacos-docker)
6. [`Sentinel 1.7.0`](https://github.com/alibaba/sentinel)
7. [`jib-maven-plugin`](https://github.com/GoogleContainerTools/jib/tree/master/jib-maven-plugin)
 - deploy image to remote (`docker hub`,`Harbor`,etc) 
   - `mvn compile jib:build -DsendCredentialsOverHttp=true`(`local registry without ssl`)
   - `mvn compile jib:build `(`docker.io`)
 - build to Docker daemon
   - `mvn compile jib:dockerBuild`
