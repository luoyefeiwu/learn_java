package com.jerry.model;

import javax.persistence.*;

@Entity
@Table(name = "t_banquet_choice_field", schema = "banquet1125", catalog = "")
public class TBanquetChoiceFieldEntity {
    private int id;
    private String choiceFieldName;
    private String choiceFieldCode;
    private String choiceFieldType;
    private String restaurantId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "choiceFieldName")
    public String getChoiceFieldName() {
        return choiceFieldName;
    }

    public void setChoiceFieldName(String choiceFieldName) {
        this.choiceFieldName = choiceFieldName;
    }

    @Basic
    @Column(name = "choiceFieldCode")
    public String getChoiceFieldCode() {
        return choiceFieldCode;
    }

    public void setChoiceFieldCode(String choiceFieldCode) {
        this.choiceFieldCode = choiceFieldCode;
    }

    @Basic
    @Column(name = "choiceFieldType")
    public String getChoiceFieldType() {
        return choiceFieldType;
    }

    public void setChoiceFieldType(String choiceFieldType) {
        this.choiceFieldType = choiceFieldType;
    }

    @Basic
    @Column(name = "restaurantId")
    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquetChoiceFieldEntity that = (TBanquetChoiceFieldEntity) o;

        if (id != that.id) return false;
        if (choiceFieldName != null ? !choiceFieldName.equals(that.choiceFieldName) : that.choiceFieldName != null)
            return false;
        if (choiceFieldCode != null ? !choiceFieldCode.equals(that.choiceFieldCode) : that.choiceFieldCode != null)
            return false;
        if (choiceFieldType != null ? !choiceFieldType.equals(that.choiceFieldType) : that.choiceFieldType != null)
            return false;
        if (restaurantId != null ? !restaurantId.equals(that.restaurantId) : that.restaurantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (choiceFieldName != null ? choiceFieldName.hashCode() : 0);
        result = 31 * result + (choiceFieldCode != null ? choiceFieldCode.hashCode() : 0);
        result = 31 * result + (choiceFieldType != null ? choiceFieldType.hashCode() : 0);
        result = 31 * result + (restaurantId != null ? restaurantId.hashCode() : 0);
        return result;
    }
}
