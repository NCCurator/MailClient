package edu.netcracker.core.entities;

import edu.netcracker.core.api.Account;

/**
 * This class represents entity of account.
 * @author Murzin Mikhail
 * Date:13.12.2015.
 */
public class AccountEntity extends AbstractEntity implements Account {
    private String emailAddress;
    private String password;
    private String incomingServer;
    private int incomingPort;
    private String outgoingServer;
    private int outgoingPort;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String address) {
        this.emailAddress = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIncomingMailServer() {
        return incomingServer;
    }

    public void setIncomingMailServer(String server) {
        this.incomingServer = server;
    }

    public int getIncomingMailPort() {
        return incomingPort;
    }

    public void setIncomingMailPort(int port) {
        incomingPort = port;
    }

    public String getOutgoingMailServer() {
        return outgoingServer;
    }

    public void setOutgoingMailServer(String server) {
        this.outgoingServer = server;
    }

    public int getOutgoingMailPort() {
        return outgoingPort;
    }

    public void setOutgoingMailPort(int port) {
        this.outgoingPort = port;
    }
}
