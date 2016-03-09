package edu.upc.eetac.dsa.beeter.dao;

import com.fasterxml.jackson.annotation.JsonInclude;
import edu.upc.eetac.dsa.beeter.auth.UserInfo;
import edu.upc.eetac.dsa.beeter.entity.AuthToken;

import java.sql.SQLException;

/**
 * Created by Guillermo on 09/03/2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface AuthTokenDAO {
    public UserInfo getUserByAuthToken(String token) throws SQLException;
    public AuthToken createAuthToken(String userid) throws SQLException;
    public void deleteToken(String userid) throws  SQLException;
}