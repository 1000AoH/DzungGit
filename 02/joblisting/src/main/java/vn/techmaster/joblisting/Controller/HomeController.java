package vn.techmaster.joblisting.Controller;


import org.springframework.web.bind.annotation.*;
import vn.techmaster.joblisting.job.Job;
import vn.techmaster.joblisting.job.location;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/job")
public class HomeController {
    HashMap<String, Job> joblist =new HashMap<>();
    public HomeController(){
        joblist.put("01", new Job("01","Saleman","SALE course, BDS, etc", location.HaNoi, 500, 700, "Dung@gmail.com"));
        joblist.put("02", new Job("02","Saleman","Ed-tech, Course", location.HaiPhong, 1000, 2000, "Dung@gmail.com"));
        joblist.put("03", new Job("03","Finance","Hospitality", location.HoChiMinh, 4000, 5000, "Dung@gmail.com"));
        joblist.put("04", new Job("04","Saleman","SALE Ed-tech, financial service", location.DaNang, 200, 700, "Dung@gmail.com"));
        joblist.put("05", new Job("05","Developer","Ecommerce", location.HaNoi, 1000, 2000, "Dung@gmail.com"));
    }

    @GetMapping
    public List<Job> getAllJob(){
        return joblist.values().stream().collect(Collectors.toList());
    }
    @PostMapping
    public Job newJob(@RequestBody Job job){
        joblist.put(job.getId(),job);
        return job;
    }
    @DeleteMapping(value="/{id}")
    public void deleteJob(@PathVariable("id") String id){
        joblist.remove(id);
        return;
    }
    @PutMapping(value = "/{id}")
    public Job changeJob(@PathVariable("id") String id, @RequestBody Job job){
        joblist.replace(id,job);
        return joblist.get(id);
    }

    @GetMapping(value = "/sortbylocation")
    public List<Job> sortByLocation(){
        List<Job> mutableList = joblist.values().stream().collect(Collectors.toList());
        mutableList.sort(new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                return o1.getLocation().compareTo(o2.getLocation());
            }
        });
        return mutableList;
    }

    @GetMapping(value = "/salary/{salary}")
    public List<Job> findMatchSalary(@PathVariable("salary") int salary){
        List<Job> fullList = joblist.values().stream().collect(Collectors.toList());
        List<Job> matchList = new ArrayList<>();

        for (Job j : fullList){
            if (j.getMin_salary()<salary && j.getMax_salary()>salary){
                matchList.add(j);
            }
        }

        return matchList;
    }

    @GetMapping(value = "/keyword/{keyword}")
    public List<Job> SEO(@PathVariable("keyword") String keyword){
        List<Job> fullList = joblist.values().stream().collect(Collectors.toList());
        List<Job> matchList = new ArrayList<>();
        String lowercaseKeyword = keyword.toLowerCase();
        for (Job j : fullList){
            if (j.getTitle().toLowerCase().contains(lowercaseKeyword)|| j.getDescription().toLowerCase().contains(keyword)){
                matchList.add(j);
            }
        }
        return matchList;
    }
    @GetMapping(value = "/query")
    public List<Job> MatchLocationAndKeyword(@RequestParam("keyword") String keyword, @RequestParam("location") String location){
        List<Job> fullList = joblist.values().stream().collect(Collectors.toList());
        List<Job> matchList = new ArrayList<>();
        String lowercaseKeyword = keyword.toLowerCase();
        for (Job j : fullList){
            String s = j.getLocation().name().toLowerCase(Locale.ROOT);
            if ((j.getTitle().toLowerCase().contains(lowercaseKeyword)|| j.getDescription().toLowerCase().contains(lowercaseKeyword)) && s.contains(location.toLowerCase()) ){
                matchList.add(j);
            }
        }
        return matchList;
    }
}
