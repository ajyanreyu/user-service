package com.shiro.user.repository;

import com.shiro.user.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    /**
     * Find user by username
     *
     * @param username
     * @return User
     */
    public User findByUsername(String username);


}
