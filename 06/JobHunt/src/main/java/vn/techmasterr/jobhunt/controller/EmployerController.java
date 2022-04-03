package vn.techmasterr.jobhunt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.techmasterr.jobhunt.model.Employer;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/employer")
public class EmployerController {
    ConcurrentHashMap<String, Employer> employerList =new ConcurrentHashMap<>();
    public EmployerController(){
        employerList.put("01",new Employer("Dzung", "abc.com", "Dzung@gmail.com"," Hanoi"));
        employerList.put("02",new Employer("Duke", "cba.com", "Duke@gmail.com"," Hanoi"));
        employerList.put("03",new Employer("Nogo", "cca.com", "Nogo@gmail.com"," Hanoi"));
    }

    @GetMapping("/list")
    public String students(Model model) {
        var employers = employerList.values().stream().collect(Collectors.toList());
        model.addAttribute("employers", employers);
        return "employer/list";
    }

    @GetMapping("/add")
    public String employerForm(Model model){
        model.addAttribute("employer", new Employer());
        return "employer/add";
    }

    @PostMapping("/add")
    public String createEmployer(Model model, @ModelAttribute("employer") Employer employer){
        employerList.put(UUID.randomUUID().toString(), new Employer(employer.getName(),employer.getWebsite(),employer.getEmail(),employer.getAddress()));
        return "redirect:/employer/list";
    }
}
