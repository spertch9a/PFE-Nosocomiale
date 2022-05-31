package com.ouss.reanimation.DTO;

import com.ouss.reanimation.model.TraumaDescription;
import com.ouss.reanimation.model.TraumaSolution;

public class CaseToRetainDTO {
    private TraumaDescription description;
    private TraumaSolution solution;

    public TraumaDescription getDescription() {
        return description;
    }

    public void setDescription(TraumaDescription description) {
        this.description = description;
    }

    public TraumaSolution getSolution() {
        return solution;
    }

    public void setSolution(TraumaSolution solution) {
        this.solution = solution;
    }
}
