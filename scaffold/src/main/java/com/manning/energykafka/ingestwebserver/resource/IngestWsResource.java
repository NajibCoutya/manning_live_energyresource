package com.manning.energykafka.ingestwebserver.resource;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Path("/register-device-charge")
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

    //@TODO Change to ingest from avro ChargeEvent
    @POST
    @Timed
    public Response ingestChargeEvent(@FormParam("deviceId") String deviceId,
                                  @FormParam("charge") int chargePercentage) {
        return Response.status(200)
                .entity("Ingested Device <br> Device ID: [" + deviceId + "], with charge [" + chargePercentage + "%]")
                .build();
    }

}
