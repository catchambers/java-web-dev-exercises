package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor o1, Flavor o2) {
        //returns object based on what Flavor object name comes first, alphabetically
//        return o1.getName().compareTo(o2.getName());

        //sort objects by number of allergens from highest to lowest
        int o1NumberAllergens = o1.getAllergens().size();
        int o2NumberAllergens = o2.getAllergens().size();

        if (o1NumberAllergens > o2NumberAllergens) {
           return -1;
        } else if (o1NumberAllergens < o2NumberAllergens) {
            return 1;
        } else {
            return 0;
        }
    }
}
