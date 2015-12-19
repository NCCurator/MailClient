package edu.netcracker.core.entities;

import edu.netcracker.core.api.Attachment;
import edu.netcracker.core.api.Letter;

import java.util.Date;
import java.util.Map;

/**
 * This class represents entity of letter.
 * TODO класс содержит поля содержащие информацию о сообщении полученном или отправленным пользователем с почтового ящика ,
 * а так же методы для получения и измменения этой информации
 * NOTE: учетная запись почтового ящика должна быть добавлена к списку Account-ов пользователя
 *
 * @author Gavrilova Julia
 *         Date: 13.12.2015
 */
public class LetterEntity extends AbstractEntity implements Letter {

    // TODO javaDoc c описанием поля
    private Map<String, Attachment> attachments;
    // TODO javaDoc c описанием поля
    private String copy;
    // TODO javaDoc c описанием поля
    private Date date;
    // TODO javaDoc c описанием поля
    private String fromWhom;
    // TODO javaDoc c описанием поля
    private String hiddenCopy;
    // TODO javaDoc c описанием поля
    private String idFolder;
    // TODO javaDoc c описанием поля
    private String message;
    // TODO javaDoc c описанием поля
    private String subject;
    // TODO javaDoc c описанием поля
    private String who;

    // TODO конструктор с передачей параметров

    @Override
    public Map<String, Attachment> getAttachments() {
        return this.attachments;
    }

    @Override
    public String getCopy() {
        return copy;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public String getFromWhom() {
        return fromWhom;
    }

    @Override
    public String getHiddenCopy() {
        return hiddenCopy;
    }

    // TODO не надо его здесь переопределять он из супер класса доступен будет
    public String getId() {
        return super.getId();
    }

    @Override
    public String getIdFolder() {
        return idFolder;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public String getWho() {
        return who;
    }

    @Override
    public void setAttachments(Map<String, Attachment> attachments) {
        this.attachments = attachments;
    }

    @Override
    public void setCopy(String copy) {
        this.copy = copy;

    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public void setFromWhom(String fromWhom) {
        this.fromWhom = fromWhom;
    }

    @Override
    public void setHiddenCopy(String hiddenCopy) {
        this.hiddenCopy = hiddenCopy;
    }

    @Override
    public void setIdFolder(String idFolder) {
        this.idFolder = idFolder;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void setWho(String who) {
        this.who = who;
    }
}
