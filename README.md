
## Start Zookeeper
```zkServer```

## Start Kafka Server
```kafka-server-start.bat config\server.properties```

## Create Kafka Topic
```kafka-topics.bat --create --zookeeper localhost:2181 topic "test" ```

## Start command-line producer
```kafka-console-producer.bat --broker-list localhost:9092 --topic test```

## Start command-line consumer
### Old consumer
```C:\Users\ES230022>kafka-console-consumer.bat --zookeeper localhost:2181 --topic test```

### New consumer
```kafka-console-consumer.bat --bootstrap-server localhost:9092 ```

## List topics
```kafka-topics.bat --list --zookeeper localhost:2181```

## List topic details
TBA
