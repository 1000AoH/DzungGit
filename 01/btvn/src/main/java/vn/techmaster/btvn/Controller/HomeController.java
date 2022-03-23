package vn.techmaster.btvn.Controller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.techmaster.btvn.Service.BMI;
import vn.techmaster.btvn.Service.StudentList;

@Controller
@RequestMapping(value = "/")
public class HomeController {

      /* 1. Trả về random string 8 ký tự */

      @GetMapping(value = "/random", produces = MediaType.APPLICATION_JSON_VALUE)
      @ResponseBody
      public String get8RandomChar() {
            String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String digits = "0123456789";
            String alpha = upper + upper.toLowerCase() + digits;

            String[] x = new String[8];

            for (int i = 0; i < x.length; i++) {
                  int index = (int) (alpha.length() * Math.random());
                  x[i] = "" + alpha.charAt(index);
            }
            return String.join("", x);

      }

      /* 2. Trả về random câu tục ngữ */

      @GetMapping(value = "/quote", produces = MediaType.APPLICATION_JSON_VALUE)
      @ResponseBody
      public String getQuote() {
            String[] x = { "Kiến tha lâu đầy tổ", "Có công mài sắt, có ngày nên kim", "Không thầy đố mày làm nên",
                        "Học thầy không tày học bạn" };
            double y = Math.random() * 4;
            return x[(int) y];
      }

      /* 3. Tạo phương thức post tính BMI */

      @PostMapping(value = "/bmi", produces = MediaType.APPLICATION_JSON_VALUE)
      @ResponseBody
      public double calBMI(@RequestBody BMI bmi) {
            return bmi.getWeight() / (bmi.getHeight() * bmi.getHeight());
      }

      /* 4. Tạo phương thức get post cho student list */
      ArrayList<StudentList> x = new ArrayList<>();

      @GetMapping(value = "/student", produces = MediaType.APPLICATION_JSON_VALUE)
      @ResponseBody
      public ArrayList<StudentList> printList() {
            return x;
      }

      @PostMapping(value = "/student", produces = MediaType.APPLICATION_JSON_VALUE)
      @ResponseBody
      public StudentList addStudent(@RequestBody StudentList std) {
            x.add(std);
            return std;
      }

}
