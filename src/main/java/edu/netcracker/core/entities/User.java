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

    public void setAccounts(Map<String, Accounts> accounts) {
        this.accounts = accounts;
    }

    public Map<String, Accounts> getAccounts() {
        return this.accounts;
    }

    public void setBirthDay(Date date) {
        this.birthDay = date;
    }

    public Date getBirthDay() {
        return this.birthDay;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return this.login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getNumberPhone() {
        return this.numberPhone;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo.clone();
    }

    public byte[] getPhoto() {
        return this.photo.clone();
    }

}
