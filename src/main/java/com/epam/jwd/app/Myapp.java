package com.epam.jwd.app;
import com.epam.jwd.model.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Myapp {
    private static final Logger LOG = LogManager.getLogger(Myapp.class);
    public static void main(String[] args) {
        LOG.debug("HELLO");
        LOG.trace("program start");
        if (args.length < 1) {
         //   System.out.println("not enough");
LOG.error("not enough arguments");
System.exit(-1);
}
int[] array = {4, 6, 8, 3, 7, 5, 1};
        for (int i = 0; i < Integer.valueOf(args[0]); i++) {
           // System.out.println(i+1 + " number " + array[i]);
            int m = Math.customMath(array[i]);
         LOG.info("new element is {}", m);
        }
      LOG.trace("program end");
    }
}
