package edu.netcracker.core.utils;

import java.util.UUID;

/**
 * The class contains a utility method for generating a unique identifier for entities of the application
 *
 * @author Zubenko Eugene
 *         Date: 14.12.2015
 */
public class GeneratorIdUtil {

    private GeneratorIdUtil() {}

    /**
     * The method is intended to generate unique identifiers of the entity
     *
     * @return string unique identifier
     */
    public static String generateID() {
        return UUID.randomUUID().toString();
    }
}
