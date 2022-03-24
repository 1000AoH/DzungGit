package vn.techmaster.joblisting.job;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    private String id, title, description;
    private location location;
    private int min_salary, max_salary;
    private String email_to;
}
