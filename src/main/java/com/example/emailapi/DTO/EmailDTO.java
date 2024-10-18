package com.example.emailapi.DTO;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmailDTO {

    private List<String> recipients;
    private String subject;
    private String sender;
    private String emailBody;
    private String attachment;

}
