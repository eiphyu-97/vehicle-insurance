package com.motor.insurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.motor.insurance.entity.UserEntity;

public interface UserDao extends CrudRepository<UserEntity, Integer>,JpaRepository<UserEntity, Integer>{

}
