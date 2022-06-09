package com.example.demo.demo.DTO;

import com.example.demo.demo.model.caseDescription;
import com.example.demo.demo.model.caseSolution;

public class CaseToRetainDTO {
    private caseDescription description;
    private caseSolution solution;

    public caseDescription getDescription() {
        return description;
    }

    public void setDescription(caseDescription description) {
        this.description = description;
    }

    public caseSolution getSolution() {
        return solution;
    }

    public void setSolution(caseSolution solution) {
        this.solution = solution;
    }
}
