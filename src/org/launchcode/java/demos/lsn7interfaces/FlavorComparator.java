package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor o1, Flavor o2) {
        //returns object based on what Flavor object name comes first, alphabetically
        return o1.getName().compareTo(o2.getName());
    }
}
