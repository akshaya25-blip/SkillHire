package com.skillhire.controller;

import com.skillhire.model.Project;
import com.skillhire.repository.ProjectRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "*")
public class ProjectController {
    private final ProjectRepository repository;
    public ProjectController(ProjectRepository repository) { this.repository = repository; }
    @GetMapping public List<Project> all() { return repository.findAll(); }
    @PostMapping public Project create(@RequestBody Project project) { return repository.save(project); }
    @GetMapping("/{id}") public Project one(@PathVariable Long id) { return repository.findById(id).orElseThrow(); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { repository.deleteById(id); }
}
