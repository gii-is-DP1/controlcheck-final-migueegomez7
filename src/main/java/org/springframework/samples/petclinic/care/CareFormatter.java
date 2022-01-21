package org.springframework.samples.petclinic.care;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class CareFormatter implements Formatter<Care>{

    @Autowired
    CareService careService;

    @Override
    public String print(Care object, Locale locale) {
        
        return object.getName();
    }

    @Override
    public Care parse(String text, Locale locale) throws ParseException {
    
        if(careService.getCare(text) != null){
            return careService.getCare(text);
        }else{
            throw new ParseException("type not found " + text, 0);
        }
    }
    
}
