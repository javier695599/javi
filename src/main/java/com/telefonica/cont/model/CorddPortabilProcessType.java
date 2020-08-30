package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CorddPortabilProcessTypeS database table.
 */
@Entity
@NamedQuery(name = "CorddPortabilProcessType.findAll", query = "SELECT c FROM CorddPortabilProcessType c")
@Table(name = "CORDD_PORTABIL_PROCESS_TYPE")
public class CorddPortabilProcessType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "PORT_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date portDaEndValidity;

    @Column(columnDefinition = "DATE", name = "PORT_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date portDaStartValidity;

    @Column(name = "PORT_ID_PORTABIL_PROCESS_TYPE", nullable = false, precision = 3, unique = true)
    @Id
    private Long portIdPortabilProcessType;

    @Column(length = 100, name = "PORT_NA_PORTABIL_PROCESS_TYPE", nullable = false)
    private String portNaPortabilProcessType;

    @Column(name = "PORT_QU_MARGIN_DEADLINE", nullable = false, precision = 5)
    private Long portQuMarginDeadline;

    @Column(name = "PORT_QU_TIME_DEADLINE", nullable = false, precision = 5)
    private Long portQuTimeDeadline;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "corddPortabilProcessType")
    private List<CuinpCustomerQuoteItem> cuinpCustomerQuoteItems;

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

    public Timestamp getAudiTiUpdate() {
        if (this.audiTiUpdate != null)
            return (Timestamp) this.audiTiUpdate.clone ();
        else
            return null;
    }

    public void setAudiTiUpdate(Timestamp audiTiUpdate) {
        if (audiTiUpdate != null)
            this.audiTiUpdate = (Timestamp) audiTiUpdate.clone ();
        else
            this.audiTiUpdate = audiTiUpdate;
    }

    public Date getPortDaEndValidity() {
        if (this.portDaEndValidity != null)
            return (Date) this.portDaEndValidity.clone ();
        else
            return null;
    }

    public void setPortDaEndValidity(Date portDaEndValidity) {
        if (portDaEndValidity != null)
            this.portDaEndValidity = (Date) portDaEndValidity.clone ();
        else
            this.portDaEndValidity = portDaEndValidity;
    }

    public Date getPortDaStartValidity() {
        if (this.portDaStartValidity != null)
            return (Date) this.portDaStartValidity.clone ();
        else
            return null;
    }

    public void setPortDaStartValidity(Date portDaStartValidity) {
        if (portDaStartValidity != null)
            this.portDaStartValidity = (Date) portDaStartValidity.clone ();
        else
            this.portDaStartValidity = portDaStartValidity;
    }

    public Long getPortIdPortabilProcessType() {
        return this.portIdPortabilProcessType;
    }

    public void setPortIdPortabilProcessType(Long portIdPortabilProcessType) {
        this.portIdPortabilProcessType = portIdPortabilProcessType;
    }

    public String getPortNaPortabilProcessType() {
        return this.portNaPortabilProcessType;
    }

    public void setPortNaPortabilProcessType(String portNaPortabilProcessType) {
        this.portNaPortabilProcessType = portNaPortabilProcessType;
    }

    public Long getPortQuMarginDeadline() {
        return this.portQuMarginDeadline;
    }

    public void setPortQuMarginDeadline(Long portQuMarginDeadline) {
        this.portQuMarginDeadline = portQuMarginDeadline;
    }

    public Long getPortQuTimeDeadline() {
        return this.portQuTimeDeadline;
    }

    public void setPortQuTimeDeadline(Long portQuTimeDeadline) {
        this.portQuTimeDeadline = portQuTimeDeadline;
    }

    public BigDecimal getUserIdCreatorParty() {
        return this.userIdCreatorParty;
    }

    public void setUserIdCreatorParty(BigDecimal userIdCreatorParty) {
        this.userIdCreatorParty = userIdCreatorParty;
    }

    public BigDecimal getUserIdUpdaterParty() {
        return this.userIdUpdaterParty;
    }

    public void setUserIdUpdaterParty(BigDecimal userIdUpdaterParty) {
        this.userIdUpdaterParty = userIdUpdaterParty;
    }

    public List<CuinpCustomerQuoteItem> getCuinpCustomerQuoteItems() {
        return this.cuinpCustomerQuoteItems;
    }

    public void setCuinpCustomerQuoteItems(List<CuinpCustomerQuoteItem> cuinpCustomerQuoteItems) {
        this.cuinpCustomerQuoteItems = cuinpCustomerQuoteItems;
    }

    public void addCuinpCustomerQuoteItems(CuinpCustomerQuoteItem cuinpCustomerQuoteItem) {
        if (this.cuinpCustomerQuoteItems == null)
            this.cuinpCustomerQuoteItems = new ArrayList<CuinpCustomerQuoteItem> ();
        this.cuinpCustomerQuoteItems.add ( cuinpCustomerQuoteItem );
    }

    public void removeCuinpCustomerQuoteItems(CuinpCustomerQuoteItem cuinpCustomerQuoteItemToRemove) {
        if (cuinpCustomerQuoteItemToRemove != null)
            this.cuinpCustomerQuoteItems.remove ( cuinpCustomerQuoteItemToRemove );
    }

}
