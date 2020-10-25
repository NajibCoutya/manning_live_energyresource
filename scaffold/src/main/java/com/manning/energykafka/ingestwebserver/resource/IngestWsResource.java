package com.manning.energykafka.ingestwebserver.resource;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class IngestWsResource {
    private final String template;
    private final String defaultName;

    public IngestWsResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
    }

    @GET
    @Timed
    public String sayHello(@QueryParam("name") Optional<String> name) {
        return  String.format(template, name.orElse(defaultName));
    }
}
