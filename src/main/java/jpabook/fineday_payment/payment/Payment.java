package jpabook.fineday_payment.payment;

import jakarta.persistence.*;
import jpabook.fineday_payment.product.Product;
import jpabook.fineday_payment.user.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "payment_tb")
@Entity
@NoArgsConstructor
public class Payment {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private Integer number;

        private Double price;

        @ManyToOne(fetch = FetchType.LAZY)
        private User user;

        @ManyToOne(fetch = FetchType.LAZY)
        private Product product;
}
