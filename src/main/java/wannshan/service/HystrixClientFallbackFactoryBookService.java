package wannshan.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 文件功能：xxxx
 *
 */
@Component
public class HystrixClientFallbackFactoryBookService implements FallbackFactory<BookService> {
    @Override
    public BookService create(Throwable cause) {
        return  new BookService() {

            @Override
            public String bookListRemote() {
                return  "fallback;bookListRemote reason was: " + cause.getCause().getMessage();

            }

            @Override
            public String getBookById() {
                return  "fallback;getBookById reason was: " + cause.getCause().getMessage();

            }
        };

    }
}
