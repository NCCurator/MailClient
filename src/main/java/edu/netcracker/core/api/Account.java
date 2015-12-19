package edu.netcracker.core.api;

/**
 * Interface which represents account entity. TODO привести в соответствии с javaDoc интерфкейса Letter
 *
 * @author Murzin Mikhail
 *         Date:13.12.2015.
 */
public interface Account {

    // TODO метод getId

    /**
     * TODO привести в соответствии с javaDoc интерфкейса Letter
     *
     * @return account email anddress
     */
    String getEmailAddress();

    /**
     * TODO привести в соответствии с javaDoc интерфкейса Letter
     * Set account address
     *
     * @param address Address of account
     */
    void setEmailAddress(String emailAddress);

    /**
     * TODO привести в соответствии с javaDoc интерфкейса Letter
     *
     * @return account password
     */

    String getPassword();

    /**
     * TODO привести в соответствии с javaDoc интерфкейса Letter
     * Set account password
     *
     * @param password Password of account
     */
    void setPassword(String password);

    /**
     * TODO привести в соответствии с javaDoc интерфкейса Letter
     *
     * @return incoming mail server of account
     */
    String getIncomingMailServer();

    /**
     * TODO привести в соответствии с javaDoc интерфкейса Letter
     * Set incoming mail server of account
     *
     * @param server server value
     */
    void setIncomingMailServer(String incomingMailServer);

    /**
     * TODO привести в соответствии с javaDoc интерфкейса Letter
     *
     * @return incoming mail port of current account
     */
    int getIncomingMailPort();

    /**
     * TODO привести в соответствии с javaDoc интерфкейса Letter
     * Set incoming mail port of current account
     *
     * @param port incoming port value
     */
    void setIncomingMailPort(int incomingMailPort);

    /**
     * TODO привести в соответствии с javaDoc интерфкейса Letter
     *
     * @return current outgoinng mail server of account
     */
    String getOutgoingMailServer();

    /**
     * TODO привести в соответствии с javaDoc интерфкейса Letter
     * Set outgoing server of account
     *
     * @param server outgoing server value
     */
    void setOutgoingMailServer(String outgoingMailServer);

    /**
     * TODO привести в соответствии с javaDoc интерфкейса Letter
     *
     * @return outgoing mail port of account
     */
    int getOutgoingMailPort();

    /**
     * TODO привести в соответствии с javaDoc интерфкейса Letter
     * Set outgoing mail port
     *
     * @param port outgoing mail port value
     */
    void setOutgoingMailPort(int outgoingMailPort);
}