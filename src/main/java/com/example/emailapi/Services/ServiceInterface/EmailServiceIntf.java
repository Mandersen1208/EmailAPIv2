package com.example.emailapi.Services.ServiceInterface;


import com.example.emailapi.DTO.EmailDTO;

/**
 * email implementation.
 */
public interface EmailServiceIntf {
    /**
     * Sends simple mail without an attachment.
     *
     * @param emailDTO - emailJson that is brought in through the API
     * @return - Success Message
     */
    String sendEmail(EmailDTO emailDTO);

    /**
     * Sends mail with attachments.
     *
     * @param emailDTO- email Json
     * @return - returns Success Message
     */
    String sendEmailWithAttachments(EmailDTO emailDTO);
}
