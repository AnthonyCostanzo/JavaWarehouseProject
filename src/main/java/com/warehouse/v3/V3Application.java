package com.warehouse.v3;

import com.warehouse.v3.models.Authority;
import com.warehouse.v3.models.User;
import com.warehouse.v3.repositories.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class V3Application {
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private UserDetailsRepository userDetailsRepository;

	public static void main(String[] args) {
		SpringApplication.run(V3Application.class, args);
	}

	@PostConstruct
	protected void init() {
		List<Authority> authorityList = new ArrayList<>();
		authorityList.add(createAuthority("USER","User role"));
		authorityList.add(createAuthority("ADMIN","Admin role"));
		User user = new User();
		user.setFirstname("John");
		user.setLastname("Bird");
		user.setUsername("john@gmail.com");
		user.setPassword(passwordEncoder.encode("123"));
		user.setEnabled(true);
		user.setAuthorities(authorityList);
		userDetailsRepository.save(user);
	}

	private Authority createAuthority(String roleCode, String roleDescription) {
		Authority authority = new Authority();
		authority.setRoleCode(roleCode);
		authority.setRoleDescription(roleDescription);
		return authority;
	}


}
