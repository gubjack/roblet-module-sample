package org.roblet.sample.module;

import org.roblet.Unit;
import org.roblet.sample.unit.Property;

import genRob.genControl.modules.Module2;
import genRob.genControl.modules.ModuleContext;
import genRob.genControl.modules.RobletHandle;

public class Module implements Module2 {

    private Property  property;

    public void moduleInit(ModuleContext context) throws Exception {
        property = new PropertyImpl();
    }

    public void moduleDone() {
    }

    public void robletInit(RobletHandle handle) {
    }

    public void robletDone(RobletHandle handle) {
    }

    @SuppressWarnings("rawtypes")
    public Unit getUnit(Class clazz, RobletHandle handle) {
        if (clazz == Property.class)
            return property;
        return null;
    }

}
