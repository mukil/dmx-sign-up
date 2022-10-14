package systems.dmx.signup.configuration;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Static configuration values from DMX' config.properties.
 */
public class SignUpConfigOptions {

    // --- Global config options
    public static final String DMX_HOST_URL = System.getProperty("dmx.host.url");
    public static final boolean DMX_ACCOUNTS_ENABLED = Boolean.parseBoolean(System.getProperty("dmx.security.new_accounts_are_enabled"));

    // --- Sign-up config options
    public static final boolean CONFIG_SELF_REGISTRATION = Boolean.parseBoolean(System.getProperty("dmx.signup.self_registration"));
    public static final boolean CONFIG_EMAIL_CONFIRMATION = Boolean.parseBoolean(System.getProperty("dmx.signup.confirm_email_address"));
    public static final String CONFIG_ADMIN_MAILBOX = System.getProperty("dmx.signup.admin_mailbox");
    public static final String CONFIG_FROM_MAILBOX = System.getProperty("dmx.signup.system_mailbox");
    public static final boolean CONFIG_CREATE_LDAP_ACCOUNTS = Boolean.parseBoolean(System.getProperty("dmx.signup.ldap_account_creation", "false"));

    public static final String CONFIG_ACCOUNT_CREATION_AUTH_WS_URI = System.getProperty("dmx.signup.account_creation_auth_ws_uri", "");

    public static final String CONFIG_RESTRICT_AUTH_METHODS = System.getProperty("dmx.signup.restrict_auth_methods", "");

}
