package com.example.readingrightfoodapp;

public class CategoryModelClass {
    private int strCategoryThumb;
    private String idCategory;
    private String strCategory;
    private String strCategoryDescription;

    CategoryModelClass(int strCategoryThumb,String idCategory,String strCategory,String strCategoryDescription){
        this.strCategoryThumb = strCategoryThumb;
        this.idCategory = idCategory;
        this.strCategory = strCategory;
        this.strCategoryDescription = strCategoryDescription;
    }



    public int getStrCategoryThumb() {
        return strCategoryThumb;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public String getStrCategoryDescription() {
        return strCategoryDescription;
    }
}
