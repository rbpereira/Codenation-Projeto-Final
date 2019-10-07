package com.codenation.centralerros.service;

import com.codenation.centralerros.model.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface extends ServiceInterface<User> {

    UserDetails findByName(String name);

}
