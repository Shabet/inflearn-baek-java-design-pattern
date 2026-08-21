package d02_structural_patterns.p06_adapter.s02_after;

import d02_structural_patterns.p06_adapter.s02_after.security.LoginHandler;
import d02_structural_patterns.p06_adapter.s02_after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("keesun", "keesun");
        System.out.println(login);
    }
}
