package com.telefonica.cont.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The persistent class for the CordrCsitemRelaTypeLangPKS database table.
 */
@Embeddable
public class CordrCsitemRelaTypeLangPK implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "CIRT_ID_CSITEM_RELA_TYPE", nullable = false, precision = 3, unique = true)
    private Long cirtIdCsitemRelaType;

    @Column(name = "LANG_ID_LANGUAGE", nullable = false, precision = 3, unique = true)
    private Long langIdLanguage;

    public Long getCirtIdCsitemRelaType() {
        return this.cirtIdCsitemRelaType;
    }

    public void setCirtIdCsitemRelaType(Long cirtIdCsitemRelaType) {
        this.cirtIdCsitemRelaType = cirtIdCsitemRelaType;
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
        result = prime * result + ((cirtIdCsitemRelaType == null) ? 0 : cirtIdCsitemRelaType.hashCode ());
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
        CordrCsitemRelaTypeLangPK other = (CordrCsitemRelaTypeLangPK) obj;
        if (cirtIdCsitemRelaType == null) {
            if (other.cirtIdCsitemRelaType != null)
                return false;
        } else if (!cirtIdCsitemRelaType.equals ( other.cirtIdCsitemRelaType ))
            return false;
        if (langIdLanguage == null) {
            if (other.langIdLanguage != null)
                return false;
        } else if (!langIdLanguage.equals ( other.langIdLanguage ))
            return false;
        return true;
    }

}
