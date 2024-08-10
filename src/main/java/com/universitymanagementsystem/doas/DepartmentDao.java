package com.universitymanagementsystem.doas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.universitymanagementsystem.entity.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Long> {

}
