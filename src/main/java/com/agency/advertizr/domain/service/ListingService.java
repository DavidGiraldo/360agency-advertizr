package com.agency.advertizr.domain.service;

import com.agency.advertizr.domain.dto.ListingDTO;
import com.agency.advertizr.persistence.ListingRepository;
import com.agency.advertizr.persistence.entity.Listing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListingService {
    @Autowired
    ListingRepository listingRepository;

    public Optional<List<Listing>> findListingsByDealerAndStatus(Long dealerId, String status) {
        return listingRepository.findListingsByDealerAndStatus(dealerId, status);
    }
}
