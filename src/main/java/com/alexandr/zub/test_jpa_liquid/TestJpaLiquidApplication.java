package com.alexandr.zub.test_jpa_liquid;


import com.alexandr.zub.test_jpa_liquid.model.Status;
import com.alexandr.zub.test_jpa_liquid.model.User;
import com.alexandr.zub.test_jpa_liquid.repo.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJpaLiquidApplication implements CommandLineRunner {

    private static Logger LOG =  LoggerFactory.getLogger(TestJpaLiquidApplication.class);

    @Autowired
    UserRepo userRepo;

    public static void main(String[] args) {
        SpringApplication.run(TestJpaLiquidApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepo.save(new User("zzzualex1", "Zub", "Alexandr", true, Status.ACTIVE));
        LOG.info(userRepo.findByUsername("zzzualex").toString());
    }
}

