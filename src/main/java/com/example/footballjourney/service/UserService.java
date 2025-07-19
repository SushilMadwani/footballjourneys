package com.example.footballjourney.service;

import com.example.footballjourney.entity.User;
import com.example.footballjourney.model.NewUser;
import com.example.footballjourney.model.UserDTO;
import com.example.footballjourney.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserDTO> getUsers() {
        List<User> usersEntity = userRepository.findAll();
        return usersEntity.stream().map(en -> new UserDTO(en.getId(),en.getName(), en.getPwd())).toList();
    }

    public UserDTO createUser(NewUser newUser) {
        User user = new User();
        user.setName(newUser.getUser());
        user.setPwd(newUser.getPwd());
        user.setRole(newUser.getRole());
        User savedUser = userRepository.save(user);
        return new UserDTO(savedUser.getId(), savedUser.getName(), savedUser.getRole());

    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
