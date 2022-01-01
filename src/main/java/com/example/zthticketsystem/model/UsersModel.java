package com.example.zthticketsystem.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "Users")
public class UsersModel implements UserDetails {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     */

    @Id
    private Integer usersID;

    private String  email;

    private String password;

    /**
     * @return the usersID
     */
    public Integer getId() {
        return usersID;
    }

    /**
     * @param usersID the usersID to set
     */
    public void setId(Integer usersID) {
        this.usersID = usersID;
    }

    /**
     * @return the  email
     */
    public String getEmail() {
        return  email;
    }

    /**
     * @param  email the  email to set
     */
    public void setEmail(String  email) {
        this. email =  email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return null;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Set<GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("USER"));
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "User [id=" + usersID + ",  email=" +  email + ", password=" + password + "]";
    }

}