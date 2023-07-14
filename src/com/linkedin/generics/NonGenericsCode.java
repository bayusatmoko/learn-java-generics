package com.linkedin.generics;

import java.util.ArrayList;
import java.util.List;

public class NonGenericsCode {

    private static void processLanguages(List data){
        String lang = (String) data.get(0);
        System.out.println(lang);
    }

    public static void main(String[] args) {
        List languages = new ArrayList();
        languages.add(23);
        Object value = new String("Swedish");
        languages.add(value);

        processLanguages(languages);
    }
}
