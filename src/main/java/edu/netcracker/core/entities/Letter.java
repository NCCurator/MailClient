package edu.netcracker.core.entities;
import java.util.Date;
import java.util.Map;
/**
 * This class represents entity of letter.
 * @author Gavrilova Julia
 * Date: 13.12.2015
 */
public class Letter extends AbstractEntity{

    private Map<String, Attachment> attachments;
    private String copy;
    private Date date;
    private String fromWhom;
    private String hiddenCopy;
    private String idFolder;
    private String message;
    private String subject;
    private String who;

    public Map<String, Attachment> getAttachments() {
        return this.attachments;
    }

    public String getCopy() {
        return this.copy;
    }

    public Date getDate() {
        return this.date;
    }

    public String getFromWhom() {
        return this.fromWhom;
    }

    public String getHiddenCopy() {
        return this.hiddenCopy;
    }

    public String getId() {
        return super.getId();
    }

    public String getIdFolder() {
        return this.idFolder;
    }

    public String getMessage() {
        return this.message;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getWho() {
        return this.who;
    }

    public void setAttachments(Map<String, Attachment> attachElem) {
        this.attachments = attachElem;
    }

    public void setCopy(String strCopy) {
        this.copy = strCopy;

    }

    public void setDate(Date strDate) {
        this.date = strDate;
    }

    public void setFromWhom(String strFromWhom) {
        this.fromWhom = strFromWhom;
    }

    public void setHiddenCopy(String strHiddenCopy) {
        this.hiddenCopy = strHiddenCopy;
    }

    public void setIdFolder(String strIdFolder) {
        this.idFolder = strIdFolder;
    }

    public void setMessage(String strMessage) {
        this.message = strMessage;
    }

    public void setSubject(String strSubject) {
        this.subject = strSubject;
    }

    public void setWho(String strWho) {
        this.who = strWho;
    }
}
