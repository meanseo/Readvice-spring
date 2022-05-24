package kr.readvice.api.auth.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kr.readvice.api.user.domains.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName: kr.readvice.api.security.domains
 * fileName        : UserDetailsImpl
 * author           : 최민서
 * date               : 2022-05-23
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-23         최민서        최초 생성
 */
@Getter
@RequiredArgsConstructor
public class Auth implements UserDetails {
    private final long userId;
    private final String username;
    @JsonIgnore private final String password;
    private final String name;
    private final String email;

    public static Auth build(User user) {
        List<GrantedAuthority> authorities = user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getAuthority()))
                .collect(Collectors.toList());
        return new Auth(user.getUserId(), user.getUsername(),
                user.getPassword(), user.getName(), user.getEmail(), authorities);
    }

    private final Collection<? extends GrantedAuthority> authorities;

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
