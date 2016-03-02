package edu.upc.eetac.dsa.beeter;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by Guillermo on 02/03/2016.
 */
public class BeeterResourceConfig extends ResourceConfig{
    public BeeterResourceConfig() {
       packages("edu.upc.eetac.dsa.beeter");
    }
}