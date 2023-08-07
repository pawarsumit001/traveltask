package com.customerservice.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "customer_details")
@Entity
public class Customer {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long cid;
@Column(name = "Customer_name")
private String cname;
    @Column(name = "customer_Mobile")
    private String mobile;
    @Column(name = "Customer_Email")
    private String email;
    @Column(name = "customer_city")
    private String city;

}
