package d02_structural_patterns.p06_adapter.s02_after;

import d02_structural_patterns.p06_adapter.s02_after.security.UserDetails;
import d02_structural_patterns.p06_adapter.s02_after.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        return new AccountUserDetails(accountService.findAccountByUsername(username));
    }
}
