package com.tepth.maintenancedispatch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class MaintenanceDispatchApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void demo(){
        Random random = new Random();
        for (int i = 0; i < 100; i++) {

            System.out.print(random.nextInt(6)+", ");
        }
    }

}

