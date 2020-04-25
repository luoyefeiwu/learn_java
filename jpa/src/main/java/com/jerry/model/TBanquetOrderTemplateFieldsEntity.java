package com.jerry.model;

import javax.persistence.*;

@Entity
@Table(name = "t_banquet_order_template_fields", schema = "banquet1125", catalog = "")
public class TBanquetOrderTemplateFieldsEntity {
    private String templateFiedId;
    private String templateId;
    private String fieldKey;
    private String fieldValue;
    private String fieldValueEnd;

    @Id
    @Column(name = "templateFiedId")
    public String getTemplateFiedId() {
        return templateFiedId;
    }

    public void setTemplateFiedId(String templateFiedId) {
        this.templateFiedId = templateFiedId;
    }

    @Basic
    @Column(name = "templateId")
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Basic
    @Column(name = "fieldKey")
    public String getFieldKey() {
        return fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    @Basic
    @Column(name = "fieldValue")
    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    @Basic
    @Column(name = "fieldValueEnd")
    public String getFieldValueEnd() {
        return fieldValueEnd;
    }

    public void setFieldValueEnd(String fieldValueEnd) {
        this.fieldValueEnd = fieldValueEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquetOrderTemplateFieldsEntity that = (TBanquetOrderTemplateFieldsEntity) o;

        if (templateFiedId != null ? !templateFiedId.equals(that.templateFiedId) : that.templateFiedId != null)
            return false;
        if (templateId != null ? !templateId.equals(that.templateId) : that.templateId != null) return false;
        if (fieldKey != null ? !fieldKey.equals(that.fieldKey) : that.fieldKey != null) return false;
        if (fieldValue != null ? !fieldValue.equals(that.fieldValue) : that.fieldValue != null) return false;
        if (fieldValueEnd != null ? !fieldValueEnd.equals(that.fieldValueEnd) : that.fieldValueEnd != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = templateFiedId != null ? templateFiedId.hashCode() : 0;
        result = 31 * result + (templateId != null ? templateId.hashCode() : 0);
        result = 31 * result + (fieldKey != null ? fieldKey.hashCode() : 0);
        result = 31 * result + (fieldValue != null ? fieldValue.hashCode() : 0);
        result = 31 * result + (fieldValueEnd != null ? fieldValueEnd.hashCode() : 0);
        return result;
    }
}
