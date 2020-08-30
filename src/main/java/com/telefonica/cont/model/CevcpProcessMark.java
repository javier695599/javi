package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CevcpProcessMarkS database table.
 */
@Entity
@NamedQuery(name = "CevcpProcessMark.findAll", query = "SELECT c FROM CevcpProcessMark c")
@Table(name = "CEVCP_PROCESS_MARK")
public class CevcpProcessMark implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "PMRA_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date pmraDaEndValidity;

    @Column(columnDefinition = "DATE", name = "PRMA_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date prmaDaStartValidity;

    @Column(length = 500, name = "PRMA_DS_PROCESS_MARK")
    private String prmaDsProcessMark;

    @Column(name = "PRMA_ID_PROCESS_MARK", nullable = false, precision = 3, unique = true)
    @Id
    private Long prmaIdProcessMark;

    @Column(length = 50, name = "PRMA_NA_PROCESS_MARK", nullable = false)
    private String prmaNaProcessMark;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cevcpProcessMark1")
    private List<CevcrProcessMarkRel> cevcrProcessMarkRels1;
    @OneToMany(mappedBy = "cevcpProcessMark2")
    private List<CevcrProcessMarkRel> cevcrProcessMarkRels2;
    @OneToMany(mappedBy = "cevcpProcessMark")
    private List<CevcrProcMarkValueUse> cevcrProcMarkValueUses;

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

    public Date getPmraDaEndValidity() {
        if (this.pmraDaEndValidity != null)
            return (Date) this.pmraDaEndValidity.clone ();
        else
            return null;
    }

    public void setPmraDaEndValidity(Date pmraDaEndValidity) {
        if (pmraDaEndValidity != null)
            this.pmraDaEndValidity = (Date) pmraDaEndValidity.clone ();
        else
            this.pmraDaEndValidity = pmraDaEndValidity;
    }

    public Date getPrmaDaStartValidity() {
        if (this.prmaDaStartValidity != null)
            return (Date) this.prmaDaStartValidity.clone ();
        else
            return null;
    }

    public void setPrmaDaStartValidity(Date prmaDaStartValidity) {
        if (prmaDaStartValidity != null)
            this.prmaDaStartValidity = (Date) prmaDaStartValidity.clone ();
        else
            this.prmaDaStartValidity = prmaDaStartValidity;
    }

    public String getPrmaDsProcessMark() {
        return this.prmaDsProcessMark;
    }

    public void setPrmaDsProcessMark(String prmaDsProcessMark) {
        this.prmaDsProcessMark = prmaDsProcessMark;
    }

    public Long getPrmaIdProcessMark() {
        return this.prmaIdProcessMark;
    }

    public void setPrmaIdProcessMark(Long prmaIdProcessMark) {
        this.prmaIdProcessMark = prmaIdProcessMark;
    }

    public String getPrmaNaProcessMark() {
        return this.prmaNaProcessMark;
    }

    public void setPrmaNaProcessMark(String prmaNaProcessMark) {
        this.prmaNaProcessMark = prmaNaProcessMark;
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

    public List<CevcrProcessMarkRel> getCevcrProcessMarkRels1() {
        return this.cevcrProcessMarkRels1;
    }

    public void setCevcrProcessMarkRels1(List<CevcrProcessMarkRel> cevcrProcessMarkRels1) {
        this.cevcrProcessMarkRels1 = cevcrProcessMarkRels1;
    }

    public void addCevcrProcessMarkRels1(CevcrProcessMarkRel cevcrProcessMarkRel) {
        if (this.cevcrProcessMarkRels1 == null)
            this.cevcrProcessMarkRels1 = new ArrayList<CevcrProcessMarkRel> ();
        this.cevcrProcessMarkRels1.add ( cevcrProcessMarkRel );
    }

    public void removeCevcrProcessMarkRels1(CevcrProcessMarkRel cevcrProcessMarkRelToRemove) {
        if (cevcrProcessMarkRelToRemove != null)
            this.cevcrProcessMarkRels1.remove ( cevcrProcessMarkRelToRemove );
    }

    public List<CevcrProcessMarkRel> getCevcrProcessMarkRels2() {
        return this.cevcrProcessMarkRels2;
    }

    public void setCevcrProcessMarkRels2(List<CevcrProcessMarkRel> cevcrProcessMarkRels2) {
        this.cevcrProcessMarkRels2 = cevcrProcessMarkRels2;
    }

    public void addCevcrProcessMarkRels2(CevcrProcessMarkRel cevcrProcessMarkRel) {
        if (this.cevcrProcessMarkRels2 == null)
            this.cevcrProcessMarkRels2 = new ArrayList<CevcrProcessMarkRel> ();
        this.cevcrProcessMarkRels2.add ( cevcrProcessMarkRel );
    }

    public void removeCevcrProcessMarkRels2(CevcrProcessMarkRel cevcrProcessMarkRelToRemove) {
        if (cevcrProcessMarkRelToRemove != null)
            this.cevcrProcessMarkRels2.remove ( cevcrProcessMarkRelToRemove );
    }

    public List<CevcrProcMarkValueUse> getCevcrProcMarkValueUses() {
        return this.cevcrProcMarkValueUses;
    }

    public void setCevcrProcMarkValueUses(List<CevcrProcMarkValueUse> cevcrProcMarkValueUses) {
        this.cevcrProcMarkValueUses = cevcrProcMarkValueUses;
    }

    public void addCevcrProcMarkValueUses(CevcrProcMarkValueUse cevcrProcMarkValueUse) {
        if (this.cevcrProcMarkValueUses == null)
            this.cevcrProcMarkValueUses = new ArrayList<CevcrProcMarkValueUse> ();
        this.cevcrProcMarkValueUses.add ( cevcrProcMarkValueUse );
    }

    public void removeCevcrProcMarkValueUses(CevcrProcMarkValueUse cevcrProcMarkValueUseToRemove) {
        if (cevcrProcMarkValueUseToRemove != null)
            this.cevcrProcMarkValueUses.remove ( cevcrProcMarkValueUseToRemove );
    }

}
