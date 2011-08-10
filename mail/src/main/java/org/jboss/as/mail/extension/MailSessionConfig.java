package org.jboss.as.mail.extension;

import org.jboss.as.controller.parsing.ParseUtils;
import org.jboss.logging.Logger;
import org.jboss.staxmapper.XMLExtendedStreamReader;

import javax.xml.stream.XMLStreamException;
import java.util.Properties;

import static javax.xml.stream.XMLStreamConstants.END_ELEMENT;

/**
 * @author <a href="tomaz.cerar@gmail.com">Tomaz Cerar</a>
 * @created 25.7.11 15:48
 */
public class MailSessionConfig {
    private static final Logger log = Logger.getLogger(MailSessionConfig.class);
    private String jndiName;
    private String username;
    private String password;
    private boolean debug = false;

    private MailSessionServer smtpServer;
    private MailSessionServer pop3Server;
    private MailSessionServer imapServer;



    protected MailSessionConfig() {

    }

    public String getJndiName() {
        return jndiName;
    }

    public void setJndiName(String jndiName) {
        this.jndiName = jndiName;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public MailSessionServer getImapServer() {
        return imapServer;
    }

    public void setImapServer(MailSessionServer imapServer) {
        this.imapServer = imapServer;
    }

    public MailSessionServer getPop3Server() {
        return pop3Server;
    }

    public void setPop3Server(MailSessionServer pop3Server) {
        this.pop3Server = pop3Server;
    }

    public MailSessionServer getSmtpServer() {
        return smtpServer;
    }

    public void setSmtpServer(MailSessionServer smtpServer) {
        this.smtpServer = smtpServer;
    }

    @Override
    public String toString() {
        return "MailSessionConfig{" +
                "imapServer=" + imapServer +
                ", jndiName='" + jndiName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", smtpServer=" + smtpServer +
                ", pop3Server=" + pop3Server +
                '}';
    }
}
