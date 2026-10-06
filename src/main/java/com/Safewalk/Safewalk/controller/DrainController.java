package com.Safewalk.Safewalk.controller;

import com.Safewalk.Safewalk.model.DrainReport;
import com.Safewalk.Safewalk.repository.DrainReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/drains")
@CrossOrigin
public class DrainController {

    @Autowired
    private DrainReportRepository repo;

    @PostMapping
    public DrainReport reportDrain(@RequestBody DrainReport report) {
        return repo.save(report);
    }

    @GetMapping
    public List<DrainReport> getAllReports() {
        return repo.findAll();
    }
}