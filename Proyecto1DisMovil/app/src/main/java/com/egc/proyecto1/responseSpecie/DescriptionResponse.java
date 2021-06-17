package com.egc.proyecto1.responseSpecie;

import com.egc.proyecto1.ModelsApiSpecie.Descriptions;

import java.util.ArrayList;

public class DescriptionResponse {

    private ArrayList<Descriptions> results;

    public ArrayList<Descriptions> getResults() {
        return results;
    }

    public void setResults(ArrayList<Descriptions> results) {
        this.results = results;
    }
}
