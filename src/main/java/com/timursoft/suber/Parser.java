package com.timursoft.suber;

/**
 * This interface for any format supported by the converter
 */
public interface Parser {

    String LINE_SEPARATOR = "\n";

    SubFileObject parse(String text);

    String serialize(SubFileObject subFileObject);

}
