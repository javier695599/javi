package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the AgresCsellingAttachmentS database table.
 */
@Entity
@NamedQuery(name = "AgresCsellingAttachment.findAll", query = "SELECT a FROM AgresCsellingAttachment a")
@Table(name = "AGRES_CSELLING_ATTACHMENT",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"BUIN_ID_CUSTOMER_SELLING", "ATTA_ID_DOCUMENT"})})
public class AgresCsellingAttachment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "ATTA_ID_DOCUMENT", nullable = false, precision = 38)
    private BigDecimal attaIdDocument;

    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BINT_ID_CSELLING_TYPE", nullable = false, precision = 3)
    private Long bintIdCsellingType;

    @Column(name = "BUIN_ID_CUSTOMER_SELLING", nullable = false, precision = 38)
    private BigDecimal buinIdCustomerSelling;

    @Column(columnDefinition = "DATE", name = "CAAT_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date caatDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CAAT_DA_START_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date caatDaStartValidity;

    @Column(name = "CAAT_ID_CSELLING_ATTACHMENT", nullable = false, precision = 19, unique = true)
    @Id
    private Long caatIdCsellingAttachment;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    public BigDecimal getAttaIdDocument() {
        return this.attaIdDocument;
    }

    public void setAttaIdDocument(BigDecimal attaIdDocument) {
        this.attaIdDocument = attaIdDocument;
    }

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

    public Long getBintIdCsellingType() {
        return this.bintIdCsellingType;
    }

    public void setBintIdCsellingType(Long bintIdCsellingType) {
        this.bintIdCsellingType = bintIdCsellingType;
    }

    public BigDecimal getBuinIdCustomerSelling() {
        return this.buinIdCustomerSelling;
    }

    public void setBuinIdCustomerSelling(BigDecimal buinIdCustomerSelling) {
        this.buinIdCustomerSelling = buinIdCustomerSelling;
    }

    public Date getCaatDaEndValidity() {
        if (this.caatDaEndValidity != null)
            return (Date) this.caatDaEndValidity.clone ();
        else
            return null;
    }

    public void setCaatDaEndValidity(Date caatDaEndValidity) {
        if (caatDaEndValidity != null)
            this.caatDaEndValidity = (Date) caatDaEndValidity.clone ();
        else
            this.caatDaEndValidity = caatDaEndValidity;
    }

    public Date getCaatDaStartValidity() {
        if (this.caatDaStartValidity != null)
            return (Date) this.caatDaStartValidity.clone ();
        else
            return null;
    }

    public void setCaatDaStartValidity(Date caatDaStartValidity) {
        if (caatDaStartValidity != null)
            this.caatDaStartValidity = (Date) caatDaStartValidity.clone ();
        else
            this.caatDaStartValidity = caatDaStartValidity;
    }

    public Long getCaatIdCsellingAttachment() {
        return this.caatIdCsellingAttachment;
    }

    public void setCaatIdCsellingAttachment(Long caatIdCsellingAttachment) {
        this.caatIdCsellingAttachment = caatIdCsellingAttachment;
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

}
