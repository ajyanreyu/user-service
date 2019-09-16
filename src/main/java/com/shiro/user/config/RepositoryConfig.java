package com.shiro.user.config;

import com.shiro.user.commons.entity.Role;
import com.shiro.user.commons.entity.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;


@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
    /**
     * Configure the repository to expose the id of the entity
     *
     * @param config RepositoryRestConfiguration
     * @author Albano Yanes <ajyanreyu@gmail.com>
     */
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(User.class, Role.class);
    }
}
