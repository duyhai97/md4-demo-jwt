package com.example.demo.service.implement;

import com.example.demo.model.Role;
import com.example.demo.model.RoleName;
import com.example.demo.repository.IRoleRepository;
import com.example.demo.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService implements IRoleService {

    @Autowired
    private IRoleRepository repository;

    @Override
    public Optional<Role> findByName(RoleName name) {
        return repository.findByName(name);
    }
}
