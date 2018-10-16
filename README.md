# spring-cloud-code

something code for me to practice the spring-cloud

## spring-cloud-config

## spring-cloud-eureka

    sudo docker-compose up
    
above command will launch a cluster that consist of one eureka server,two provider,one consumer

you can check `http://[docker host ip]:9001/eureka` to see the eureka cluster.

you can check `http://[docker host ip]:9003/hello` and related consumer code to verify how consumer get the available providers from eureka.