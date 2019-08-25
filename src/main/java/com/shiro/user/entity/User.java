package com.shiro.user.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastName;

    @Column(unique = true, length = 20)
    private String username;

    @Column(length = 60)
    private String password;

    @Column(unique = true)
    private String email;

    private Boolean active;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Role> roles;


}
