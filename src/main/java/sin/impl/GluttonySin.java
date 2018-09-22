package sin.impl;

import sin.Sin;
import sin.SinType;
import sin.interfaces.Gluttony;

public class GluttonySin extends Sin implements Gluttony {
    @Override
    public void sin() {

    }

    @Override
    public SinType getSinType() {
        return SinType.GLUTTONY;
    }
}
