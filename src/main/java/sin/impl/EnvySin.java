package sin.impl;

import sin.Sin;
import sin.SinType;
import sin.interfaces.Envy;

public class EnvySin extends Sin implements Envy {
    @Override
    public void sin() {

    }

    @Override
    public SinType getSinType() {
        return SinType.ENVY;
    }
}
