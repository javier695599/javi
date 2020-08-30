package com.telefonica.cont.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The persistent class for the CordrCsellingRoleTypeLanPKS database table.
 */
@Embeddable
public class CordrCsellingRoleTypeLanPK implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "CROT_ID_CSELLING_ROLE_TYPE", nullable = false, precision = 3, unique = true)
    private Long crotIdCsellingRoleType;

    @Column(name = "LANG_ID_LANGUAGE", nullable = false, precision = 3, unique = true)
    private Long langIdLanguage;

    public Long getCrotIdCsellingRoleType() {
        return this.crotIdCsellingRoleType;
    }

    public void setCrotIdCsellingRoleType(Long crotIdCsellingRoleType) {
        this.crotIdCsellingRoleType = crotIdCsellingRoleType;
    }

    public Long getLangIdLanguage() {
        return this.langIdLanguage;
    }

    public void setLangIdLanguage(Long langIdLanguage) {
        this.langIdLanguage = langIdLanguage;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((crotIdCsellingRoleType == null) ? 0 : crotIdCsellingRoleType.hashCode ());
        result = prime * result + ((langIdLanguage == null) ? 0 : langIdLanguage.hashCode ());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass () != obj.getClass ())
            return false;
        CordrCsellingRoleTypeLanPK other = (CordrCsellingRoleTypeLanPK) obj;
        if (crotIdCsellingRoleType == null) {
            if (other.crotIdCsellingRoleType != null)
                return false;
        } else if (!crotIdCsellingRoleType.equals ( other.crotIdCsellingRoleType ))
            return false;
        if (langIdLanguage == null) {
            if (other.langIdLanguage != null)
                return false;
        } else if (!langIdLanguage.equals ( other.langIdLanguage ))
            return false;
        return true;
    }

}
