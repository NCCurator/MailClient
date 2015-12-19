package edu.netcracker.core.api;

import java.util.Date;
import java.util.Map;

/**
 * Interface which represents user's entity. TODO Данный интерфейс содержит методы для получения или изменения конкретного
 * поля учетной записи пользователя
 *
 * @author Zubenko Eugene
 *         Date: 14.12.2015
 */
public interface User {

    // TODO метод getId

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Sets map of user's mail-accounts and their names
     *
     * @param accounts accounts' map
     */
    void setAccounts(Map<String, Account> accounts);

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Gets map of user's mail-accounts and their names
     *
     * @return map of user's mail-accounts and their names
     */
    Map<String, Account> getAccounts();

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Sets date of user's birthday
     *
     * @param date birthday date
     */
    void setBirthDay(Date date);

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Gets date of user's birthday
     *
     * @return date of user's birthday
     */
    Date getBirthDay();

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Sets user's city name
     *
     * @param city city name
     */
    void setCity(String city);

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Gets user's city name
     *
     * @return name of city where the user lives
     */
    String getCity();

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Sets user's country name
     *
     * @param country country name
     */
    void setCountry(String country);

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Gets user's country name
     *
     * @return name of country where the user lives
     */
    String getCountry();

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Sets user's first name
     *
     * @param firstName first name
     */
    void setFirstName(String firstName);

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Gets user's first name
     *
     * @return user's first name
     */
    String getFirstName();

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Sets user's last name
     *
     * @param lastName last name
     */
    void setLastName(String lastName);

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Gets user's last name
     *
     * @return user's last name
     */
    String getLastName();

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Sets user's gender
     *
     * @param gender gender
     */
    void setGender(Gender gender);

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Gets user's gender
     *
     * @return user's gender
     */
    Gender getGender();

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Sets user's login
     *
     * @param login login
     */
    void setLogin(String login);

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Gets user's login
     *
     * @return user's login
     */
    String getLogin();

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Sets user's password
     *
     * @param password password
     */
    void setPassword(String password);

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Gets user's password
     *
     * @return user's password
     */
    String getPassword();

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Sets user's phone number
     *
     * @param numberPhone phone number
     */
    void setNumberPhone(String numberPhone);

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Gets user's phone number
     *
     * @return user's phone number
     */
    String getNumberPhone();

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Sets user's picture
     *
     * @param photo byte representation of picture
     */
    void setPhoto(byte[] photo);

    /**
     * TODO посмотреть пример javaDoc из письма и исправить
     * Gets user's picture
     *
     * @return byte representation of user picture
     */
    byte[] getPhoto();
}