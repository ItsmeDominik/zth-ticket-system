package com.example.zthticketsystem.repository;

import com.example.zthticketsystem.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsersRepository extends  JpaRepository<UsersModel, Integer> {


    public UsersModel findByUsername(String email);
}