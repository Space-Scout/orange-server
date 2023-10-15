package com.orangefanpage.orangelogin;

import com.orangefanpage.orangelogin.models.User;
import com.orangefanpage.orangelogin.controllers.UserRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class UserRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository repo;

    @Test
    public void testCreateUser(){
        User user = new User();
        user.setPassword("testpassword");
        user.setUsername("Mr. Mittens");
        user.setFirstName("DJ");
        user.setLastName("Khaled");

        User savedUser = repo.save(user);
        User existUser = entityManager.find(User.class, savedUser.getId());

        //AssertJ's assertThat method to make sure created user in database has appropriate data
        assertThat(user.getPassword()).isEqualTo(existUser.getPassword());
        assertThat(user.getUsername()).isEqualTo(existUser.getUsername());
        assertThat(user.getFirstName()).isEqualTo(existUser.getFirstName());
        assertThat(user.getLastName()).isEqualTo(existUser.getLastName());
    }
}
