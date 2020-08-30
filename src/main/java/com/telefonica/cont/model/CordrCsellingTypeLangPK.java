package com.telefonica.cont.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The persistent class for the CordrCsellingTypeLangPKS database table.
 */
@Embeddable
public class CordrCsellingTypeLangPK implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "BINT_ID_CSELLING_TYPE", nullable = false, precision = 3, unique = true)
    private Long bintIdCsellingType;

    @Column(name = "LANG_ID_LANGUAGE", nullable = false, precision = 3, unique = true)
    private Long langIdLanguage;

    public Long getBintIdCsellingType() {
        return this.bintIdCsellingType;
    }

    public void setBintIdCsellingType(Long bintIdCsellingType) {
        this.bintIdCsellingType = bintIdCsellingType;
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
        result = prime * result + ((bintIdCsellingType == null) ? 0 : bintIdCsellingType.hashCode ());
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
        CordrCsellingTypeLangPK other = (CordrCsellingTypeLangPK) obj;
        if (bintIdCsellingType == null) {
            if (other.bintIdCsellingType != null)
                return false;
        } else if (!bintIdCsellingType.equals ( other.bintIdCsellingType ))
            return false;
        if (langIdLanguage == null) {
            if (other.langIdLanguage != null)
                return false;
        } else if (!langIdLanguage.equals ( other.langIdLanguage ))
            return false;
        return true;
    }

}
