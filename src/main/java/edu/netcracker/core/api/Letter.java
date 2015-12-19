package edu.netcracker.core.api;

import java.util.*;

/**
 * This class represents entity of letter. TODO Данный интерфейс содержит методы для получения или изменения конкретного
 * поля письма
 *
 * @author Gavrilova Julia
 *         Date: 13.12.2015
 */
public interface Letter {

    /**
     * Gets map of attachments in this letter TODO Метод возвращает файлы прикрепленные к данному письму
     *
     * @return map of attachments TODO карта имеющая в качестве ключа уникальный идентификатор файла, прикрепленного к письму,
     * а в качестве значения экземпляр класса {@link Attachment}, содержащий информацию о файле
     */
    Map<String, Attachment> getAttachments();

    /**
     * Gets man, who will get a copy of this letter TODO Метод возвращает список электронных адресов получателей копии данного сообщения
     *
     * @return copy TODO список электронных адресов получателей копии сообщения
     */
    String getCopy();

    /**
     * Gets date when this letter was sent TODO Метод возвращает дату отправки или приема сообщения
     *
     * @return date TODO экземпляр класса {@link Date}, содержащий дату и время отправки или приема сообщения
     */
    Date getDate();

    /**
     * Gets who sends this letter TODO метод возвращает электронный адрес почтового ящика пользователя, который отправил данное сообщение
     *
     * @return sender TODO электронный адрес почтового ящика отправителя
     */
    String getFromWhom();

    /**
     * Gets who will get a hidden copy of this letter TODO Метод возвращает список электронных адресов почтовых ящиков
     * пользователей, которые получат или получили скрытую копию сообщения
     *
     * @return hidden copy TODO список электронных адресов
     */
    String getHiddenCopy();

    /**
     * Gets letter's id  TODO Метод возвращает уникальный идентификатор сущности
     *
     * @return letter's id TODO уникальный идентификатор сущности
     */
    String getId();

    /**
     * Gets folder's id where this letter exists TODO Метод возвращает идентификатор папки в которой расположено данное письмо
     *
     * @return folder's id TODO идентификатор папки, где располагается письмо
     */
    String getIdFolder();

    /**
     * Gets massage, which user writes in his letter TODO Метод возвращает контент сообщения
     *
     * @return message TODO контент сообщения
     */
    String getMessage();

    /**
     * Gets title of this letter TODO Метод возвращает тему сообщения
     *
     * @return title(subject) TODO тема сообщения
     */
    String getSubject();

    /**
     * Gets addressee name TODO Метод возвращает список адресов почтовых ящиков пользователей, которым было отправлено сообщение
     *
     * @return addressee TODO список адресов почтовых ящиков пользователей
     */
    String getWho();

    /**
     * TODO поправить в соответствии с геттером
     * Sets map of attachments in user's letter
     *
     * @param attachments map of attachments
     */
    void setAttachments(Map<String, Attachment> attachments);

    /**
     * TODO поправить в соответствии с геттером
     * Sets who will get a copy of this letter
     *
     * @param strCopy one, who will get this copy
     */
    void setCopy(String copy);

    /**
     * TODO поправить в соответствии с геттером
     * Sets date when the letter was sent
     *
     * @param strDate date of sending this letter
     */
    void setDate(Date date);

    /**
     * TODO поправить в соответствии с геттером
     * Sets, who send this letter
     *
     * @param strFromWhom man, who send the letter
     */
    void setFromWhom(String fromWhom);

    /**
     * TODO поправить в соответствии с геттером
     * Sets who will get the hidden copy of this letter
     *
     * @param strHiddenCopy addressee of hidden copy
     */
    void setHiddenCopy(String hiddenCopy);

    /**
     * TODO поправить в соответствии с геттером
     * Sets id of folder, where is this letter exists
     *
     * @param strIdFolder folder's id
     */
    void setIdFolder(String idFolder);

    /**
     * TODO поправить в соответствии с геттером
     * Sets message of this letter
     *
     * @param strMessage massage
     */
    void setMessage(String message);

    /**
     * TODO поправить в соответствии с геттером
     * Sets subgect - the title
     *
     * @param strSubject title of this letter
     */
    void setSubject(String subject);

    /**
     * TODO поправить в соответствии с геттером
     * Sets addressee of the letter
     *
     * @param strWho addressee
     */
    void setWho(String who);
}
