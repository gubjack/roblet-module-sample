package org.roblet.sample.client;

import java.io.Serializable;

import org.roblet.Roblet;
import org.roblet.Robot;
import org.roblet.client.Slot;
import org.roblet.sample.unit.Property;

public class Main {

    public static void  main (String[] args) throws Exception {
        String  server = args.length == 0  ?  "localhost"  :  args[0];
        try (Slot  slot = new Slot (server))
        {
            TheRoblet  r = new TheRoblet ();
            System.out.println (slot. run (r));
        }
    }

    public static class  TheRoblet implements Roblet<String>, Serializable {
        public String execute(Robot robot) {
            Property  property = robot.getUnit(Property.class);
            return property.get();
        }
    }

}
