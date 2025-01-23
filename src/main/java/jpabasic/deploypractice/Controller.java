package jpabasic.deploypractice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
public class Controller {



    @RequestMapping("/error")
    public String handleError() {
        return "error"; // error.html을 반환
    }
}
