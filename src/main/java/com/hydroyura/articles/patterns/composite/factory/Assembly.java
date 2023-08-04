package com.hydroyura.articles.patterns.composite.factory;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Assembly implements IElement {

    private String number;
    private Map<IElement, Long> specification = new HashMap<>();


    public Assembly(String number) {
        this.number = number;
    }


    @Override
    public Map<IElement, Long> getSpecification() {
        return specification.entrySet()
                    .stream()
                    .flatMap(arg1 -> arg1.getKey().getSpecification().entrySet()
                            .stream()
                            .map(arg2 -> Map.entry(arg2.getKey(), arg1.getValue() * arg2.getValue())))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (first, second) -> first + second));
    }

    @Override
    public String getNumber() {
        return number;
    }

    public Assembly addElement(IElement element, Long count) {
        specification.put(element, count);
        return this;
    }
}
