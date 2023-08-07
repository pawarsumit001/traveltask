package com.agent.service;

import com.agent.entity.Agent;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface AgentService{
    public ResponseEntity<?>addAgent(Agent agent);

}
