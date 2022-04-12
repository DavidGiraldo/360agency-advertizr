package com.agency.advertizr.web.controller;

import com.agency.advertizr.domain.dto.DealerDTO;
import com.agency.advertizr.domain.service.DealerService;
import com.agency.advertizr.persistence.entity.Dealer;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dealers-ops")
public class DealerController {
    @Autowired
    private DealerService dealerService;

    @GetMapping("/all")
    @ApiOperation("Get all dealers registries")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<Dealer>> getAll() {
        return new ResponseEntity<>(dealerService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/create")
    @ApiOperation("Endpoint that allows the Dealers creation")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<Dealer> createDealer(@RequestBody DealerDTO newDealer) {
        return new ResponseEntity<>(dealerService.createDealer(newDealer), HttpStatus.CREATED);
    }
}
