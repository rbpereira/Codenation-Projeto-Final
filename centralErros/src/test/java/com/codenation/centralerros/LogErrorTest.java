package com.codenation.centralerros;

import com.codenation.centralerros.controller.LogErrorController;
import com.codenation.centralerros.controller.UserController;
import com.codenation.centralerros.dto.LogErrorDTO;
import com.codenation.centralerros.model.LogError;
import com.codenation.centralerros.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LogErrorTest {

    @Autowired
    LogErrorController logError;

    @Test
    public void PesquisarLogPorId() throws Exception
    {
        Long id = Long.valueOf(1);

        LogErrorDTO status = logError.findById(id);

        //assertEquals(200, status.getStatusCodeValue());
    }
}
