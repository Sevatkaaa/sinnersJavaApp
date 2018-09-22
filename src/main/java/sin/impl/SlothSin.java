package sin.impl;

import sin.Sin;
import sin.SinType;
import sin.interfaces.Sloth;

public class SlothSin extends Sin implements Sloth {
    @Override
    public void sin() {

    }

    @Override
    public SinType getSinType() {
        return SinType.SLOTH;
    }
}
