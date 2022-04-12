package com.agency.advertizr.persistence.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "listings")
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "dealer_id", insertable = false, updatable = false)
    private Dealer dealer;
    @Enumerated(EnumType.STRING)
    private ListingStatus status;
    private BigDecimal price;
    private String brand;
    private String reference;
    @Column(name = "created_at")
    private LocalDate createdAt;
    @Column(name = "updated_at")
    private LocalDate updatedAt;

    @OneToMany(mappedBy = "listingPublishing")
    private List<PublishingRequest> publishingRequest;

    @OneToMany(mappedBy = "listingUnpublished")
    private List<UnpublishingRequest> unpublishedRequest;

    public Listing() {}

    public Listing(Long id, Dealer dealer, ListingStatus status, BigDecimal price, String brand, String reference, LocalDate createdAt, LocalDate updatedAt) {
        this.id = id;
        this.dealer = dealer;
        this.status = status;
        this.price = price;
        this.brand = brand;
        this.reference = reference;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

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

    public ListingStatus getStatus() {
        return status;
    }

    public void setStatus(ListingStatus status) {
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

}
