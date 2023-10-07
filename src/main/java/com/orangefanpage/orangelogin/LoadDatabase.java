

//For testing purposes during development.
/*

package com.orangefanpage.orangelogin;


import com.orangefanpage.orangelogin.controllers.UserRepository;
import com.orangefanpage.orangelogin.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {
        User user = new User();
        user.setPassword("testpassword");
        user.setUsername("Mr. Mittens");
        user.setFirstName("DJ");
        user.setLastName("Khaled");
        return args -> {
            log.info("Preloading " + repository.save(user));
        };

    }

}

*/
