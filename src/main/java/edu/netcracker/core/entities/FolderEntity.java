package edu.netcracker.core.entities;

import edu.netcracker.core.api.Folder;
/**
 * TODO javadoc
 *
 * @author Фёдор
 * Date: 19.12.2015
 * @version 1.0
 */


public class FolderEntity extends AbstractEntity implements Folder {

    private String description;
    private String idAccount;
    private String idParentFolder;
    private boolean isSystem;
    private String name;
    public Folder m_Folder;
    public Letter m_Letter;

    protected void finalize() throws Throwable {
        this.finalize();
    }
    public String getDescription() {
        return description;
    }

    public String getIdAccount() {
        return idAccount;
    }

    public String getIdParentFolder() {
        return idParentFolder;
    }

    public String getName() {
        return name;
    }

    public boolean isSystem() {
        return isSystem;
    }

    public void setDescription(String description) {
        this.description = description;

    }

    public void setIdAccount(String idAccount) {
        this.idAccount = idAccount;
    }

    public void setIdParentFolder(String idParentFolder) {
        this.idParentFolder = idParentFolder;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSystem(boolean isSystem) {
        this.isSystem = isSystem;
    }
}
