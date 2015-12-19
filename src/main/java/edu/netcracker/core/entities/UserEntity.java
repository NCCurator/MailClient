package edu.netcracker.core.entities;

import edu.netcracker.core.api.Account;
import edu.netcracker.core.api.Gender;
import edu.netcracker.core.api.User;

import java.util.Date;
import java.util.Map;

/**
 * Class which represents user's entity. TODO класс содержит поля содержащие информацию об учетной записи пользователя,
 * а так же методы для получения и измменения этой информации
 *
 * @author Zubenko Eugene
 *         Date: 14.12.2015
 */
public class UserEntity extends AbstractEntity implements User {

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
     * User first name
     */
    private String firstName;
    /**
     * User last name
     */
    private String lastName;
    /**
     * User gender
     */
    private Gender gender;
    /**
     * User login
     */
    private String login;
    /**
     * User password
     */
    private String password;
    /**
     * Byte representation of user picture
     */
    private byte[] photo;
    /**
     * User phone number
     */
    private String numberPhone;

    /**
     * Call superclass' constructor TODO дописать передачу параметров в конструктор
     */
    public UserEntity() {
        super();
    }

    @Override
    public void setAccounts(Map<String, Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public Map<String, Account> getAccounts() {
        return accounts;
    }

    @Override
    public void setBirthDay(Date date) {
        this.birthDay = date;
    }

    @Override
    public Date getBirthDay() {
        return birthDay;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String getNumberPhone() {
        return numberPhone;
    }

    @Override
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public byte[] getPhoto() {
        return photo.clone();
    }
}
