package com.company.enclinic.entity;

import com.company.clinic.entity.Visit;
import com.haulmont.cuba.core.entity.annotation.Extends;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "enclinic_UrgentVisit")
@Extends(Visit.class)
public class UrgentVisit extends Visit {
    private static final long serialVersionUID = -5926058526257770854L;

    @Column(name = "URGENT")
    private Boolean urgent;

    public Boolean getUrgent() {
        return urgent;
    }

    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }
}