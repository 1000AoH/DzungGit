package vn.techmaster.joblisting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.techmaster.joblisting.job.location;

import java.util.HashMap;
import java.util.Locale;

@SpringBootApplication
public class JoblistingApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoblistingApplication.class, args);
        HashMap<String, Integer> jobs =new HashMap<>();
        location x = location.HaNoi;
        String y = x.name();
        System.out.println(y.toLowerCase(Locale.ROOT).equals("hanoi"));

    }

}
