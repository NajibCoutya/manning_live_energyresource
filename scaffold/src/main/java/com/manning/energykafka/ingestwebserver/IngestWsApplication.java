package com.manning.energykafka.ingestwebserver;

import com.manning.energykafka.ingestwebserver.configuration.IngestWsConfiguration;
import com.manning.energykafka.ingestwebserver.resource.IngestWsResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


public class IngestWsApplication extends Application<IngestWsConfiguration> {
    public static void main(String[] args) throws Exception {
        new IngestWsApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<IngestWsConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(IngestWsConfiguration configuration,
                    Environment environment) {
        final IngestWsResource resource = new IngestWsResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        environment.jersey().register(resource);
    }

}
