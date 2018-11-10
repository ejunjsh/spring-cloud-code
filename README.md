# spring-cloud-code

something code for me to practice the spring-cloud

## precondition

    sh mvn.sh
    sudo docker-compose up
    
above command will launch a cluster that consist of one eureka server,two providers,one consumer,one config server and one config client


## spring-cloud-config

you can check config client service `http://[docker host ip]:9200/` to see if it get config from config server

## spring-cloud-eureka

you can check `http://[docker host ip]:9001/eureka` to see the eureka cluster.

you can check consumer service `http://[docker host ip]:9003/hello` and you will see below

    hello world and this is from eureka-provider-2
    
refresh again

    hello world and this is from eureka-provider-1
    
consumer balances the requests to providers


## spring-cloud-hystrix 


visit `http://[docker host ip]:9003/hystrix/error`,`http://[docker host ip]:9003/hystrix/timeout` and `http://[docker host ip]:9003/hystrix/nonresponse`

you will see 

````
server have been crash, try again later.
````

above three links show hystrix can deal with exception,timeout and wrong backend server response in hystrix method,

details in [HystrixTestController.java](https://github.com/ejunjsh/spring-cloud-code/blob/master/spring-cloud-eureka-consumer/src/main/java/com/sky/code/springcloudeureka/consumer/controller/HystrixTestController.java)
