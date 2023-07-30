package com.hydroyura.articles.patterns.composite.factory;

import java.util.Collections;
import java.util.Map;

public class CustomPart implements IElement {

    private String number;
    private Map<IElement, Long> specification = Map.of(this, 1L);


    public CustomPart(String number) {
        this.number = number;
    }


    @Override
    public Map<IElement, Long> getSpecification() {
        return specification;
    }

    @Override
    public String getNumber() {
        return number;
    }
}
