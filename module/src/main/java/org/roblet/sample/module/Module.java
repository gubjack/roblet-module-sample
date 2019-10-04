package org.roblet.sample.module;

import org.roblet.Unit;

import genRob.genControl.modules.Module2;
import genRob.genControl.modules.ModuleContext;
import genRob.genControl.modules.RobletHandle;

public class Module implements Module2 {

    public void moduleInit(ModuleContext context) throws Exception {
    }

    public void moduleDone() {
    }

    public void robletInit(RobletHandle handle) {
    }

    public void robletDone(RobletHandle handle) {
    }

    @SuppressWarnings("rawtypes")
    public Unit getUnit(Class clazz, RobletHandle handle) {
        return null;
    }

}
