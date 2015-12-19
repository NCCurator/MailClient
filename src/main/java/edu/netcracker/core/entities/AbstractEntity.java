package edu.netcracker.core.entities;

import edu.netcracker.core.utils.GeneratorIdUtil;

/**
 * Abstract class for representation any entity
 *
 * @author Zubenko Eugene
 *         Date: 14.12.2015
 */
public abstract class AbstractEntity {

    /**
     * Unique identifier of the entity
     */
    private String id;

    public AbstractEntity() {
        this.id = GeneratorIdUtil.generateID();
    }

    /**
     * Method returns the unique identifier of the entity
     *
     * @return unique identifier of the entity
     */
    public String getId() {
        return id;
    }
}
