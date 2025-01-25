package jpabook.fineday_payment.user;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class UserController {

    @GetMapping("/loginForm")
    public String loginForm() {
        return "user/loginForm";
    }
}
