package com.agency.advertizr.persistence.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "unpublishing_requests")
public class UnpublishingRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comments;
    @Column(name = "created_at")
    private LocalDate createdAt = LocalDate.now();
    @Column(name = "updated_at")
    private LocalDate updatedAt = LocalDate.now();

    @ManyToOne
    @JoinColumn(name = "listing_id", insertable = false, updatable = false)
    private Listing listingUnpublished;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Listing getListingUnpublished() {
        return listingUnpublished;
    }

    public void setListingUnpublished(Listing listingUnpublished) {
        this.listingUnpublished = listingUnpublished;
    }
}
