package com.codenation.centralerros.service;

import com.codenation.centralerros.dto.UserDetailsDTO;
import com.codenation.centralerros.model.User;
import com.codenation.centralerros.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class UserService implements UserServiceInterface {
	

	private UserRepository userRepository;
	
	/*@Override
	public UserDetails loadUserByUsername(String username)  {
		User user = userRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException(username));
		return new UserDetailsDTO(user);
	}*/

	@Override
	public UserDetails findByName(String username)  {
		User user = userRepository.findByEmail(username);
		return new UserDetailsDTO(user);
	}

	public static UserDetailsDTO authenticated() {
		try {
			return (UserDetailsDTO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch (Exception e) {
			return null;
		}
	}
}
