package com.example.emailapi.Controllers;


import com.example.emailapi.DTO.EmailDTO;
import com.example.emailapi.Services.ServiceInterface.EmailServiceIntf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailServiceIntf emailService;

    @PostMapping("/send-email")
    public String sendEmail(@RequestBody EmailDTO emailDTO) {
        return emailService.sendEmail(emailDTO);
    }

}
