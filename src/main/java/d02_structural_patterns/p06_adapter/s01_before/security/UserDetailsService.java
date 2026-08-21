package d02_structural_patterns.p06_adapter.s01_before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
