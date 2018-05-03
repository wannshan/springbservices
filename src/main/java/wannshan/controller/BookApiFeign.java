package wannshan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wannshan.service.BookService;

/**
 * 文件功能：xxxx
 *
 */
@RestController
@RequestMapping("/feign")
public class BookApiFeign {
    @Autowired
    private BookService bookService;

//    @HystrixCommand(fallbackMethod = "bookListFial")
    @RequestMapping("/bookList")
    String bookList() {
        return bookService.bookListRemote();
    }
    @RequestMapping("/getBookById")
    String getBookById() {
        return bookService.getBookById();
    }
//    public String bookListFial() {
//        return "fail bu feign get result";
//    }
}
