package com.proyecto.practicas.services.implementations;

import com.proyecto.practicas.models.Usuario;
import com.proyecto.practicas.repositories.UserRepository;
import com.proyecto.practicas.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public Usuario updateUser(Long userId, Usuario updatedUser) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return userRepository.findAll();
    }

    @Override
    public Boolean ExistUserByEmail(String email) {
    	
       return userRepository.existsByEmail(email);
    }


    @Autowired
    private UserRepository userRepository;
}
