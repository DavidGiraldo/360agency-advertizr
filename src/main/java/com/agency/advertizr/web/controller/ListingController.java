package com.agency.advertizr.web.controller;

import com.agency.advertizr.domain.dto.ListingDTO;
import com.agency.advertizr.domain.service.ListingService;
import com.agency.advertizr.persistence.entity.Listing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listing-ops")
public class ListingController {
    @Autowired
    ListingService listingService;

    @GetMapping("/get-listing/dealer/{dealerId}/status/{status}")
    public ResponseEntity<List<Listing>> findListingsByDealerAndStatus(
        @PathVariable("dealerId") Long dealerId, @PathVariable("status") String status
    ) {
        return listingService.findListingsByDealerAndStatus(dealerId, status).map(
            listing -> new ResponseEntity<>(listing, HttpStatus.OK)
        ).orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }
}
