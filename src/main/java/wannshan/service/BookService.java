package wannshan.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 文件功能：xxxx
 *
 */
//@FeignClient("http://book-service")
public interface BookService {
    @RequestMapping(method = RequestMethod.GET,value = "/bookList")
    String getStores();

}
