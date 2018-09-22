package sin.impl;

import sin.Sin;
import sin.SinType;
import sin.interfaces.Greed;

public class GreedSin extends Sin implements Greed {
    @Override
    public void sin() {

    }

    @Override
    public SinType getSinType() {
        return SinType.GREED;
    }
}
