package edu.netcracker.core.utils;

import java.util.UUID;

/**
 * Util-class for generation entity's ID
 * @author Zubenko Eugene
 * Date: 14.12.2015
 */
public class GeneratorIdUtil {
    protected GeneratorIdUtil() {}

    /**
     * Generates random ID
     * @return string representation of ID
     */
    public static String generateID() {
        return UUID.randomUUID().toString();
    }
}
