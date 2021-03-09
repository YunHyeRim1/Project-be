package com.example.demo.uss.domain;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Objects;

import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component @Lazy @Getter
public class UserDto implements UserDetails {
	private static final long serialVersionUID = 1L;
	private long userNum;
	private String userid;
	private String password;
	private String username;
	private String email;
	private String gender;
	private String birthday;
	private String phoneNumber;
	private String admin;
	private String preferGenre;
	
	private Collection<? extends GrantedAuthority> authorities;
		
	public UserDto(long userNum, String userid, String password, String username, String email,
			Collection<? extends GrantedAuthority> authorities) {
		this.userNum = userNum;
		this.userid = userid;
		this.password = password;
		this.username = username;
		this.email = email;
		this.authorities = authorities;
	}
		
	public static UserDto create(User user) {
		List<GrantedAuthority> authorities = 
				user.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getRoleName().name()))
				.collect(Collectors.toList());
		return new UserDto(user.getUserNum(), user.getUserid(), user.getUsername(),
				user.getEmail(), user.getPassword(), authorities);
	}
	
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserDto that = (UserDto) o;
		return Objects.equals(userNum, that.userNum);
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}
	@Override
	public boolean isAccountNonExpired() {
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}
	@Override
	public boolean isEnabled() {
		return false;
	}
}
