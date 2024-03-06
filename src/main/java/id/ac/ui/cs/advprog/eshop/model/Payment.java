package id.ac.ui.cs.advprog.eshop.model;

import java.util.Arrays;
import java.util.Map;

import id.ac.ui.cs.advprog.eshop.enums.OrderStatus;
import id.ac.ui.cs.advprog.eshop.enums.PaymentStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Payment {
    String id;
    String paymentMethod;
    Order order;
    Map<String, String> paymentData;
    String status;

    public Payment(String id, String paymentMethod, Order order, Map<String, String> paymentData) {
        this.id = id;
        this.paymentMethod = paymentMethod;
        this.order = order;
        this.status = PaymentStatus.PENDING.getValue();

        if (paymentData.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            this.paymentData = paymentData;
        }
    }

    public Payment(String id, String paymentMethod, String status, Order order, Map<String, String> paymentData) {
        this(id, paymentMethod, order, paymentData);

        this.setStatus(status);
    }

    public void setStatus(String status) {
        if (PaymentStatus.contains(status)) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Invalid status value");
        }
    }

}