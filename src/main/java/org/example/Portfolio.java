package org.example;

import java.util.ArrayList;
import java.util.List;

public class Portfolio<T> {
    private int quantite;
    private List<Asset> assetList;

    public Portfolio(int quantite) {
        this.quantite = quantite;
        this.assetList = new ArrayList<>();
    }


    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public List<Asset> getAssetList() {
        return assetList;
    }

    public void setAssetList(List<Asset> assetList) {
        this.assetList = assetList;
    }
}
