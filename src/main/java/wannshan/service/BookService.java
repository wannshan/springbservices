package wannshan.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 文件功能：xxxx
 *
 */
@FeignClient(value = "http://book-service",fallbackFactory = HystrixClientFallbackFactoryBookService.class)
public interface BookService {
    @RequestMapping(method = RequestMethod.GET,value = "/bookList")
    String bookListRemote();

    @RequestMapping(method = RequestMethod.GET,value = "/getBookById")
    String getBookById();
}
