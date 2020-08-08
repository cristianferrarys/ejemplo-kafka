# ejemplo-kafka

## Esto es un ejemplo usando Stream Cloud + kafka 

 ```docker-compose -f docker-compose.yaml up -d```

```docker ps ```

```docker exec -it kafka /bin/sh```

```cd /opt/kafka ```

## Lista de topicos creados 

```./kafka-topics.sh --list --zookeeper zookeeper:2181```

## Iniciar un Consumidor 

``` kafka-console-consumer.sh --bootstrap-server localhost:9092 --from-beginning --topic topic-cfsanchez```

## Bajar el kafka y eliminarlo

``` docker-compose stop```

```docker-compose down --volumes```
