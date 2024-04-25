package com.devjunior.Userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjunior.Userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
