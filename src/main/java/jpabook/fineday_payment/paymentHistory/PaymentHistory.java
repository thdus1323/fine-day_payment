package jpabook.fineday_payment.paymentHistory;

import jakarta.persistence.*;
import jpabook.fineday_payment.payment.Payment;
import jpabook.fineday_payment.product.Product;
import jpabook.fineday_payment.user.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "paymentHistory_tb")
@Entity
@NoArgsConstructor
public class PaymentHistory {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @ManyToOne(fetch = FetchType.LAZY)
        private User user;

        @ManyToOne(fetch = FetchType.LAZY)
        private Product product;

        @ManyToOne(fetch = FetchType.LAZY)
        private Payment payment;
}
