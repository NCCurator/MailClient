package edu.netcracker.core.api;

import java.util.*;
/**
 * This class represents entity of letter.
 * @author Gavrilova Julia
 * Date: 13.12.2015
 */
public interface Letter {

    /**
     * Gets map of attachments in this letter
     * @return map of attachments
     */
    public Map<String, Attachment> getAttachments();

    /**
     * Gets man, who will get a copy of this letter
     * @return copy
     */
    public String getCopy();

    /**
     * Gets date when this letter was sent
     * @return date
     */
    public Date getDate();

    /**
     * Gets who sends this letter
     * @return sender
     */
    public String getFromWhom();

    /**
     * Gets who will get a hidden copy of this letter
     * @return hidden copy
     */
    public String getHiddenCopy();

    /**
     * Gets letter's id
     * @return letter's id
     */
    public String getId();

    /**
     * Gets folder's id where this letter exists
     * @return folder's id
     */
    public String getIdFolder();

    /**
     * Gets massage, which user writes in his letter
     * @return message
     */
    public String getMessage();

    /**
     * Gets title of this letter
     * @return title(subject)
     */
    public String getSubject();

    /**
     * Gets addressee name
     * @return addressee
     */
    public String getWho();

    /**
     * Sets map of attachments in user's letter
     * @param attachElem map of attachments
    */
    public void setAttachments(Map<String, Attachment> attachElem);

    /**
     * Sets who will get a copy of this letter
     * @param strCopy one, who will get this copy
     */
    public void setCopy(String strCopy);

    /**
     * Sets date when the letter was sent
     * @param strDate date of sending this letter
     */
    public void setDate(Date strDate);

    /**
     * Sets, who send this letter
     * @param strFromWhom man, who send the letter
     */
    public void setFromWhom(String strFromWhom);

    /**
     * Sets who will get the hidden copy of this letter
     * @param strHiddenCopy addressee of hidden copy
     */
    public void setHiddenCopy(String strHiddenCopy);

    /**
     * Sets id of folder, where is this letter exists
     * @param strIdFolder folder's id
     */
    public void setIdFolder(String strIdFolder);

    /**
     * Sets message of this letter
     * @param strMessage massage
     */
    public void setMessage(String strMessage);

    /**
     * Sets subgect - the title
     * @param strSubject title of this letter
     */
    public void setSubject(String strSubject);

    /**
     * Sets addressee of the letter
     * @param strWho addressee
     */
    public void setWho(String strWho);
}
