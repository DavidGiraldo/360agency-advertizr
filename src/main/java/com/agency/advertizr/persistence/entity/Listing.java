package com.agency.advertizr.persistence.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "listings")
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "dealer_id", insertable = false, updatable = false)
    private Dealer dealer;
    private String status = ListingStatus.DRAFT.status;
    private BigDecimal price;
    private String brand;
    private String reference;
    @Column(name = "created_at")
    private LocalDate createdAt = LocalDate.now();
    @Column(name = "updated_at")
    private LocalDate updatedAt = LocalDate.now();

    @OneToMany(mappedBy = "listingPublishing")
    private Set<PublishingRequest> publishingRequest;

    @OneToMany(mappedBy = "listingUnpublished")
    private Set<UnpublishingRequest> unpublishedRequest;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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

    public Set<PublishingRequest> getPublishingRequest() {
        return publishingRequest;
    }

    public void setPublishingRequest(Set<PublishingRequest> publishingRequest) {
        this.publishingRequest = publishingRequest;
    }

    public Set<UnpublishingRequest> getUnpublishedRequest() {
        return unpublishedRequest;
    }

    public void setUnpublishedRequest(Set<UnpublishingRequest> unpublishedRequest) {
        this.unpublishedRequest = unpublishedRequest;
    }
}
