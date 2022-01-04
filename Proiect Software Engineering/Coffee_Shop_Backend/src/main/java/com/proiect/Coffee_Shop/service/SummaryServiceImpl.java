package com.proiect.Coffee_Shop.service;

import com.proiect.Coffee_Shop.exception.ResourceNotFoundException;
import com.proiect.Coffee_Shop.model.Summary;
import com.proiect.Coffee_Shop.repository.SummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SummaryServiceImpl implements SummaryService{

    SummaryRepository summaryRepository;
    @Autowired
    public SummaryServiceImpl(SummaryRepository summaryRepository)
    {
        super();
        this.summaryRepository = summaryRepository;
    }

    @Override
    public Summary getById(int id) {
        Optional<Summary> summary= summaryRepository.findById(id);
        if( summary.isPresent()){
            return summary.get();
        }else{
            throw new ResourceNotFoundException("Summary", "id", id);
        }
    }

    @Override
    public Summary setSummary(Summary summary, int id) {
        Summary existingSummary= summaryRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Summary", "id", id));

        existingSummary.setDescription(summary.getDescription());
        summaryRepository.save(existingSummary);
        return existingSummary;
    }
}
