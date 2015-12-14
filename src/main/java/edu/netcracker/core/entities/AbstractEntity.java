package edu.netcracker.core.entities;

import edu.netcracker.core.utils.GeneratorIdUtil;

/**
 * Abstract class for representation any entity
 * @author Zubenko Eugene
 * Date: 14.12.2015
 */
public abstract class AbstractEntity {
    /**
     * Entity ID
     */
    private String id;

    /**
     * Default constructor
     */
    public AbstractEntity() {
        this.id = GeneratorIdUtil.generateID();
    }

    /**
     * Gets entity ID
     * @return entity ID
     */
    public String getId() {
        return id;
    }
}
