# spring-cloud-code

something code for me to practice the spring-cloud

## spring-cloud-config

## spring-cloud-eureka

    sudo docker-compose up
    
above command will launch a cluster that consist of one eureka server,two providers,one consumer

you can check `http://[docker host ip]:9001/eureka` to see the eureka cluster.

you can check consumer service `http://[docker host ip]:9003/hello` and   you will see below

    hello world and this is from eureka-provider-2
    
refresh again

    hello world and this is from eureka-provider-1
    
consumer balances the requests to providers
