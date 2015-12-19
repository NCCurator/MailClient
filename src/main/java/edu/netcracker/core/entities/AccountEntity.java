package edu.netcracker.core.entities;

import edu.netcracker.core.api.Account;

/**
 * This class represents entity of account. TODO класс содержит поля содержащие информацию об учетной записи пользователя на почтовом сервере с которого будет скачиваться информация и через который будет посылаться письмо,
 * а так же методы для получения и измменения этой информации
 *
 * @author Murzin Mikhail
 *         Date:13.12.2015.
 */
public class AccountEntity extends AbstractEntity implements Account {

    // TODO javaDoc c описанием поля
    private String emailAddress;
    // TODO javaDoc c описанием поля
    private String password;
    // TODO javaDoc c описанием поля
    private String incomingMailServer;
    // TODO javaDoc c описанием поля
    private int incomingMailPort;
    // TODO javaDoc c описанием поля
    private String outgoingMailServer;
    // TODO javaDoc c описанием поля
    private int outgoingMailPort;

    // TODO конструктор с передачей параметров

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getIncomingMailServer() {
        return incomingMailServer;
    }

    @Override
    public void setIncomingMailServer(String incomingMailServer) {
        this.incomingMailServer = incomingMailServer;
    }

    @Override
    public int getIncomingMailPort() {
        return incomingMailPort;
    }

    @Override
    public void setIncomingMailPort(int incomingMailPort) {
        this.incomingMailPort = incomingMailPort;
    }

    @Override
    public String getOutgoingMailServer() {
        return outgoingMailServer;
    }

    @Override
    public void setOutgoingMailServer(String outgoingMailServer) {
        this.outgoingMailServer = outgoingMailServer;
    }

    @Override
    public int getOutgoingMailPort() {
        return outgoingMailPort;
    }

    @Override
    public void setOutgoingMailPort(int port) {
        this.outgoingMailPort = outgoingMailPort;
    }
}
