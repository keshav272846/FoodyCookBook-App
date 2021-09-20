package com.example.readingrightfoodapp;

import java.util.List;

public class PostPjojo {


    private String idCategory;
    private String strCategory;
    private String strCategoryThumb;
    private String strCategoryDescription;
    private List<ListPojo> ListPojo = null;


    // Getter Methods

    public String getIdCategory() {
        return idCategory;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public String getStrCategoryThumb() {
        return strCategoryThumb;
    }

    public String getStrCategoryDescription() {
        return strCategoryDescription;
    }

    // Setter Methods


    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    public void setStrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    public void setStrCategoryThumb(String strCategoryThumb) {
        this.strCategoryThumb = strCategoryThumb;
    }

    public void setStrCategoryDescription(String strCategoryDescription) {
        this.strCategoryDescription = strCategoryDescription;
    }
}
