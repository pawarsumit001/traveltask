package com.agent.controller;

import com.agent.entity.Agent;
import com.agent.service.AgentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/agent")
public class AgentController {
    private AgentService agentService;

    @PostMapping("/add")
    public ResponseEntity<?> addAgent(@RequestBody Agent agent){
        return new ResponseEntity<>(this.addAgent(agent), HttpStatus.OK);
    }
}
