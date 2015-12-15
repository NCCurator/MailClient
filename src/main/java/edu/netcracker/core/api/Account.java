package edu.netcracker.core.api;

/**
 *
 * Interface which represents account entity.
 * @author Murzin Mikhail
 * Date:13.12.2015.
 */
public interface Account {
    /**
     *
     * @return account email anddress
     * */

    String getEmailAddress();

    /**
     * Set account address
     * @param address Address of account
     */

    void setEmailAddress(String address);

    /**
     *
     * @return account password
     */

    String getPassword();

    /**
     *Set account password
     * @param password Password of account
     */

    void setPassword(String password);

    /**
     *
     * @return incoming mail server of account
     */

    String getIncomingMailServer();

    /**
     * Set incoming mail server of account
     * @param server server value
     */

    void setIncomingMailServer(String server);

    /**
     *
     * @return incoming mail port of current account
     */

    int getIncomingMailPort();

    /**
     * Set incoming mail port of current account
     * @param port incoming port value
     */

    void setIncomingMailPort(int port);

    /**
     *
     * @return current outgoinng mail server of account
     */

    String getOutgoingMailServer();

    /**
     * Set outgoing server of account
     * @param server outgoing server value
     */

    void setOutgoingMailServer(String server);

    /**
     *
     * @return outgoing mail port of account
     */

    int getOutgoingMailPort();

    /**
     * Set outgoing mail port
     * @param port outgoing mail port value
     */

    void setOutgoingMailPort(int port);




}
