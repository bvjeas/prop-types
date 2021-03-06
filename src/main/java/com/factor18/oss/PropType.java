package com.factor18.oss;

public interface PropType {

    String getType();
    Object parse(Object value) throws InvalidPropTypeException;
    Boolean isRequired();
    Object getDefaultValue();
    boolean isValid(Object value);
}
