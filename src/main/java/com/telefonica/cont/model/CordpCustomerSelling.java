package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CordpCustomerSellingS database table.
 */
@Entity
@NamedQuery(name = "CordpCustomerSelling.findAll", query = "SELECT c FROM CordpCustomerSelling c")
@Table(name = "CORDP_CUSTOMER_SELLING", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"BUIN_ID_CUSTOMER_SELLING", "BINT_ID_CSELLING_TYPE"})})
public class CordpCustomerSelling implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(length = 14, name = "BUIN_CO_CUSTOMER_SELLING")
    private String buinCoCustomerSelling;

    @Column(name = "BUIN_ID_CUSTOMER_SELLING", nullable = false, precision = 38)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal buinIdCustomerSelling;

    @Column(name = "BUIN_TI_COMPLETE_INTERAC")
    private Timestamp buinTiCompleteInterac;

    @Column(name = "BUIN_TI_START_INTERAC", nullable = false)
    private Timestamp buinTiStartInterac;

    @Column(length = 400, name = "LCOR_DS_CUSTOMER_SELLING_LANG")
    private String lcorDsCustomerSellingLang;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToOne(mappedBy = "cordpCustomerSelling")
    private AgrepCagreeApproval agrepCagreeApproval;
    @OneToOne(mappedBy = "cordpCustomerSelling")
    private AgrepCustomerAgreement agrepCustomerAgreement;
    @OneToMany(mappedBy = "cordpCustomerSelling")
    private List<AgrerCsellingAttachment> agrerCsellingAttachments;
    @OneToMany(mappedBy = "cordpCustomerSelling")
    private List<CordaCsellingStateMove> cordaCsellingStateMoves;
    @JoinColumn(name = "BINT_ID_CSELLING_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingType corddCsellingType;
    @OneToOne(mappedBy = "cordpCustomerSelling")
    private CordpCustomerOrder cordpCustomerOrder;
    @OneToMany(mappedBy = "cordpCustomerSelling")
    private List<CordpCustomerSellingRole> cordpCustomerSellingRoles;
    @OneToMany(mappedBy = "cordpCustomerSelling")
    private List<CordrCsellingIncident> cordrCsellingIncidents;
    @OneToMany(mappedBy = "cordpCustomerSelling1")
    private List<CordrCsellingRelaIn> cordrCsellingRelaIns1;
    @OneToMany(mappedBy = "cordpCustomerSelling2")
    private List<CordrCsellingRelaIn> cordrCsellingRelaIns2;
    @OneToMany(mappedBy = "cordpCustomerSelling")
    private List<CordrCsellingRelaOut> cordrCsellingRelaOuts;
    @OneToMany(mappedBy = "cordpCustomerSelling1")
    private List<CordrCsellingVersionRela> cordrCsellingVersionRelas1;
    @OneToMany(mappedBy = "cordpCustomerSelling2")
    private List<CordrCsellingVersionRela> cordrCsellingVersionRelas2;
    @OneToOne(mappedBy = "cordpCustomerSelling")
    private CuinpCustomerQuote cuinpCustomerQuote;

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

    public String getBuinCoCustomerSelling() {
        return this.buinCoCustomerSelling;
    }

    public void setBuinCoCustomerSelling(String buinCoCustomerSelling) {
        this.buinCoCustomerSelling = buinCoCustomerSelling;
    }

    public BigDecimal getBuinIdCustomerSelling() {
        return this.buinIdCustomerSelling;
    }

    public void setBuinIdCustomerSelling(BigDecimal buinIdCustomerSelling) {
        this.buinIdCustomerSelling = buinIdCustomerSelling;
    }

    public Timestamp getBuinTiCompleteInterac() {
        if (this.buinTiCompleteInterac != null)
            return (Timestamp) this.buinTiCompleteInterac.clone ();
        else
            return null;
    }

    public void setBuinTiCompleteInterac(Timestamp buinTiCompleteInterac) {
        if (buinTiCompleteInterac != null)
            this.buinTiCompleteInterac = (Timestamp) buinTiCompleteInterac.clone ();
        else
            this.buinTiCompleteInterac = buinTiCompleteInterac;
    }

    public Timestamp getBuinTiStartInterac() {
        if (this.buinTiStartInterac != null)
            return (Timestamp) this.buinTiStartInterac.clone ();
        else
            return null;
    }

    public void setBuinTiStartInterac(Timestamp buinTiStartInterac) {
        if (buinTiStartInterac != null)
            this.buinTiStartInterac = (Timestamp) buinTiStartInterac.clone ();
        else
            this.buinTiStartInterac = buinTiStartInterac;
    }

    public String getLcorDsCustomerSellingLang() {
        return this.lcorDsCustomerSellingLang;
    }

    public void setLcorDsCustomerSellingLang(String lcorDsCustomerSellingLang) {
        this.lcorDsCustomerSellingLang = lcorDsCustomerSellingLang;
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

    public AgrepCagreeApproval getAgrepCagreeApproval() {
        return this.agrepCagreeApproval;
    }

    public void setAgrepCagreeApproval(AgrepCagreeApproval agrepCagreeApproval) {
        this.agrepCagreeApproval = agrepCagreeApproval;
    }

    public AgrepCustomerAgreement getAgrepCustomerAgreement() {
        return this.agrepCustomerAgreement;
    }

    public void setAgrepCustomerAgreement(AgrepCustomerAgreement agrepCustomerAgreement) {
        this.agrepCustomerAgreement = agrepCustomerAgreement;
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

    public List<CordaCsellingStateMove> getCordaCsellingStateMoves() {
        return this.cordaCsellingStateMoves;
    }

    public void setCordaCsellingStateMoves(List<CordaCsellingStateMove> cordaCsellingStateMoves) {
        this.cordaCsellingStateMoves = cordaCsellingStateMoves;
    }

    public void addCordaCsellingStateMoves(CordaCsellingStateMove cordaCsellingStateMove) {
        if (this.cordaCsellingStateMoves == null)
            this.cordaCsellingStateMoves = new ArrayList<CordaCsellingStateMove> ();
        this.cordaCsellingStateMoves.add ( cordaCsellingStateMove );
    }

    public void removeCordaCsellingStateMoves(CordaCsellingStateMove cordaCsellingStateMoveToRemove) {
        if (cordaCsellingStateMoveToRemove != null)
            this.cordaCsellingStateMoves.remove ( cordaCsellingStateMoveToRemove );
    }

    public CorddCsellingType getCorddCsellingType() {
        return this.corddCsellingType;
    }

    public void setCorddCsellingType(CorddCsellingType corddCsellingType) {
        this.corddCsellingType = corddCsellingType;
    }

    public CordpCustomerOrder getCordpCustomerOrder() {
        return this.cordpCustomerOrder;
    }

    public void setCordpCustomerOrder(CordpCustomerOrder cordpCustomerOrder) {
        this.cordpCustomerOrder = cordpCustomerOrder;
    }

    public List<CordpCustomerSellingRole> getCordpCustomerSellingRoles() {
        return this.cordpCustomerSellingRoles;
    }

    public void setCordpCustomerSellingRoles(List<CordpCustomerSellingRole> cordpCustomerSellingRoles) {
        this.cordpCustomerSellingRoles = cordpCustomerSellingRoles;
    }

    public void addCordpCustomerSellingRoles(CordpCustomerSellingRole cordpCustomerSellingRole) {
        if (this.cordpCustomerSellingRoles == null)
            this.cordpCustomerSellingRoles = new ArrayList<CordpCustomerSellingRole> ();
        this.cordpCustomerSellingRoles.add ( cordpCustomerSellingRole );
    }

    public void removeCordpCustomerSellingRoles(CordpCustomerSellingRole cordpCustomerSellingRoleToRemove) {
        if (cordpCustomerSellingRoleToRemove != null)
            this.cordpCustomerSellingRoles.remove ( cordpCustomerSellingRoleToRemove );
    }

    public List<CordrCsellingIncident> getCordrCsellingIncidents() {
        return this.cordrCsellingIncidents;
    }

    public void setCordrCsellingIncidents(List<CordrCsellingIncident> cordrCsellingIncidents) {
        this.cordrCsellingIncidents = cordrCsellingIncidents;
    }

    public void addCordrCsellingIncidents(CordrCsellingIncident cordrCsellingIncident) {
        if (this.cordrCsellingIncidents == null)
            this.cordrCsellingIncidents = new ArrayList<CordrCsellingIncident> ();
        this.cordrCsellingIncidents.add ( cordrCsellingIncident );
    }

    public void removeCordrCsellingIncidents(CordrCsellingIncident cordrCsellingIncidentToRemove) {
        if (cordrCsellingIncidentToRemove != null)
            this.cordrCsellingIncidents.remove ( cordrCsellingIncidentToRemove );
    }

    public List<CordrCsellingRelaIn> getCordrCsellingRelaIns1() {
        return this.cordrCsellingRelaIns1;
    }

    public void setCordrCsellingRelaIns1(List<CordrCsellingRelaIn> cordrCsellingRelaIns1) {
        this.cordrCsellingRelaIns1 = cordrCsellingRelaIns1;
    }

    public void addCordrCsellingRelaIns1(CordrCsellingRelaIn cordrCsellingRelaIn) {
        if (this.cordrCsellingRelaIns1 == null)
            this.cordrCsellingRelaIns1 = new ArrayList<CordrCsellingRelaIn> ();
        this.cordrCsellingRelaIns1.add ( cordrCsellingRelaIn );
    }

    public void removeCordrCsellingRelaIns1(CordrCsellingRelaIn cordrCsellingRelaInToRemove) {
        if (cordrCsellingRelaInToRemove != null)
            this.cordrCsellingRelaIns1.remove ( cordrCsellingRelaInToRemove );
    }

    public List<CordrCsellingRelaIn> getCordrCsellingRelaIns2() {
        return this.cordrCsellingRelaIns2;
    }

    public void setCordrCsellingRelaIns2(List<CordrCsellingRelaIn> cordrCsellingRelaIns2) {
        this.cordrCsellingRelaIns2 = cordrCsellingRelaIns2;
    }

    public void addCordrCsellingRelaIns2(CordrCsellingRelaIn cordrCsellingRelaIn) {
        if (this.cordrCsellingRelaIns2 == null)
            this.cordrCsellingRelaIns2 = new ArrayList<CordrCsellingRelaIn> ();
        this.cordrCsellingRelaIns2.add ( cordrCsellingRelaIn );
    }

    public void removeCordrCsellingRelaIns2(CordrCsellingRelaIn cordrCsellingRelaInToRemove) {
        if (cordrCsellingRelaInToRemove != null)
            this.cordrCsellingRelaIns2.remove ( cordrCsellingRelaInToRemove );
    }

    public List<CordrCsellingRelaOut> getCordrCsellingRelaOuts() {
        return this.cordrCsellingRelaOuts;
    }

    public void setCordrCsellingRelaOuts(List<CordrCsellingRelaOut> cordrCsellingRelaOuts) {
        this.cordrCsellingRelaOuts = cordrCsellingRelaOuts;
    }

    public void addCordrCsellingRelaOuts(CordrCsellingRelaOut cordrCsellingRelaOut) {
        if (this.cordrCsellingRelaOuts == null)
            this.cordrCsellingRelaOuts = new ArrayList<CordrCsellingRelaOut> ();
        this.cordrCsellingRelaOuts.add ( cordrCsellingRelaOut );
    }

    public void removeCordrCsellingRelaOuts(CordrCsellingRelaOut cordrCsellingRelaOutToRemove) {
        if (cordrCsellingRelaOutToRemove != null)
            this.cordrCsellingRelaOuts.remove ( cordrCsellingRelaOutToRemove );
    }

    public List<CordrCsellingVersionRela> getCordrCsellingVersionRelas1() {
        return this.cordrCsellingVersionRelas1;
    }

    public void setCordrCsellingVersionRelas1(List<CordrCsellingVersionRela> cordrCsellingVersionRelas1) {
        this.cordrCsellingVersionRelas1 = cordrCsellingVersionRelas1;
    }

    public void addCordrCsellingVersionRelas1(CordrCsellingVersionRela cordrCsellingVersionRela) {
        if (this.cordrCsellingVersionRelas1 == null)
            this.cordrCsellingVersionRelas1 = new ArrayList<CordrCsellingVersionRela> ();
        this.cordrCsellingVersionRelas1.add ( cordrCsellingVersionRela );
    }

    public void removeCordrCsellingVersionRelas1(CordrCsellingVersionRela cordrCsellingVersionRelaToRemove) {
        if (cordrCsellingVersionRelaToRemove != null)
            this.cordrCsellingVersionRelas1.remove ( cordrCsellingVersionRelaToRemove );
    }

    public List<CordrCsellingVersionRela> getCordrCsellingVersionRelas2() {
        return this.cordrCsellingVersionRelas2;
    }

    public void setCordrCsellingVersionRelas2(List<CordrCsellingVersionRela> cordrCsellingVersionRelas2) {
        this.cordrCsellingVersionRelas2 = cordrCsellingVersionRelas2;
    }

    public void addCordrCsellingVersionRelas2(CordrCsellingVersionRela cordrCsellingVersionRela) {
        if (this.cordrCsellingVersionRelas2 == null)
            this.cordrCsellingVersionRelas2 = new ArrayList<CordrCsellingVersionRela> ();
        this.cordrCsellingVersionRelas2.add ( cordrCsellingVersionRela );
    }

    public void removeCordrCsellingVersionRelas2(CordrCsellingVersionRela cordrCsellingVersionRelaToRemove) {
        if (cordrCsellingVersionRelaToRemove != null)
            this.cordrCsellingVersionRelas2.remove ( cordrCsellingVersionRelaToRemove );
    }

    public CuinpCustomerQuote getCuinpCustomerQuote() {
        return this.cuinpCustomerQuote;
    }

    public void setCuinpCustomerQuote(CuinpCustomerQuote cuinpCustomerQuote) {
        this.cuinpCustomerQuote = cuinpCustomerQuote;
    }

}
