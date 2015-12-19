package edu.netcracker.core.api;

/**
 * TODO javadoc
 *
 * @author Фёдор
 * Date: 19.12.2015
 * @version 1.0
 */
public interface Folder {


    public String getDescription();

    public String getId();

    public String getIdAccount();

    public String getIdParentFolder();

    public String getName();

    public boolean isSystem();

    /**
     *
     * @param description
     */
    public void setDescription(String description);

    /**
     *
     * @param idAccount
     */
    public void setIdAccount(String idAccount);

    /**
     *
     * @param idParentFolder
     */
    public void setIdParentFolder(String idParentFolder);

    /**
     *
     * @param name
     */
    public void setName(String name);

    /**
     *
     * @param isSystem
     */
    public void setSystem(boolean isSystem);
}
