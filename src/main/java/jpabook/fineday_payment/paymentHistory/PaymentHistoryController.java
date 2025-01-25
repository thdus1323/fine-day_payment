package jpabook.fineday_payment.paymentHistory;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class PaymentHistoryController {

    @GetMapping("/paymentHistory")
    public String paymentHistory() {
        return "mypage/paymentHistory";
    }
}
