package com.proiect.Coffee_Shop.service;

import com.proiect.Coffee_Shop.model.Summary;
import org.springframework.stereotype.Service;

@Service
public interface SummaryService {

    //get summary
    Summary getById(int id);
    //set summary
    Summary setSummary(Summary summary, int id);
}