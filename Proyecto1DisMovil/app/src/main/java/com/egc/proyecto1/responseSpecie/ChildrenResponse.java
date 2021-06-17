package com.egc.proyecto1.responseSpecie;

import com.egc.proyecto1.ModelsApiSpecie.ChildrenSpecie;

import java.util.ArrayList;

public class ChildrenResponse {
    //@SerializedName("results")
    private ArrayList<ChildrenSpecie> results;

    public ArrayList<ChildrenSpecie> getresults() {
        return results;
    }

    public void setresults(ArrayList<ChildrenSpecie> resultsChildren) {
        this.results = resultsChildren;
    }
}
