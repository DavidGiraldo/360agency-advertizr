package com.agency.advertizr.persistence.crud;

import com.agency.advertizr.domain.dto.ListingDTO;
import com.agency.advertizr.persistence.entity.Listing;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ListingCrudRepository extends CrudRepository<Listing, Long> {
    /*@Query(
        value = "select l.id, l.dealer_id dealerId, l.status, l.price, l.brand, l.reference, l.description, l.created_at createdAt, l.updated_at updatedAt from listings l where l.dealer_id = :dealerId and l.status = :status",
        nativeQuery = true
    )
    List<ListingDTO> findListingByDealerIdAndStatusNamedParamsNative(@Param("dealerId") Long dealerId, @Param("status") String status);*/
    List<Listing> findAllByDealerIdAndStatus(Long dealerId, String status);
}
