package com.agency.advertizr.persistence.entity;

public enum ListingStatus {
    PUBLISHED("PUBLISHED"),
    DRAFT("DRAFT");

    public final String status;

    private ListingStatus(String status) {
        this.status = status;
    }
}
