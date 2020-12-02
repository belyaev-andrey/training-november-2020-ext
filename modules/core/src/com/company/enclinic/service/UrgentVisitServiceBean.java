package com.company.enclinic.service;

import com.company.clinic.entity.Visit;
import com.company.clinic.service.VisitServiceBean;

import java.math.BigDecimal;

public class UrgentVisitServiceBean extends VisitServiceBean {

    @Override
    public BigDecimal calculateAmount(Visit visit) {
        return super.calculateAmount(visit).multiply(BigDecimal.valueOf(1.1));
    }

}
