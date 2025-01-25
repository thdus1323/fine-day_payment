package jpabook.fineday_payment.payment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class PaymentController {

    @GetMapping("/payment")
    public String payment() {
        return "payment/paymentForm";
    }
}