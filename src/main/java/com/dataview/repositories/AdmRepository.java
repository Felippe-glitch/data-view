package com.dataview.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dataview.models.Administrator;

@Repository
public interface AdmRepository extends JpaRepository<Administrator, Long>{}