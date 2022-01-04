package com.proiect.Coffee_Shop.controller;

import com.proiect.Coffee_Shop.model.Summary;
import com.proiect.Coffee_Shop.service.SummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/summary", produces="application/json", method={RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST})
@CrossOrigin
public class SummaryController {

    private SummaryService summaryService;

    @Autowired
    public SummaryController(SummaryService summaryService)
    {
        super();
        this.summaryService = summaryService;
    }


    @GetMapping("{id}")
    public ResponseEntity<Summary> geSummaryById(@PathVariable("id") int summaryId){

        return new ResponseEntity<Summary>(summaryService.getById(summaryId), HttpStatus.OK);
    }

    @PutMapping("/put")
    public ResponseEntity<Summary> updateSummary(@RequestBody Summary summary){

        return new ResponseEntity<Summary>(summaryService.setSummary(summary, 1), HttpStatus.OK);
    }
}
