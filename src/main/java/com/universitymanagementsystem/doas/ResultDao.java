package com.universitymanagementsystem.doas;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universitymanagementsystem.entity.Result;

public interface ResultDao extends JpaRepository<Result, Long>{

}
