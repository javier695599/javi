package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the AgredCsellingAttachmentTypeS database table.
 */
@Entity
@NamedQuery(name = "AgredCsellingAttachmentType.findAll", query = "SELECT a FROM AgredCsellingAttachmentType a")
@Table(name = "AGRED_CSELLING_ATTACHMENT_TYPE")
public class AgredCsellingAttachmentType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CATP_ID_CSELLING_ATTACHMENT_TP", nullable = false, precision = 2, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private Long catpIdCsellingAttachmentTp;

    @Column(length = 50, name = "CATP_NA_CSELLING_ATTACHMENT_TP", nullable = false)
    private String catpNaCsellingAttachmentTp;

    @Column(name = "CATP_TI_END_VALIDITY")
    private Timestamp catpTiEndValidity;

    @Column(name = "CATP_TI_START_VALIDITY", nullable = false)
    private Timestamp catpTiStartValidity;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "agredCsellingAttachmentType")
    private List<AgrerCsellingAttachment> agrerCsellingAttachments;

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

    public Long getCatpIdCsellingAttachmentTp() {
        return this.catpIdCsellingAttachmentTp;
    }

    public void setCatpIdCsellingAttachmentTp(Long catpIdCsellingAttachmentTp) {
        this.catpIdCsellingAttachmentTp = catpIdCsellingAttachmentTp;
    }

    public String getCatpNaCsellingAttachmentTp() {
        return this.catpNaCsellingAttachmentTp;
    }

    public void setCatpNaCsellingAttachmentTp(String catpNaCsellingAttachmentTp) {
        this.catpNaCsellingAttachmentTp = catpNaCsellingAttachmentTp;
    }

    public Timestamp getCatpTiEndValidity() {
        if (this.catpTiEndValidity != null)
            return (Timestamp) this.catpTiEndValidity.clone ();
        else
            return null;
    }

    public void setCatpTiEndValidity(Timestamp catpTiEndValidity) {
        if (catpTiEndValidity != null)
            this.catpTiEndValidity = (Timestamp) catpTiEndValidity.clone ();
        else
            this.catpTiEndValidity = catpTiEndValidity;
    }

    public Timestamp getCatpTiStartValidity() {
        if (this.catpTiStartValidity != null)
            return (Timestamp) this.catpTiStartValidity.clone ();
        else
            return null;
    }

    public void setCatpTiStartValidity(Timestamp catpTiStartValidity) {
        if (catpTiStartValidity != null)
            this.catpTiStartValidity = (Timestamp) catpTiStartValidity.clone ();
        else
            this.catpTiStartValidity = catpTiStartValidity;
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

    public List<AgrerCsellingAttachment> getAgrerCsellingAttachments() {
        return this.agrerCsellingAttachments;
    }

    public void setAgrerCsellingAttachments(List<AgrerCsellingAttachment> agrerCsellingAttachments) {
        this.agrerCsellingAttachments = agrerCsellingAttachments;
    }

    public void addAgrerCsellingAttachments(AgrerCsellingAttachment agrerCsellingAttachment) {
        if (this.agrerCsellingAttachments == null)
            this.agrerCsellingAttachments = new ArrayList<AgrerCsellingAttachment> ();
        this.agrerCsellingAttachments.add ( agrerCsellingAttachment );
    }

    public void removeAgrerCsellingAttachments(AgrerCsellingAttachment agrerCsellingAttachmentToRemove) {
        if (agrerCsellingAttachmentToRemove != null)
            this.agrerCsellingAttachments.remove ( agrerCsellingAttachmentToRemove );
    }

}
