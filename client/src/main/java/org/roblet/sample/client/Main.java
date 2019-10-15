package org.roblet.sample.client;

import java.io.Serializable;

import org.roblet.Roblet;
import org.roblet.Robot;

import genRob.genControl.client.Client;
import genRob.genControl.client.Server;
import genRob.genControl.client.Slot;

public class Main {

    public static void  main (String[] args) throws Exception {
        Client  c = new Client();
        Server  s = c.getServer(args.length == 0  ?  "localhost"  :  args[0]);
        Slot  x = s.getSlot();
        Roblet r = new TheRoblet();
        x.run(r);
    }

    public static class  TheRoblet implements Roblet, Serializable {
        public Object execute(Robot robot) throws Exception {
            return null;
        }
    }

}
