package com.agency.advertizr.persistence.crud;

import com.agency.advertizr.persistence.entity.Listing;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListingCrudRepository extends CrudRepository<Listing, Long> {
    List<Listing> findAllByDealerIdAndStatus(Long dealerId, String status);
}
