package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CuinpPortabilityRequestS database table.
 */
@Entity
@NamedQuery(name = "CuinpPortabilityRequest.findAll", query = "SELECT c FROM CuinpPortabilityRequest c")
@Table(name = "CUINP_PORTABILITY_REQUEST")
public class CuinpPortabilityRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(length = 14, name = "BUIN_CO_CUSTOMER_ORDER")
    private String buinCoCustomerOrder;

    @Column(length = 14, name = "BUIN_CO_CUSTOMER_QUOTE")
    private String buinCoCustomerQuote;

    @Column(name = "BUIN_ID_CUSTOMER_INQUIRY", nullable = false, precision = 38, unique = true)
    private BigDecimal buinIdCustomerInquiry;

    @Column(name = "BUIN_ID_CUSTOMER_ORDER", precision = 38)
    private BigDecimal buinIdCustomerOrder;

    @Column(name = "BUIN_ID_CUSTOMER_QUOTE", precision = 38)
    private BigDecimal buinIdCustomerQuote;

    @Column(name = "BUIN_ID_SP_PORTA_ORDER", nullable = false, precision = 38)
    private BigDecimal buinIdSpPortaOrder;

    @Column(name = "PARO_ID_CUSTOMER", nullable = false, precision = 38)
    private BigDecimal paroIdCustomer;

    @Column(name = "PORE_ID_PORTABILITY_REQUEST", nullable = false, precision = 7, unique = true)
    @GeneratedValue(generator = "CUINP_PORTABILITY_REQUEST_POREIDPORTABILITYREQUEST_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CUINP_PORTABILITY_REQUEST_POREIDPORTABILITYREQUEST_GENERATOR", sequenceName = "CUIN_PORTABILITY_REQUEST_SEQ")
    private Long poreIdPortabilityRequest;

    @Column(name = "PORE_IN_COUNTER", nullable = false, precision = 2)
    private Long poreInCounter;

    @Column(name = "PORT_ID_PORTABIL_PROCESS_TYPE", precision = 3)
    private Long portIdPortabilProcessType;

    @Column(length = 150, name = "RSID_DS_VALUE", nullable = false)
    private String rsidDsValue;

    @Column(name = "SCHE_TI_ITEM_DEADLINE")
    private Timestamp scheTiItemDeadline;

    @Column(name = "SCHE_TI_PORTA_DATE_R_END")
    private Timestamp scheTiPortaDateREnd;

    @Column(name = "SCHE_TI_PORTA_DATE_R_START")
    private Timestamp scheTiPortaDateRStart;

    @OneToMany(mappedBy = "cuinpPortabilityRequest")
    private List<CuinaPortaReqHasStep> cuinaPortaReqHasSteps;
    @JoinColumn(name = "PRST_ID_PORT_REQ_STATUS", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CuindPortabilityReqStatus cuindPortabilityReqStatus;

    public Timestamp getAudiTiCreation() {
        if (this.audiTiCreation != null)
            return (Timestamp) this.audiTiCreation.clone ();
        else
            return null;
    }

    public void setAudiTiCreation(Timestamp audiTiCreation) {
        if (audiTiCreation != null)
            this.audiTiCreation = (Timestamp) audiTiCreation.clone ();
        else
            this.audiTiCreation = audiTiCreation;
    }

    public String getBuinCoCustomerOrder() {
        return this.buinCoCustomerOrder;
    }

    public void setBuinCoCustomerOrder(String buinCoCustomerOrder) {
        this.buinCoCustomerOrder = buinCoCustomerOrder;
    }

    public String getBuinCoCustomerQuote() {
        return this.buinCoCustomerQuote;
    }

    public void setBuinCoCustomerQuote(String buinCoCustomerQuote) {
        this.buinCoCustomerQuote = buinCoCustomerQuote;
    }

    public BigDecimal getBuinIdCustomerInquiry() {
        return this.buinIdCustomerInquiry;
    }

    public void setBuinIdCustomerInquiry(BigDecimal buinIdCustomerInquiry) {
        this.buinIdCustomerInquiry = buinIdCustomerInquiry;
    }

    public BigDecimal getBuinIdCustomerOrder() {
        return this.buinIdCustomerOrder;
    }

    public void setBuinIdCustomerOrder(BigDecimal buinIdCustomerOrder) {
        this.buinIdCustomerOrder = buinIdCustomerOrder;
    }

    public BigDecimal getBuinIdCustomerQuote() {
        return this.buinIdCustomerQuote;
    }

    public void setBuinIdCustomerQuote(BigDecimal buinIdCustomerQuote) {
        this.buinIdCustomerQuote = buinIdCustomerQuote;
    }

    public BigDecimal getBuinIdSpPortaOrder() {
        return this.buinIdSpPortaOrder;
    }

    public void setBuinIdSpPortaOrder(BigDecimal buinIdSpPortaOrder) {
        this.buinIdSpPortaOrder = buinIdSpPortaOrder;
    }

    public BigDecimal getParoIdCustomer() {
        return this.paroIdCustomer;
    }

    public void setParoIdCustomer(BigDecimal paroIdCustomer) {
        this.paroIdCustomer = paroIdCustomer;
    }

    public Long getPoreIdPortabilityRequest() {
        return this.poreIdPortabilityRequest;
    }

    public void setPoreIdPortabilityRequest(Long poreIdPortabilityRequest) {
        this.poreIdPortabilityRequest = poreIdPortabilityRequest;
    }

    public Long getPoreInCounter() {
        return this.poreInCounter;
    }

    public void setPoreInCounter(Long poreInCounter) {
        this.poreInCounter = poreInCounter;
    }

    public Long getPortIdPortabilProcessType() {
        return this.portIdPortabilProcessType;
    }

    public void setPortIdPortabilProcessType(Long portIdPortabilProcessType) {
        this.portIdPortabilProcessType = portIdPortabilProcessType;
    }

    public String getRsidDsValue() {
        return this.rsidDsValue;
    }

    public void setRsidDsValue(String rsidDsValue) {
        this.rsidDsValue = rsidDsValue;
    }

    public Timestamp getScheTiItemDeadline() {
        if (this.scheTiItemDeadline != null)
            return (Timestamp) this.scheTiItemDeadline.clone ();
        else
            return null;
    }

    public void setScheTiItemDeadline(Timestamp scheTiItemDeadline) {
        if (scheTiItemDeadline != null)
            this.scheTiItemDeadline = (Timestamp) scheTiItemDeadline.clone ();
        else
            this.scheTiItemDeadline = scheTiItemDeadline;
    }

    public Timestamp getScheTiPortaDateREnd() {
        if (this.scheTiPortaDateREnd != null)
            return (Timestamp) this.scheTiPortaDateREnd.clone ();
        else
            return null;
    }

    public void setScheTiPortaDateREnd(Timestamp scheTiPortaDateREnd) {
        if (scheTiPortaDateREnd != null)
            this.scheTiPortaDateREnd = (Timestamp) scheTiPortaDateREnd.clone ();
        else
            this.scheTiPortaDateREnd = scheTiPortaDateREnd;
    }

    public Timestamp getScheTiPortaDateRStart() {
        if (this.scheTiPortaDateRStart != null)
            return (Timestamp) this.scheTiPortaDateRStart.clone ();
        else
            return null;
    }

    public void setScheTiPortaDateRStart(Timestamp scheTiPortaDateRStart) {
        if (scheTiPortaDateRStart != null)
            this.scheTiPortaDateRStart = (Timestamp) scheTiPortaDateRStart.clone ();
        else
            this.scheTiPortaDateRStart = scheTiPortaDateRStart;
    }

    public List<CuinaPortaReqHasStep> getCuinaPortaReqHasSteps() {
        return this.cuinaPortaReqHasSteps;
    }

    public void setCuinaPortaReqHasSteps(List<CuinaPortaReqHasStep> cuinaPortaReqHasSteps) {
        this.cuinaPortaReqHasSteps = cuinaPortaReqHasSteps;
    }

    public void addCuinaPortaReqHasSteps(CuinaPortaReqHasStep cuinaPortaReqHasStep) {
        if (this.cuinaPortaReqHasSteps == null)
            this.cuinaPortaReqHasSteps = new ArrayList<CuinaPortaReqHasStep> ();
        this.cuinaPortaReqHasSteps.add ( cuinaPortaReqHasStep );
    }

    public void removeCuinaPortaReqHasSteps(CuinaPortaReqHasStep cuinaPortaReqHasStepToRemove) {
        if (cuinaPortaReqHasStepToRemove != null)
            this.cuinaPortaReqHasSteps.remove ( cuinaPortaReqHasStepToRemove );
    }

    public CuindPortabilityReqStatus getCuindPortabilityReqStatus() {
        return this.cuindPortabilityReqStatus;
    }

    public void setCuindPortabilityReqStatus(CuindPortabilityReqStatus cuindPortabilityReqStatus) {
        this.cuindPortabilityReqStatus = cuindPortabilityReqStatus;
    }

}
