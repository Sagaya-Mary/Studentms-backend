package com.trainingsapp.schoolms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainingsapp.schoolms.entities.Admin;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Long>{

}
