package org.example;

import java.util.ArrayList;
import java.util.List;

public class Portfolio<T> {

    private List<Stock> stocktList;
    private List<CryptoCurrency> cryptoList;


    public List<Stock> getStocktList() {
        return stocktList;
    }

    public void setStocktList(List<Stock> stocktList) {
        this.stocktList = stocktList;
    }

    public List<CryptoCurrency> getCryptoList() {
        return cryptoList;
    }

    public void setCryptoList(List<CryptoCurrency> cryptoList) {
        this.cryptoList = cryptoList;
    }
}
