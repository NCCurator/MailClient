package edu.netcracker.core.entities;

import java.util.Date;

/**
 * Class which represents user's entity.
 * @author Zubenko Eugene
 * Date: 14.12.2015
 */
public class User extends AbstractEntity {
    /**
     * Map of user's mail-accounts and their names
     */
    private Map<String, Account> accounts;
    /**
     * Date of user's birthday
     */
    private Date birthDay;
    /**
     * The city where the user lives
     */
    private String city;
    /**
     * The country where the user lives
     */
    private String country;
    /**
     * User's first name
     */
    private String firstName;
    /**
     * User's last name
     */
    private String lastName;
    /**
     * User's gender
     */
    private Gender gender;
    /**
     * User's login
     */
    private String login;
    /**
     * User's password
     */
    private String password;
    /**
     * Byte representation of user picture
     */
    private byte[] photo;
    /**
     * User's phone number
     */
    private String numberPhone;

    /**
     * Call superclass' constructor
     */
    public User() {
        super();
    }

    /**
     * Sets map of user's mail-accounts and their names
     * @param accounts accounts' map
     */
    public void setAccounts(Map<String, Accounts> accounts) {
        this.accounts = accounts;
    }

    /**
     * Gets map of user's mail-accounts and their names
     * @return map of user's mail-accounts and their names
     */
    public Map<String, Accounts> getAccounts() {
        return this.accounts;
    }

    /**
     * Sets date of user's birthday
     * @param date birthday date
     */
    public void setBirthDay(Date date) {
        this.birthDay = date;
    }

    /**
     * Gets date of user's birthday
     * @return date of user's birthday
     */
    public Date getBirthDay() {
        return this.birthDay;
    }

    /**
     * Sets user's city name
     * @param city city name
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets user's city name
     * @return name of city where the user lives
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Sets user's country name
     * @param country country name
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets user's country name
     * @return name of country where the user lives
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Sets user's first name
     * @param firstName first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets user's first name
     * @return user's first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Sets user's last name
     * @param lastName last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets user's last name
     * @return user's last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Sets user's gender
     * @param gender gender
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * Gets user's gender
     * @return user's gender
     */
    public Gender getGender() {
        return this.gender;
    }

    /**
     * Sets user's login
     * @param login login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Gets user's login
     * @return user's login
     */
    public String getLogin() {
        return this.login;
    }

    /**
     * Sets user's password
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets user's password
     * @return user's password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Sets user's phone number
     * @param numberPhone phone number
     */
    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    /**
     * Gets user's phone number
     * @return user's phone number
     */
    public String getNumberPhone() {
        return this.numberPhone;
    }

    /**
     * Sets user's picture
     * @param photo byte representation of picture
     */
    public void setPhoto(byte[] photo) {
        this.photo = photo.clone();
    }

    /**
     * Gets user's picture
     * @return byte representation of user picture
     */
    public byte[] getPhoto() {
        return this.photo.clone();
    }

}
