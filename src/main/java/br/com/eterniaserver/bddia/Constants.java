package br.com.eterniaserver.bddia;

public final class Constants {

    public static final String UTILITY_CLASS = "Constant class";

    public static final String INVALID_TOKEN = "label.invalid.token";
    public static final String INVALID_ROLE = "label.invalid.role";
    public static final String INVALID_LOCALE = "label.invalid.locale";
    public static final String INVALID_LOGIN = "label.invalid.login";
    public static final String USER_NOT_FOUND = "label.invalid.user-not-found";
    public static final String LOGIN_IN_USE = "label.invalid.login-already-in-use";
    public static final String INVALID_CREDENTIALS = "label.invalid.credentials";

    public static final String TOKEN_NEEDED = "label.token.needed";
    public static final String LOGIN_NEEDED = "label.login.needed";
    public static final String PASSWORD_NEEDED = "label.password.needed";
    public static final String NAME_NEEDED = "label.name.needed";
    public static final String SURNAME_NEEDED = "label.surname.needed";
    public static final String LOCALE_NEEDED = "label.locale.needed";


    private Constants() {
        throw new IllegalStateException(UTILITY_CLASS);
    }

}
