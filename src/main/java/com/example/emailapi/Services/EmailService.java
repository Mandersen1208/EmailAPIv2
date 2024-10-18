package com.example.emailapi.Services;




import com.example.emailapi.DTO.EmailDTO;
import com.example.emailapi.Services.ServiceInterface.EmailServiceIntf;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class EmailService implements EmailServiceIntf {


    @Value("${spring.mail.username}") private String sender;

    @Override
    public String sendEmail(EmailDTO emailDTO) {

        return "Email sent successfully!";
    }

    @Override
    public String sendEmailWithAttachments(EmailDTO emailDTO) {
        return "this email was completed";
    }

}
