package com.agent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "agent_details")
@Entity
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long agentId;
    @Column(name="agent_name")
    private String agentName;
    @Column(name="agent_Email")
    private String agentEmail;
    @Column(name="agent_mobile")
    private String agentMobile;
    @Column(name="agent_city")
    private String agentCity;

    @OneToMany(mappedBy = "agent")
    private List<Services> serviceBookingList;
}
