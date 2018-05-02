package wannshan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 文件功能：xxxx
 *
 */
@RestController
public class BookController {


    @RequestMapping(method = RequestMethod.GET,value = "/bookList")
    String bookList(HttpServletRequest request) {
        String results = null;
        try {
            results = "bookList from "+ InetAddress.getLocalHost().getHostAddress()+":"+request.getLocalPort();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.err.println(results);
        return results;
    }

    @RequestMapping(method = RequestMethod.GET,value ="/getBookById")
    String getBookById(HttpServletRequest request) {
        String results = null;
        try {
            results = "getBookById from "+ InetAddress.getLocalHost().getHostAddress()+":"+request.getLocalPort();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        ;
        System.err.println(results);
        return results;
    }
}
