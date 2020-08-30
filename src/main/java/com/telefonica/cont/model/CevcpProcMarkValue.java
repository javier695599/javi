package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CevcpProcMarkValueS database table.
 */
@Entity
@NamedQuery(name = "CevcpProcMarkValue.findAll", query = "SELECT c FROM CevcpProcMarkValue c")
@Table(name = "CEVCP_PROC_MARK_VALUE")
public class CevcpProcMarkValue implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "PMVA_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date pmvaDaEndValidity;

    @Column(columnDefinition = "DATE", name = "PMVA_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date pmvaDaStartValidity;

    @Column(length = 500, name = "PMVA_DS_PROC_MARK_VALUE")
    private String pmvaDsProcMarkValue;

    @Column(name = "PMVA_ID_PROC_MARK_VALUE", nullable = false, precision = 5, unique = true)
    @Id
    private Long pmvaIdProcMarkValue;

    @Column(length = 50, name = "PMVA_NA_PROC_MARK_VALUE", nullable = false)
    private String pmvaNaProcMarkValue;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cevcpProcMarkValue1")
    private List<CevcrProcMarkValueRel> cevcrProcMarkValueRels1;
    @OneToMany(mappedBy = "cevcpProcMarkValue2")
    private List<CevcrProcMarkValueRel> cevcrProcMarkValueRels2;
    @OneToMany(mappedBy = "cevcpProcMarkValue")
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

    public Date getPmvaDaEndValidity() {
        if (this.pmvaDaEndValidity != null)
            return (Date) this.pmvaDaEndValidity.clone ();
        else
            return null;
    }

    public void setPmvaDaEndValidity(Date pmvaDaEndValidity) {
        if (pmvaDaEndValidity != null)
            this.pmvaDaEndValidity = (Date) pmvaDaEndValidity.clone ();
        else
            this.pmvaDaEndValidity = pmvaDaEndValidity;
    }

    public Date getPmvaDaStartValidity() {
        if (this.pmvaDaStartValidity != null)
            return (Date) this.pmvaDaStartValidity.clone ();
        else
            return null;
    }

    public void setPmvaDaStartValidity(Date pmvaDaStartValidity) {
        if (pmvaDaStartValidity != null)
            this.pmvaDaStartValidity = (Date) pmvaDaStartValidity.clone ();
        else
            this.pmvaDaStartValidity = pmvaDaStartValidity;
    }

    public String getPmvaDsProcMarkValue() {
        return this.pmvaDsProcMarkValue;
    }

    public void setPmvaDsProcMarkValue(String pmvaDsProcMarkValue) {
        this.pmvaDsProcMarkValue = pmvaDsProcMarkValue;
    }

    public Long getPmvaIdProcMarkValue() {
        return this.pmvaIdProcMarkValue;
    }

    public void setPmvaIdProcMarkValue(Long pmvaIdProcMarkValue) {
        this.pmvaIdProcMarkValue = pmvaIdProcMarkValue;
    }

    public String getPmvaNaProcMarkValue() {
        return this.pmvaNaProcMarkValue;
    }

    public void setPmvaNaProcMarkValue(String pmvaNaProcMarkValue) {
        this.pmvaNaProcMarkValue = pmvaNaProcMarkValue;
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

    public List<CevcrProcMarkValueRel> getCevcrProcMarkValueRels1() {
        return this.cevcrProcMarkValueRels1;
    }

    public void setCevcrProcMarkValueRels1(List<CevcrProcMarkValueRel> cevcrProcMarkValueRels1) {
        this.cevcrProcMarkValueRels1 = cevcrProcMarkValueRels1;
    }

    public void addCevcrProcMarkValueRels1(CevcrProcMarkValueRel cevcrProcMarkValueRel) {
        if (this.cevcrProcMarkValueRels1 == null)
            this.cevcrProcMarkValueRels1 = new ArrayList<CevcrProcMarkValueRel> ();
        this.cevcrProcMarkValueRels1.add ( cevcrProcMarkValueRel );
    }

    public void removeCevcrProcMarkValueRels1(CevcrProcMarkValueRel cevcrProcMarkValueRelToRemove) {
        if (cevcrProcMarkValueRelToRemove != null)
            this.cevcrProcMarkValueRels1.remove ( cevcrProcMarkValueRelToRemove );
    }

    public List<CevcrProcMarkValueRel> getCevcrProcMarkValueRels2() {
        return this.cevcrProcMarkValueRels2;
    }

    public void setCevcrProcMarkValueRels2(List<CevcrProcMarkValueRel> cevcrProcMarkValueRels2) {
        this.cevcrProcMarkValueRels2 = cevcrProcMarkValueRels2;
    }

    public void addCevcrProcMarkValueRels2(CevcrProcMarkValueRel cevcrProcMarkValueRel) {
        if (this.cevcrProcMarkValueRels2 == null)
            this.cevcrProcMarkValueRels2 = new ArrayList<CevcrProcMarkValueRel> ();
        this.cevcrProcMarkValueRels2.add ( cevcrProcMarkValueRel );
    }

    public void removeCevcrProcMarkValueRels2(CevcrProcMarkValueRel cevcrProcMarkValueRelToRemove) {
        if (cevcrProcMarkValueRelToRemove != null)
            this.cevcrProcMarkValueRels2.remove ( cevcrProcMarkValueRelToRemove );
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
