package com.orangefanpage.orangelogin.repositories;


import com.orangefanpage.orangelogin.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> { //This interface is a subtype of JpaRepository which defines common persistence operations (including CRUD)
    //< User, Long> User is the class and Long is the type of ID for the repository
}
