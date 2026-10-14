package com.skillhire.controller;

import com.skillhire.model.Proposal;
import com.skillhire.repository.ProposalRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/proposals")
@CrossOrigin(origins = "*")
public class ProposalController {
    private final ProposalRepository repository;
    public ProposalController(ProposalRepository repository) { this.repository = repository; }
    @GetMapping public List<Proposal> all() { return repository.findAll(); }
    @GetMapping("/project/{projectId}") public List<Proposal> byProject(@PathVariable Long projectId) { return repository.findByProjectId(projectId); }
    @PostMapping public Proposal create(@RequestBody Proposal proposal) { return repository.save(proposal); }
}
