package com.agency.advertizr.persistence;

import com.agency.advertizr.persistence.crud.DealerCrudRepository;
import com.agency.advertizr.persistence.entity.Dealer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DealerRepository {
    @Autowired
    private DealerCrudRepository dealerCrudRepository;

    public List<Dealer> getAll() {
        return (List<Dealer>) dealerCrudRepository.findAll();
    }

    public Dealer save(Dealer dealer) {
        return dealerCrudRepository.save(dealer);
    }
}
