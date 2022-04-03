package vn.techmasterr.jobhunt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Getter
public class Employer{
        String name;
        String website;
        String email;
        String address;
}
