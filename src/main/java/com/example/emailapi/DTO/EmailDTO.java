package com.example.emailapi.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailDTO {

    private List<String> recipient;
    private String subject;
    private String sender;
    private String emailBody;
    private String attachment;
}
