package com.example.demo.service;


import com.example.demo.model.User;

import java.util.Optional;

public interface IUserService {
    Optional<User> findById(Long id);
    void delete(Long id);
    Iterable<User> findAll();
    Optional<User> findByUsername(String name); //Tim kiem User co ton tai trong DB khong?
    Boolean existsByUsername(String username); //username da co trong DB chua, khi tao du lieu
    Boolean existsByEmail(String email); //email da co trong DB chua
//    com.example.demo.model.User save(User user);
    void create(User user);
}
