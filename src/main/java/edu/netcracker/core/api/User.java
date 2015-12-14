package edu.netcracker.core.api;

import java.util.Date;

/**
 * Interface which represents user's entity.
 * @author Zubenko Eugene
 * Date: 14.12.2015
 */
public interface User {
    /**
     * Sets map of user's mail-accounts and their names
     * @param accounts accounts' map
     */
    public void setAccounts(Map<String, Accounts> accounts);

    /**
     * Gets map of user's mail-accounts and their names
     * @return map of user's mail-accounts and their names
     */
    public Map<String, Accounts> getAccounts();

    /**
     * Sets date of user's birthday
     * @param date birthday date
     */
    public void setBirthDay(Date date);

    /**
     * Gets date of user's birthday
     * @return date of user's birthday
     */
    public Date getBirthDay();

    /**
     * Sets user's city name
     * @param city city name
     */
    public void setCity(String city);

    /**
     * Gets user's city name
     * @return name of city where the user lives
     */
    public String getCity();

    /**
     * Sets user's country name
     * @param country country name
     */
    public void setCountry(String country);

    /**
     * Gets user's country name
     * @return name of country where the user lives
     */
    public String getCountry();

    /**
     * Sets user's first name
     * @param firstName first name
     */
    public void setFirstName(String firstName);

    /**
     * Gets user's first name
     * @return user's first name
     */
    public String getFirstName();

    /**
     * Sets user's last name
     * @param lastName last name
     */
    public void setLastName(String lastName);

    /**
     * Gets user's last name
     * @return user's last name
     */
    public String getLastName();

    /**
     * Sets user's gender
     * @param gender gender
     */
    public void setGender(Gender gender);

    /**
     * Gets user's gender
     * @return user's gender
     */
    public Gender getGender();

    /**
     * Sets user's login
     * @param login login
     */
    public void setLogin(String login);

    /**
     * Gets user's login
     * @return user's login
     */
    public String getLogin();

    /**
     * Sets user's password
     * @param password password
     */
    public void setPassword(String password);

    /**
     * Gets user's password
     * @return user's password
     */
    public String getPassword();

    /**
     * Sets user's phone number
     * @param numberPhone phone number
     */
    public void setNumberPhone(String numberPhone);

    /**
     * Gets user's phone number
     * @return user's phone number
     */
    public String getNumberPhone();

    /**
     * Sets user's picture
     * @param photo byte representation of picture
     */
    public void setPhoto(byte[] photo);

    /**
     * Gets user's picture
     * @return byte representation of user picture
     */
    public byte[] getPhoto();

}