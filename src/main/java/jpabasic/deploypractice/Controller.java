package jpabasic.deploypractice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
public class Controller {

    @ControllerAdvice
    public class GlobalExceptionHandler {
        @RequestMapping("/error")
        public String handleError() {
            return "error";  // error.html을 반환
        }
    }

}
