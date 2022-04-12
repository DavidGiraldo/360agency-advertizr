package com.agency.advertizr.persistence;

import com.agency.advertizr.persistence.crud.ListingCrudRepository;
import com.agency.advertizr.persistence.entity.Listing;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ListingRepository {
    private ListingCrudRepository listingCrudRepository;

    public Listing save(Listing listing) {
        return listingCrudRepository.save(listing);
    }

    public List<Listing> findListingsByDealerAndStatus (Long dealerId, String status) {
        return listingCrudRepository.findAllByDealerIdAndStatus(dealerId, status);
    }
}
