package com.hydroyura.articles.patterns.composite.factory;

import java.util.Map;

public interface IElement {

    public Map<IElement, Long> getSpecification();
    public String getNumber();

}
