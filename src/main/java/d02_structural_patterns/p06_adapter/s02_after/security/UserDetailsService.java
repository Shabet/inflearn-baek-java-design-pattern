package d02_structural_patterns.p06_adapter.s02_after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
