package com.example.emailapi.Utils;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ConverterUtils {

    public static String[] convertStringListToStringArray(List<String> list){
        String[] array = new String[list.size()];
        list.toArray(array);
        return array;
    }
}
