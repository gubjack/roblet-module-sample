package org.roblet.sample.module;

import org.roblet.sample.unit.Property;

public class PropertyImpl implements Property {

    public String get() {
        return System.getProperty("org.roblet.sample.module.test");
    }

}
