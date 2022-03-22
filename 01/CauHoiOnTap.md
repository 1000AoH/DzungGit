**1. Trong quá trình tạo dự án Spring Boot chúng ta phải khai báo những tham số sau đây : groupID, artifactID. Ý nghĩa các tham số này là gì?**
- groupID: id của nhóm, công ty tạo ra dự án/ thư viện. (vdu: techmaster)
- artifactID: id của dự án giúp xác định dự án/ thư viện.  

**2. Tại sao phải đảo ngược tên miền trong <groupId>vn.techmaster</groupId>?**
- Phục vụ mục đích tìm kiếm toàn bộ dự án được phát triển bởi cùng 1 đối tượng (groupID).

**3. SpringBoot có 2 cơ chế để quản lý thư viện. Hãy kể tên chúng?** EM CHƯA BIỂT

**4. File pom.xml có tác dụng gì?**

- Tập tin được sử dụng bởi Maven (một chương trình Java sử dụng để xây dựng các ứng dụng Java và quản lý phụ thuộc) chứa thông tin được xây dựng, vdu như dependency, dependency scope, và các thông tin của package.

**5. Trong file pom.xml có các thẻ dependency. Ý nghĩa của chúng là gì?**
- Các thẻ dependency (các phụ thuộc) là các thư viện được sử dụng trong dự án

**6. Ý nghĩa của @Controllerlà gì? **
- Là 1 annotation cho Controller trong ứng dụng Spring boot. Controller là nơi tiếp nhận request và trả về response cho client. Có thể hiểu controller chính là lớp trung gian giữa server và user.

**7. Ý nghĩa của @RequestMapping là gì? Nó có những tham số gì ngoài value?**
- Annotation @RequestMapping để định cấu hình ánh xạ các web request. @RequestMapping cấp class ánh xạ một đường dẫn hoặc mẫu request cụ thể lên controller, @RequestMapping cấp function để làm cho ánh xạ cụ thể hơn đối với các phương thức xử lý.
- Các params khác ngoài value: HTTP Methods (GET, POST, PATCH, PUT, DELETE), produces, headers, params, 

**8. Ý nghĩa của @RequestResponse khi đặt trong hàm hứng request để làm gì?**
- Để yêu cầu kết quả phản hồi từ sever 

**9. Hãy trả lời khi nào thì dùng @PathVariable và khi nào nên dùng @RequestParam**
- Cả 2 cách trên đều thực hiện chung một nhiệm vụ là lấy các tham số từ người dùng truyền lên trong URL. 
- @PathVariable được sử dụng cho dữ liệu được truyền trong URL -> Phù hợp dịch vụ web RESTful nơi URL chưa value. @RequestParam được sử dụng để trích xuất dữ liệu được tìm thấy trong các tham số truy vấn -> phù hợp cho các web truyền thống nơi dữ liệu chủ yếu được chuyển vào các tham số truy vấn.

**10. Thứ tự các thành phần đường dẫn @PathVariable có thể hoán đổi được không?**
- Không thay đổi được, phải type đúng thứ tự.

**11. @GetMapping khác gì so với @PostMapping?**
- @Getmapping là chỉ báo thực hiện GET request, @PostMapping là chỉ báo thực hiện Post request.
- GET và POST là hai loại yêu cầu HTTP khác nhau. GET được sử dụng để xem nội dung nào đó mà không cần thay đổi nội dung đó, trong khi POST được sử dụng để thay đổi nội dung nào đó.
 
**12. Trong các annotation @RequestMapping, @GetMapping, @PostMapping… có tham số produces = MediaType.XXXX ý nghĩa tham số này là gì?**
- Để xác định các annotation request trên tạo ra giữ liệu kiểu gì.

**13. Giải thích ý nghĩa của @RequestBody trong đoạn code dưới đây**
- @RequestBody sẽ gửi thông tin bổ sung theo yêu cầu của máy chủ để xử lý Request Post hiện tại.

**14. Cổng mặc định ứng dụng SpringBoot là 8080. Hãy google cách để thay đổi cổng lắng nghe mặc định**
- Dùng command line gõ java -jar spring-(version).jar --server.port=8083 (cái này phải cài spring CLI trong máy)
