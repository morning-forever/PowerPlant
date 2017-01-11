package jlm.rest.resources;

import com.sun.jersey.api.view.Viewable;
import jlm.entity.AccessToken;
import jlm.entity.User;
import jlm.service.UserService;
import jlm.transfer.UserTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

/**
 * @author
 */
@Component
@Path("/hello")
public class IndexResources
{

    @GET
    @Path("world")
    @Produces(MediaType.TEXT_HTML)
    public Viewable index() {
        return new Viewable("/WEB-INF/view/home/index.jsp");
    }


}
