package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CevcrPmGroupS database table.
 */
@Entity
@NamedQuery(name = "CevcrPmGroup.findAll", query = "SELECT c FROM CevcrPmGroup c")
@Table(name = "CEVCR_PM_GROUP", uniqueConstraints = {@UniqueConstraint(columnNames = {"PMVU_ID_PROC_MARK_VALUE_USE",
        "PMGR_ID_PROCESS_MARK_GROUP"})})
public class CevcrPmGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "GHAS_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date ghasDaEndValidity;

    @Column(columnDefinition = "DATE", name = "GHAS_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date ghasDaStartValidity;

    @Column(name = "GHAS_ID_PM_GROUP", nullable = false, precision = 5, unique = true)
    @GeneratedValue(generator = "CEVCR_PM_GROUP_GHASIDPMGROUP_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CEVCR_PM_GROUP_GHASIDPMGROUP_GENERATOR", sequenceName = "CEVC_PMGROUP_SEQ")
    private Long ghasIdPmGroup;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "PMGR_ID_PROCESS_MARK_GROUP", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpProcessMarkGroup cevcpProcessMarkGroup;
    @OneToMany(mappedBy = "cevcrPmGroup1")
    private List<CevcrPmGroupRelship> cevcrPmGroupRelships1;
    @OneToMany(mappedBy = "cevcrPmGroup2")
    private List<CevcrPmGroupRelship> cevcrPmGroupRelships2;
    @JoinColumn(name = "PMVU_ID_PROC_MARK_VALUE_USE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcrProcMarkValueUse cevcrProcMarkValueUse;

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

    public Date getGhasDaEndValidity() {
        if (this.ghasDaEndValidity != null)
            return (Date) this.ghasDaEndValidity.clone ();
        else
            return null;
    }

    public void setGhasDaEndValidity(Date ghasDaEndValidity) {
        if (ghasDaEndValidity != null)
            this.ghasDaEndValidity = (Date) ghasDaEndValidity.clone ();
        else
            this.ghasDaEndValidity = ghasDaEndValidity;
    }

    public Date getGhasDaStartValidity() {
        if (this.ghasDaStartValidity != null)
            return (Date) this.ghasDaStartValidity.clone ();
        else
            return null;
    }

    public void setGhasDaStartValidity(Date ghasDaStartValidity) {
        if (ghasDaStartValidity != null)
            this.ghasDaStartValidity = (Date) ghasDaStartValidity.clone ();
        else
            this.ghasDaStartValidity = ghasDaStartValidity;
    }

    public Long getGhasIdPmGroup() {
        return this.ghasIdPmGroup;
    }

    public void setGhasIdPmGroup(Long ghasIdPmGroup) {
        this.ghasIdPmGroup = ghasIdPmGroup;
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

    public CevcpProcessMarkGroup getCevcpProcessMarkGroup() {
        return this.cevcpProcessMarkGroup;
    }

    public void setCevcpProcessMarkGroup(CevcpProcessMarkGroup cevcpProcessMarkGroup) {
        this.cevcpProcessMarkGroup = cevcpProcessMarkGroup;
    }

    public List<CevcrPmGroupRelship> getCevcrPmGroupRelships1() {
        return this.cevcrPmGroupRelships1;
    }

    public void setCevcrPmGroupRelships1(List<CevcrPmGroupRelship> cevcrPmGroupRelships1) {
        this.cevcrPmGroupRelships1 = cevcrPmGroupRelships1;
    }

    public void addCevcrPmGroupRelships1(CevcrPmGroupRelship cevcrPmGroupRelship) {
        if (this.cevcrPmGroupRelships1 == null)
            this.cevcrPmGroupRelships1 = new ArrayList<CevcrPmGroupRelship> ();
        this.cevcrPmGroupRelships1.add ( cevcrPmGroupRelship );
    }

    public void removeCevcrPmGroupRelships1(CevcrPmGroupRelship cevcrPmGroupRelshipToRemove) {
        if (cevcrPmGroupRelshipToRemove != null)
            this.cevcrPmGroupRelships1.remove ( cevcrPmGroupRelshipToRemove );
    }

    public List<CevcrPmGroupRelship> getCevcrPmGroupRelships2() {
        return this.cevcrPmGroupRelships2;
    }

    public void setCevcrPmGroupRelships2(List<CevcrPmGroupRelship> cevcrPmGroupRelships2) {
        this.cevcrPmGroupRelships2 = cevcrPmGroupRelships2;
    }

    public void addCevcrPmGroupRelships2(CevcrPmGroupRelship cevcrPmGroupRelship) {
        if (this.cevcrPmGroupRelships2 == null)
            this.cevcrPmGroupRelships2 = new ArrayList<CevcrPmGroupRelship> ();
        this.cevcrPmGroupRelships2.add ( cevcrPmGroupRelship );
    }

    public void removeCevcrPmGroupRelships2(CevcrPmGroupRelship cevcrPmGroupRelshipToRemove) {
        if (cevcrPmGroupRelshipToRemove != null)
            this.cevcrPmGroupRelships2.remove ( cevcrPmGroupRelshipToRemove );
    }

    public CevcrProcMarkValueUse getCevcrProcMarkValueUse() {
        return this.cevcrProcMarkValueUse;
    }

    public void setCevcrProcMarkValueUse(CevcrProcMarkValueUse cevcrProcMarkValueUse) {
        this.cevcrProcMarkValueUse = cevcrProcMarkValueUse;
    }

}
