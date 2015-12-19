package edu.netcracker.core.entities;

import edu.netcracker.core.api.Attachment;

/**
 * This class is for managing attachment TODO класс содержит поля содержащие информацию о конкретном файле прикрепленном
 * к письму, а так же методы для получения и измменения этой информации
 *
 * @author Miroshnichenko Yuriy
 *         Date 14.12.2015.
 */
public class AttachmentEntity extends AbstractEntity implements Attachment {
    /**
     * Attachment stored in byte[] TODO байтовое представление файла
     */
    private byte[] file;
    /**
     * Attachment name TODO название файла
     */
    private String name;
    /**
     * Attachment size TODO размер файла в байтах
     */
    private int size;

    // TODO конструктор с параметрами

    @Override
    public byte[] getFile() {
        return file.clone();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setFile(byte[] file) {
        this.file = file;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }
}