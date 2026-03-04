package com.kh.spring.member.model.vo;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MemberExt extends Member implements UserDetails {

	private List<SimpleGrantedAuthority> authorities;
	
	// SimpleGrantedAuthority
	// - 문자열 형태의 권한
	// "ROLE_USER", "ROLE_ADMIN", "ROLE_MANAGER"...
	
	// 사용자가 가진 권한몬곩을 반환하는 메서드
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return this.authorities;
	}
	
	// getPassword/ getUsername
	// - 시큐리티에서 비밀번호/아이디를 가져올 때 사용하는 메서드
	// - id역할의 필드가 username이 아니거나, 비밀번호역할의 필드가 password가
	//   아닌 경우 오버라이딩이 필요.

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return getUserPwd();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return getUserId();
	}

	// 계정의 만료상태, 잠금상태, 사용가능여부 등을 반환하는 메서드.
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
