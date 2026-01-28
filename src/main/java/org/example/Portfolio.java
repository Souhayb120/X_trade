package org.example;

import java.util.ArrayList;
import java.util.List;

public class Portfolio<T> {

    private List<T> assetList;

    public Portfolio() {
        this.assetList = new ArrayList<>();
    }




    public List<T> getAssetList() {
        return assetList;
    }

    public void setAssetList(List<T> assetList) {
        this.assetList = assetList;
    }

}
