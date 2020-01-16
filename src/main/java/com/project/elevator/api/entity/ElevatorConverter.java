package com.project.elevator.api.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.AttributeConverter;
import java.io.IOException;

public class ElevatorConverter implements AttributeConverter<Elevator, String> {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(Elevator elevator) {
        try{
            return objectMapper.writeValueAsString(elevator);
        } catch (JsonProcessingException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Elevator convertToEntityAttribute(String dbData) {
        try {
            return objectMapper.readValue(dbData, Elevator.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
