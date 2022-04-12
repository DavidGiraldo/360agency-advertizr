package com.agency.advertizr.domain.service;

import com.agency.advertizr.domain.dto.DealerDTO;
import com.agency.advertizr.persistence.DealerRepository;
import com.agency.advertizr.persistence.entity.Dealer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealerService {
    @Autowired
    DealerRepository dealerRepository;

    public List<Dealer> getAll() {
        return dealerRepository.getAll();
    }

    public Dealer createDealer(DealerDTO newDealer) {
        return dealerRepository.save(newDealer);
    }
}
