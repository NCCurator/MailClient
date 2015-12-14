package edu.netcracker.core.api;

/**
 * Date 14.12.2015.
 * This class is for managing attachment
 * @author Miroshnichenko Yuriy
 */
public interface Attachment {
    /**
     * @return Attachment stored in byte[]
     */
    public byte[] getFile();

    /**
     * @return name of the Attachment
     */
    public String getName();

    /**
     * @return size of the Attachment
     */
    public int getSize();

    /**
     * @param file Sets Attachment stored in byte[]
     */
    public void setFile(byte[] file);
    /**
     * @param name Sets name of the Attachment
     */
    public void setName(String name);
    /**
     * @param size Sets size of the Attachment
     */
    public void setSize(int size);
}
