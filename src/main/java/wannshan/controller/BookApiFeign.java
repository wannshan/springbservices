package wannshan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件功能：xxxx
 *
 */
@RestController
@RequestMapping("/feign")
public class BookApiFeign {
//    @Autowired
//    private BookService bookService;

//    @HystrixCommand(fallbackMethod = "bookListFial")
//    @RequestMapping("/bookList")
//    String bookList() {
//        return bookService.getStores();
//    }
//
//    public String bookListFial() {
//        return "fail bu feign get result";
//    }
}
