package com.agency.advertizr.persistence.mapper;

import com.agency.advertizr.domain.dto.DealerDTO;
import com.agency.advertizr.persistence.entity.Dealer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface DealerMapper {
    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "createdAt", ignore = true),
            @Mapping(target = "updatedAt", ignore = true),
            @Mapping(target = "listing", ignore = true),
    })
    Dealer fromDealerDtoToDealer(DealerDTO dealerDto);
}
