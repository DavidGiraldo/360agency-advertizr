package com.agency.advertizr.domain.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Optional;

public class DealerDTO implements Serializable {
    private String name;
    private Integer tier;
    private String address;
    private String phone;
    private String email;
    private Optional<LocalDate> createdAt;
    private Optional<LocalDate> updatedAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Optional<LocalDate> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<LocalDate> createdAt) {
        this.createdAt = createdAt;
    }

    public Optional<LocalDate> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Optional<LocalDate> updatedAt) {
        this.updatedAt = updatedAt;
    }
}
