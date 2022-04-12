package com.agency.advertizr.persistence;

import com.agency.advertizr.domain.dto.DealerDTO;
import com.agency.advertizr.domain.repository.DealerRepositoryInterface;
import com.agency.advertizr.persistence.crud.DealerCrudRepository;
import com.agency.advertizr.persistence.entity.Dealer;
import com.agency.advertizr.persistence.mapper.DealerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DealerRepository implements DealerRepositoryInterface {
    @Autowired
    private DealerCrudRepository dealerCrudRepository;

    @Autowired
    private DealerMapper dealerMapper;

    @Override
    public List<Dealer> getAll() {
        return (List<Dealer>) dealerCrudRepository.findAll();
    }

    @Override
    public Dealer save(DealerDTO newDealer) {
        return dealerCrudRepository.save(dealerMapper.fromDealerDtoToDealer(newDealer));
    }
}
