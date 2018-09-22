package sin.impl;

import sin.Sin;
import sin.SinType;
import sin.interfaces.Pride;

public class PrideSin extends Sin implements Pride {
    @Override
    public void sin() {

    }

    @Override
    public SinType getSinType() {
        return SinType.PRIDE;
    }
}
