package com.telefonica.cont.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The persistent class for the CordrCsellingRelaTypeLanPKS database table.
 */
@Embeddable
public class CordrCsellingRelaTypeLanPK implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "CSRT_ID_CSELLING_RELA_TYPE", nullable = false, precision = 3, unique = true)
    private Long csrtIdCsellingRelaType;

    @Column(name = "LANG_ID_LANGUAGE", nullable = false, precision = 3, unique = true)
    private Long langIdLanguage;

    public Long getCsrtIdCsellingRelaType() {
        return this.csrtIdCsellingRelaType;
    }

    public void setCsrtIdCsellingRelaType(Long csrtIdCsellingRelaType) {
        this.csrtIdCsellingRelaType = csrtIdCsellingRelaType;
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
        result = prime * result + ((csrtIdCsellingRelaType == null) ? 0 : csrtIdCsellingRelaType.hashCode ());
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
        CordrCsellingRelaTypeLanPK other = (CordrCsellingRelaTypeLanPK) obj;
        if (csrtIdCsellingRelaType == null) {
            if (other.csrtIdCsellingRelaType != null)
                return false;
        } else if (!csrtIdCsellingRelaType.equals ( other.csrtIdCsellingRelaType ))
            return false;
        if (langIdLanguage == null) {
            if (other.langIdLanguage != null)
                return false;
        } else if (!langIdLanguage.equals ( other.langIdLanguage ))
            return false;
        return true;
    }

}
