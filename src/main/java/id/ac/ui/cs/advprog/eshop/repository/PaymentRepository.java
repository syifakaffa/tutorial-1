package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Payment;
import java.util.*;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {

    private List<Payment> paymentData = new ArrayList<>();

    public Payment save(Payment payment){
        return null;
    }

    public List<Payment> findAll() {
        return null;
    }

    public Payment findById(String id) {
        return null;
    }
}