package com.commerce.backend.converter.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Converter
public class StringListConverter implements AttributeConverter<List<String>, String> {

    private final String split = ";";
    @Override
    public String convertToDatabaseColumn(List<String> strings) {
        return strings !=null&&!strings.isEmpty() ? String.join(split,strings): "";
    }

    @Override
    public List<String> convertToEntityAttribute(String s) {
        return s!=null ? Arrays.asList(s.split(split)): Collections.emptyList();
    }
}
