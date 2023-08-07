package com.agent.service.serviceImpl;

import com.agent.entity.Agent;
import com.agent.repository.AgentRepository;
import com.agent.service.AgentService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AgentServiceImpl implements AgentService {

   private AgentRepository agentRepository;
    @Override
    public ResponseEntity<?> addAgent(Agent agent) {
        return new ResponseEntity<>(this.agentRepository.save(agent), HttpStatus.OK);
    }
}
