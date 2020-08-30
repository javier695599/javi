package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CevcrProcMarkValueUseS database table.
 */
@Entity
@NamedQuery(name = "CevcrProcMarkValueUse.findAll", query = "SELECT c FROM CevcrProcMarkValueUse c")
@Table(name = "CEVCR_PROC_MARK_VALUE_USE", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "PRMA_ID_PROCESS_MARK", "PMVA_ID_PROC_MARK_VALUE"})})
public class CevcrProcMarkValueUse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "PMVU_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date pmvuDaEndValidity;

    @Column(columnDefinition = "DATE", name = "PMVU_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date pmvuDaStartValidity;

    @Column(length = 500, name = "PMVU_DS_PROC_MARK_VALUE_USE")
    private String pmvuDsProcMarkValueUse;

    @Column(name = "PMVU_ID_PROC_MARK_VALUE_USE", nullable = false, precision = 5, unique = true)
    @Id
    private Long pmvuIdProcMarkValueUse;

    @Column(length = 50, name = "PMVU_NA_PROC_MARK_VALUE_USE", nullable = false)
    private String pmvuNaProcMarkValueUse;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "PRMA_ID_PROCESS_MARK", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpProcessMark cevcpProcessMark;
    @JoinColumn(name = "PMVA_ID_PROC_MARK_VALUE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpProcMarkValue cevcpProcMarkValue;
    @OneToMany(mappedBy = "cevcrProcMarkValueUse")
    private List<CevcrPmGroup> cevcrPmGroups;
    @OneToMany(mappedBy = "cevcrProcMarkValueUse")
    private List<CevcrPmRelToProdOff> cevcrPmRelToProdOffs;
    @OneToMany(mappedBy = "cevcrProcMarkValueUse")
    private List<CevcrPmRelToProductSp> cevcrPmRelToProductSps;
    @OneToMany(mappedBy = "cevcrProcMarkValueUse")
    private List<CevcrPmToProdSpecChar> cevcrPmToProdSpecChars;

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

    public Date getPmvuDaEndValidity() {
        if (this.pmvuDaEndValidity != null)
            return (Date) this.pmvuDaEndValidity.clone ();
        else
            return null;
    }

    public void setPmvuDaEndValidity(Date pmvuDaEndValidity) {
        if (pmvuDaEndValidity != null)
            this.pmvuDaEndValidity = (Date) pmvuDaEndValidity.clone ();
        else
            this.pmvuDaEndValidity = pmvuDaEndValidity;
    }

    public Date getPmvuDaStartValidity() {
        if (this.pmvuDaStartValidity != null)
            return (Date) this.pmvuDaStartValidity.clone ();
        else
            return null;
    }

    public void setPmvuDaStartValidity(Date pmvuDaStartValidity) {
        if (pmvuDaStartValidity != null)
            this.pmvuDaStartValidity = (Date) pmvuDaStartValidity.clone ();
        else
            this.pmvuDaStartValidity = pmvuDaStartValidity;
    }

    public String getPmvuDsProcMarkValueUse() {
        return this.pmvuDsProcMarkValueUse;
    }

    public void setPmvuDsProcMarkValueUse(String pmvuDsProcMarkValueUse) {
        this.pmvuDsProcMarkValueUse = pmvuDsProcMarkValueUse;
    }

    public Long getPmvuIdProcMarkValueUse() {
        return this.pmvuIdProcMarkValueUse;
    }

    public void setPmvuIdProcMarkValueUse(Long pmvuIdProcMarkValueUse) {
        this.pmvuIdProcMarkValueUse = pmvuIdProcMarkValueUse;
    }

    public String getPmvuNaProcMarkValueUse() {
        return this.pmvuNaProcMarkValueUse;
    }

    public void setPmvuNaProcMarkValueUse(String pmvuNaProcMarkValueUse) {
        this.pmvuNaProcMarkValueUse = pmvuNaProcMarkValueUse;
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

    public CevcpProcessMark getCevcpProcessMark() {
        return this.cevcpProcessMark;
    }

    public void setCevcpProcessMark(CevcpProcessMark cevcpProcessMark) {
        this.cevcpProcessMark = cevcpProcessMark;
    }

    public CevcpProcMarkValue getCevcpProcMarkValue() {
        return this.cevcpProcMarkValue;
    }

    public void setCevcpProcMarkValue(CevcpProcMarkValue cevcpProcMarkValue) {
        this.cevcpProcMarkValue = cevcpProcMarkValue;
    }

    public List<CevcrPmGroup> getCevcrPmGroups() {
        return this.cevcrPmGroups;
    }

    public void setCevcrPmGroups(List<CevcrPmGroup> cevcrPmGroups) {
        this.cevcrPmGroups = cevcrPmGroups;
    }

    public void addCevcrPmGroups(CevcrPmGroup cevcrPmGroup) {
        if (this.cevcrPmGroups == null)
            this.cevcrPmGroups = new ArrayList<CevcrPmGroup> ();
        this.cevcrPmGroups.add ( cevcrPmGroup );
    }

    public void removeCevcrPmGroups(CevcrPmGroup cevcrPmGroupToRemove) {
        if (cevcrPmGroupToRemove != null)
            this.cevcrPmGroups.remove ( cevcrPmGroupToRemove );
    }

    public List<CevcrPmRelToProdOff> getCevcrPmRelToProdOffs() {
        return this.cevcrPmRelToProdOffs;
    }

    public void setCevcrPmRelToProdOffs(List<CevcrPmRelToProdOff> cevcrPmRelToProdOffs) {
        this.cevcrPmRelToProdOffs = cevcrPmRelToProdOffs;
    }

    public void addCevcrPmRelToProdOffs(CevcrPmRelToProdOff cevcrPmRelToProdOff) {
        if (this.cevcrPmRelToProdOffs == null)
            this.cevcrPmRelToProdOffs = new ArrayList<CevcrPmRelToProdOff> ();
        this.cevcrPmRelToProdOffs.add ( cevcrPmRelToProdOff );
    }

    public void removeCevcrPmRelToProdOffs(CevcrPmRelToProdOff cevcrPmRelToProdOffToRemove) {
        if (cevcrPmRelToProdOffToRemove != null)
            this.cevcrPmRelToProdOffs.remove ( cevcrPmRelToProdOffToRemove );
    }

    public List<CevcrPmRelToProductSp> getCevcrPmRelToProductSps() {
        return this.cevcrPmRelToProductSps;
    }

    public void setCevcrPmRelToProductSps(List<CevcrPmRelToProductSp> cevcrPmRelToProductSps) {
        this.cevcrPmRelToProductSps = cevcrPmRelToProductSps;
    }

    public void addCevcrPmRelToProductSps(CevcrPmRelToProductSp cevcrPmRelToProductSp) {
        if (this.cevcrPmRelToProductSps == null)
            this.cevcrPmRelToProductSps = new ArrayList<CevcrPmRelToProductSp> ();
        this.cevcrPmRelToProductSps.add ( cevcrPmRelToProductSp );
    }

    public void removeCevcrPmRelToProductSps(CevcrPmRelToProductSp cevcrPmRelToProductSpToRemove) {
        if (cevcrPmRelToProductSpToRemove != null)
            this.cevcrPmRelToProductSps.remove ( cevcrPmRelToProductSpToRemove );
    }

    public List<CevcrPmToProdSpecChar> getCevcrPmToProdSpecChars() {
        return this.cevcrPmToProdSpecChars;
    }

    public void setCevcrPmToProdSpecChars(List<CevcrPmToProdSpecChar> cevcrPmToProdSpecChars) {
        this.cevcrPmToProdSpecChars = cevcrPmToProdSpecChars;
    }

    public void addCevcrPmToProdSpecChars(CevcrPmToProdSpecChar cevcrPmToProdSpecChar) {
        if (this.cevcrPmToProdSpecChars == null)
            this.cevcrPmToProdSpecChars = new ArrayList<CevcrPmToProdSpecChar> ();
        this.cevcrPmToProdSpecChars.add ( cevcrPmToProdSpecChar );
    }

    public void removeCevcrPmToProdSpecChars(CevcrPmToProdSpecChar cevcrPmToProdSpecCharToRemove) {
        if (cevcrPmToProdSpecCharToRemove != null)
            this.cevcrPmToProdSpecChars.remove ( cevcrPmToProdSpecCharToRemove );
    }

}
