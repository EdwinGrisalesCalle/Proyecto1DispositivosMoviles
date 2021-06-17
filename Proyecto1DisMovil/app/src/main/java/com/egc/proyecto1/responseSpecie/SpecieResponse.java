package com.egc.proyecto1.responseSpecie;

import com.egc.proyecto1.ModelsApiSpecie.Specie;

import java.util.ArrayList;

public class SpecieResponse {

    private ArrayList<Specie> results;

    public ArrayList<Specie> getResult() {
        return results;
    }

    public void setResult(ArrayList<Specie> result) {
        this.results = result;
    }
}
