package com.codenation.centralerros;


import com.codenation.centralerros.controller.UserController;
import com.codenation.centralerros.exception.UserNotFoundException;
import com.codenation.centralerros.model.User;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@ContextConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest{

    @Autowired
    UserController user;

    @Test
    public void PesquisarUsuarioExistenteNaBase() throws Exception
    {
        Long id = Long.valueOf(1);

        ResponseEntity<User> status = user.findByUserId(id);

        assertEquals(200, status.getStatusCodeValue());
    }

    @Test(expected = UserNotFoundException.class)
    public void PesquisarUsuarioInexistenteNaBase()
    {
        Long id = Long.valueOf(2);

        ResponseEntity<User> status = user.findByUserId(id);
    }

    @Test
    public void PesquisarUsuarioPorNome() throws Exception
    {
        String Nome = "Jorge Santos";
        Pageable firstPageWithTwoElements = PageRequest.of(0, 20);

        Iterable userList  = user.findAll(Nome, firstPageWithTwoElements);

        assertEquals(Nome, ((User) ((ArrayList) userList).get(0)).getName());
    }


}
