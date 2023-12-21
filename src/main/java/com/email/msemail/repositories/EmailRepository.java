package com.email.msemail.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.email.msemail.model.Email;



public interface EmailRepository extends JpaRepository<Email, Long> {
}