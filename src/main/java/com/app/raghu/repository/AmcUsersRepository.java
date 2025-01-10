package com.app.raghu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.raghu.entity.AmsUsers;

public interface AmcUsersRepository extends JpaRepository<AmsUsers, Integer> {

    @Query("SELECT a.username FROM AmsUsers a WHERE a.username =:username")
    AmsUsers GetValidation(String username);

}
