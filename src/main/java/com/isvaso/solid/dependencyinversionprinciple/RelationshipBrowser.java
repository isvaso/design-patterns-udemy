package com.isvaso.solid.dependencyinversionprinciple;

import java.util.List;

public interface RelationshipBrowser {

    List<Person> findAllChildrenOf(String name);
}
