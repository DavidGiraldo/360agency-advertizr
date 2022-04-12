package com.agency.advertizr.domain.repository;

import com.agency.advertizr.domain.dto.ListingDTO;
import com.agency.advertizr.persistence.entity.Listing;
import java.util.List;
import java.util.Optional;

public interface ListingRespositoryInterface {
    Optional<List<Listing>> findListingsByDealerAndStatus(Long dealerId, String status);
}
