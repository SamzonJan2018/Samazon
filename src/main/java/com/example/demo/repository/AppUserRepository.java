package com.example.demo.repository;

import com.example.demo.model.AppRole;
import com.example.demo.model.AppUser;
import org.springframework.data.repository.CrudRepository;

import java.util.HashSet;

public interface AppUserRepository  extends CrudRepository<AppUser,Long>{

    AppUser findAppUserByUsername(String username);
    HashSet<AppUser> findByRoles(AppRole r);
}
