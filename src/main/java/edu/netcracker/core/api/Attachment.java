package edu.netcracker.core.api;

/**
 * This class is for managing attachment TODO Данный интерфейс содержит методы для получения или изменения конкретного
 * поля файла прикрепленного к письму
 *
 * @author Miroshnichenko Yuriy
 *         Date 14.12.2015.
 */
public interface Attachment {

    // TODO описание метода getId()

    /**
     * TODO что делает метод
     *
     * @return Attachment stored in byte[] TODO байтовое представление файла прикрепленного к письму
     */
    byte[] getFile();

    /**
     * TODO что делает метод
     *
     * @return name of the Attachment TODO название файла прикрепленного к пиьсму
     */
    String getName();

    /**
     * TODO что делает метод
     *
     * @return size of the Attachment TODO размер файла прикрепленного к письму
     */
    int getSize();

    /**
     * TODO что делает метод
     *
     * @param file Sets Attachment stored in byte[] TODO байтовое представление файла прикрепленного к письму
     */
    void setFile(byte[] file);

    /**
     * TODO что делает метод
     *
     * @param name Sets name of the Attachment TODO название файла прикрепленного к пиьсму
     */
    void setName(String name);

    /**
     * TODO что делает метод
     *
     * @param size Sets size of the Attachment TODO размер файла прикрепленного к письму
     */
    void setSize(int size);
}