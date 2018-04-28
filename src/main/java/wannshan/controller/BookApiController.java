package wannshan.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 文件功能：xxxx
 *
 */
@RestController
@RequestMapping("/api")
public class BookApiController {

    @Autowired
    RestTemplate restTemplate;

//    @Autowired
//    private EurekaClient discoveryClient;
    @HystrixCommand(fallbackMethod = "bookListFial")
    @RequestMapping("/bookList")
    String bookList() {
        String results = restTemplate.getForObject("http://book-service/bookList", String.class);
        return results;
    }

    public String bookListFial() {
        return "fail bu havelist";
    }
    @RequestMapping("/getBookById")
    String getBookById() {
        String results = restTemplate.getForObject("http://book-service/bookList", String.class);
        return results;
//        InstanceInfo instance = discoveryClient.getNextServerFromEureka("book-service", false);
//         String url=instance.getHomePageUrl()+"getBookById";
//        String results = restTemplate.getForObject(url,String.class);
//        return results;
    }
}
