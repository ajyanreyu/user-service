package com.shiro.user.repository;

import com.shiro.user.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "user")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    /**
     * Find user by username.
     * We change the name of the route with the notation <i>@RestResource.</i>
     * You can also change the name of the parameter in the url with <i>@Param</i>, for example:
     *
     * <code>public User findByUsername( @Param("loginName") String username);</code>
     *
     *
     * @param username
     * @return User
     */
    @RestResource(path = "/find-username")
    public User findByUsername(String username);


}
