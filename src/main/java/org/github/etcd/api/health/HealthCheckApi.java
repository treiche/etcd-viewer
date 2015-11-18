package org.github.etcd.api.health;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/health")
public class HealthCheckApi {

    private static final Logger LOG = LoggerFactory.getLogger(HealthCheckApi.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response isHealthy() {
        LOG.debug("application returns 200");
        return Response.ok().build();
    }

}
