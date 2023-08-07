package com.agent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "service_details")
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;

    private String serviceName;
    @ManyToOne

    private Agent agent;

}
