package jlm.dao.accesstoken;

import jlm.dao.Dao;
import jlm.entity.AccessToken;

/**
 * @author
 */
public interface AccessTokenDao extends Dao<AccessToken, Long>
{
    AccessToken findByToken(String accessTokenString);
}
