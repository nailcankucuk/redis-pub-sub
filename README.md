# redis-pub-sub
Redis Pub Sub Example API via Spring Boot

## Step-by-step

- In this example app we are running our redis server in a docker container.
You can start redis server with run this command on terminal while in the directory of project

```
docker-compose up -d
```

Now redis server should be running. You can check it with

````
docker-compose ps
````

- You can access redis-cli in docker with

````
docker exec -it redis /bin/bash
redis-cli
````

- First scenario - sub on cli, pub from api
![1_1](https://raw.githubusercontent.com/nailcankucuk/redis-pub-sub/master/src/main/resources/img/1_1_sub_on_cli.png)
![1_2](https://raw.githubusercontent.com/nailcankucuk/redis-pub-sub/master/src/main/resources/img/1_2_pub_on_api.png)
![1_3](https://raw.githubusercontent.com/nailcankucuk/redis-pub-sub/master/src/main/resources/img/1_3_show_on_cli.png)
![1_4](https://raw.githubusercontent.com/nailcankucuk/redis-pub-sub/master/src/main/resources/img/1_4_show_on_console.png)
 

- Second scenario - sub on api, pub from cli
![2_1](https://raw.githubusercontent.com/nailcankucuk/redis-pub-sub/master/src/main/resources/img/2_1_sub_on_api.png)
![2_2](https://raw.githubusercontent.com/nailcankucuk/redis-pub-sub/master/src/main/resources/img/2_2_show_sub_on_console.png)
![2_3](https://raw.githubusercontent.com/nailcankucuk/redis-pub-sub/master/src/main/resources/img/2_3_publish_on_cli.png)
![2_4](https://raw.githubusercontent.com/nailcankucuk/redis-pub-sub/master/src/main/resources/img/2_4_show_message_on_console.png)
