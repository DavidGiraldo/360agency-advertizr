package com.agency.advertizr.domain.repository;

import com.agency.advertizr.domain.dto.DealerDTO;
import com.agency.advertizr.persistence.entity.Dealer;

import java.util.List;

public interface DealerRepositoryInterface {
    List<Dealer> getAll();
    Dealer save(DealerDTO newDealer);
}
