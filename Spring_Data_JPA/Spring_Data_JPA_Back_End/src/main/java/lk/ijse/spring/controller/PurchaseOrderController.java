package lk.ijse.spring.controller;

import lk.ijse.spring.entity.OrderDetails;
import lk.ijse.spring.entity.Orders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/pages/purchase")
@CrossOrigin
public class PurchaseOrderController {
    public PurchaseOrderController() {
        System.out.println("PurchaseOrderController : Instantiated..!");
    }

//    @PostMapping
//    public String test(Orders orders, OrderDetails orderDetails) {
//        System.out.println(orders.getOid());
//        System.out.println(orderDetails.getOid());
//        return "hi";
//    }
}
