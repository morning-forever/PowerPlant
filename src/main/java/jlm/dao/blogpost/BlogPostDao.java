package jlm.dao.blogpost;

import jlm.dao.Dao;
import jlm.entity.BlogPost;

/**
 * Definition of a Data Access Object that can perform CRUD Operations for {@link BlogPost}s.
 *
 * @author
 */
public interface BlogPostDao extends Dao<BlogPost, Long>
{
}
