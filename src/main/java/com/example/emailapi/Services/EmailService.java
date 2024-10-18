package com.example.emailapi.Services;




import com.example.emailapi.DTO.EmailDTO;
import com.example.emailapi.Services.ServiceInterface.EmailServiceIntf;
import com.example.emailapi.Utils.ConverterUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements EmailServiceIntf {

    @Autowired
    JavaMailSender javaMailSender;


    @Value("${spring.mail.username}") private String sender;

    @Override
    public String sendEmail(EmailDTO emailDTO) {
        try {
            String[] to = ConverterUtils.convertStringListToStringArray(emailDTO.getRecipients());
            SimpleMailMessage mailMessage = new SimpleMailMessage();

            mailMessage.setFrom(sender);
            mailMessage.setTo(to);
            mailMessage.setText(emailDTO.getEmailBody());
            mailMessage.setSubject("email from api:"+" "+emailDTO.getSubject());

            javaMailSender.send(mailMessage);
            return "Email sent successfully!";
        }catch (Exception mailSendingExceptionm){
            return "error while sending mail";
        }
    }

    @Override
    public String sendEmailWithAttachments(EmailDTO emailDTO) {
        try{

        }catch (Exception mailSendingException){
            return "error while Sending Mail";
        }

        return "this email was completed";
    }
}
