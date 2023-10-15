package com.orangefanpage.orangelogin;

import com.orangefanpage.orangelogin.models.FanPages;
import com.orangefanpage.orangelogin.repositories.FanPagesRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class FanPagesRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private FanPagesRepository repo;

    @Test
    public void testCreateFanPage(){
        FanPages fanPages = new FanPages();
        fanPages.setFanPageTitle("Studio Ghibli");
        fanPages.setFanPageURL("http://localhost:8080");

        FanPages savedFanPage = repo.save(fanPages);
        FanPages existFanPage = entityManager.find(FanPages.class, savedFanPage.getId());

        //AssertJ's assertThat method to make sure created user in database has appropriate data
        assertThat(existFanPage.getFanPageTitle()).isEqualTo(fanPages.getFanPageURL());
        assertThat(existFanPage.getFanPageURL()).isEqualTo(fanPages.getFanPageURL());
    }
}
