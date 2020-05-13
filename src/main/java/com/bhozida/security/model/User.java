package com.bhozida.security.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String email;
    private String password;
    private String fullname;
    private boolean enabled;
    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @Column(name = "ROLE_ID")
    private Set<Role> roles = new HashSet<Role>();
    
    
}
    