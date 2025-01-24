package jpabook.fineday_payment.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class ProductController {

    @GetMapping("/")
    public String productList() {
        return "productList";
    }
    }
