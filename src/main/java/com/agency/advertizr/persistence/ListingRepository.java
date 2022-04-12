package com.agency.advertizr.persistence;

import com.agency.advertizr.domain.dto.ListingDTO;
import com.agency.advertizr.domain.repository.ListingRespositoryInterface;
import com.agency.advertizr.persistence.crud.ListingCrudRepository;
import com.agency.advertizr.persistence.entity.Listing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ListingRepository implements ListingRespositoryInterface {
    @Autowired
    private ListingCrudRepository listingCrudRepository;

    public Listing save(Listing listing) {
        return listingCrudRepository.save(listing);
    }

    @Override
    public Optional<List<Listing>> findListingsByDealerAndStatus(Long dealerId, String status) {
        List<Listing> listings = listingCrudRepository.findAllByDealerIdAndStatus(dealerId, status);

        return  Optional.of(listings);
    }
}
