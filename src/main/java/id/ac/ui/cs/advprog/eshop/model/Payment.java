package id.ac.ui.cs.advprog.eshop.model;

import java.util.Arrays;
import java.util.Map;

import id.ac.ui.cs.advprog.eshop.enums.OrderStatus;
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

    void loadBankTransferPaymentData() {
        paymentData.put("bankName", "BCA");
        paymentData.put("referenceCode", "1234567890");
    }

    public Payment(String id, String paymentMethod, Order order, Map<String, String> paymentData) {
        this.id = id;
        this.paymentMethod = paymentMethod;
        this.order = order;
        this.status = "PENDING";

        if (paymentData.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            this.paymentData = paymentData;
        }
    }

    public Payment(String id, String paymentMethod, String status, Order order, Map<String, String> paymentData) {
        this(id, paymentMethod, order, paymentData);

        String[] statusList = {"PENDING", "SUCCESS", "REJECTED"};
        if (Arrays.stream(statusList).noneMatch(item -> item.equals(status))) {
            throw new IllegalArgumentException("Invalid status value");
        } else {
            this.status = status;
        }
    }

    public void setStatus(String status) {
        String[] statusList = {"PENDING", "SUCCESS", "REJECTED"};
        if (Arrays.stream(statusList).noneMatch(item -> (item.equals(status)))) {
            throw new IllegalArgumentException();
        } else {
            this.status = status;
        }
    }

}