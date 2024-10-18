package com.example.emailapi.Services.ServiceInterface;


import com.example.emailapi.DTO.EmailDTO;

public interface EmailServiceIntf {

    String sendEmail(EmailDTO emailDTO);
    String sendEmailWithAttachments(EmailDTO emailDTO);
}
