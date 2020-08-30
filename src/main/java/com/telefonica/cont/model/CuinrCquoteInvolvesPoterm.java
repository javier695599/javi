package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CuinrCquoteInvolvesPotermS database table.
 */
@Entity
@NamedQuery(name = "CuinrCquoteInvolvesPoterm.findAll", query = "SELECT c FROM CuinrCquoteInvolvesPoterm c")
@Table(name = "CUINR_CQUOTE_INVOLVES_POTERM", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BIIT_ID_CUSTOMER_QUOTE_ITEM", "POTE_ID_PRODUCT_OFFERING_TERM"})})
public class CuinrCquoteInvolvesPoterm implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CQPO_ID_CQUOTE_INVOLVES_POTERM", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal cqpoIdCquoteInvolvesPoterm;

    @Column(name = "POTE_ID_PRODUCT_OFFERING_TERM", nullable = false, precision = 6)
    private Long poteIdProductOfferingTerm;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "BIIT_ID_CUSTOMER_QUOTE_ITEM", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CuinpCustomerQuoteItem cuinpCustomerQuoteItem;

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

    public BigDecimal getCqpoIdCquoteInvolvesPoterm() {
        return this.cqpoIdCquoteInvolvesPoterm;
    }

    public void setCqpoIdCquoteInvolvesPoterm(BigDecimal cqpoIdCquoteInvolvesPoterm) {
        this.cqpoIdCquoteInvolvesPoterm = cqpoIdCquoteInvolvesPoterm;
    }

    public Long getPoteIdProductOfferingTerm() {
        return this.poteIdProductOfferingTerm;
    }

    public void setPoteIdProductOfferingTerm(Long poteIdProductOfferingTerm) {
        this.poteIdProductOfferingTerm = poteIdProductOfferingTerm;
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

    public CuinpCustomerQuoteItem getCuinpCustomerQuoteItem() {
        return this.cuinpCustomerQuoteItem;
    }

    public void setCuinpCustomerQuoteItem(CuinpCustomerQuoteItem cuinpCustomerQuoteItem) {
        this.cuinpCustomerQuoteItem = cuinpCustomerQuoteItem;
    }

}
