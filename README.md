Template taken from Jessy Yate's basic maven setup here https://github.com/jyates/manning-energy-resources/tree/master/scaffold
I was able to:
- Add a sample Avro event (deviceCharge.avro) and generate the java object for it
- Add a dropwizard Webserver (IngestWsApplication)

I couldn't:
- Link the webserver via Avro Post
- Link the webserver to apache stream and database

I hope I'll be able to understand the solution better from the provided solution for part 1. 

I am familiar with Kafka stream consumption as I've used Kafka dataflow.

But integrating the lot via Java is proving difficult for me as a first step.

# manning-energy-resources

Resources for the [Manning liveProject on managing IoT data with Kafka](https://www.manning.com/liveproject/managing-a-distributed-electrical-grid-in-real-time-with-kafka?a_aid=jesse&a_bid=78d8f6d2), where learners are building the infrastructure to support and manage a distributed energy grid.

## event-generators

The backing code for the dynamic event & pricing generators. It gets periodically compiled (manually, right now) and released as a resource for the project.

## scaffold

A basic starting place for the project that "quick starts" users with a Maven build that supports Java and Scala, as well as a docker-compose definition for a full Kafka + Schema Registry installation.

## Issues/Contributing

Issues and fixes are warmly welcomed! Please just file an issue if you find something wrong. Internet bonus points if you also want to provide a patch as well.
=======
# manning_live_energyresource
Manning Live Project Kafka Energy Resource
