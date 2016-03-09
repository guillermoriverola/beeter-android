package edu.upc.eetac.dsa.beeter.dao;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by Guillermo on 09/03/2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAlreadyExistsException extends Exception {
}
