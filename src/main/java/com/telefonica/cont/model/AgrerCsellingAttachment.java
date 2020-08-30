package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the AgrerCsellingAttachmentS database table.
 */
@Entity
@NamedQuery(name = "AgrerCsellingAttachment.findAll", query = "SELECT a FROM AgrerCsellingAttachment a")
@Table(name = "AGRER_CSELLING_ATTACHMENT", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BUIN_ID_CUSTOMER_SELLING", "ATTA_ID_DOCUMENT"})})
public class AgrerCsellingAttachment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "CAAT_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date caatDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CAAT_DA_START_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date caatDaStartValidity;

    @Column(name = "CAAT_ID_CSELLING_ATTACHMENT", nullable = false, precision = 19, unique = true)
    @GeneratedValue(generator = "AGRER_CSELLING_ATTACHMENT_CAATIDCSELLINGATTACHMENT_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "AGRER_CSELLING_ATTACHMENT_CAATIDCSELLINGATTACHMENT_GENERATOR", sequenceName = "AGRER_CSELLINGATTACHMENT_SEQ")
    private Long caatIdCsellingAttachment;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "CATP_ID_CSELLING_ATTACHMENT_TP", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private AgredCsellingAttachmentType agredCsellingAttachmentType;
    @JoinColumn(name = "ATTA_ID_DOCUMENT", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpAttachment cordpAttachment;
    @JoinColumns({
            @JoinColumn(referencedColumnName = "BINT_ID_CSELLING_TYPE", nullable = false, name = "BINT_ID_CSELLING_TYPE"),
            @JoinColumn(referencedColumnName = "", nullable = false, name = "BUIN_ID_CUSTOMER_SELLING")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerSelling cordpCustomerSelling;

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

    public AgredCsellingAttachmentType getAgredCsellingAttachmentType() {
        return this.agredCsellingAttachmentType;
    }

    public void setAgredCsellingAttachmentType(AgredCsellingAttachmentType agredCsellingAttachmentType) {
        this.agredCsellingAttachmentType = agredCsellingAttachmentType;
    }

    public CordpAttachment getCordpAttachment() {
        return this.cordpAttachment;
    }

    public void setCordpAttachment(CordpAttachment cordpAttachment) {
        this.cordpAttachment = cordpAttachment;
    }

    public CordpCustomerSelling getCordpCustomerSelling() {
        return this.cordpCustomerSelling;
    }

    public void setCordpCustomerSelling(CordpCustomerSelling cordpCustomerSelling) {
        this.cordpCustomerSelling = cordpCustomerSelling;
    }

}
