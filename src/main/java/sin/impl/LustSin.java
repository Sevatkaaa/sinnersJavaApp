package sin.impl;

import sin.Sin;
import sin.SinType;
import sin.interfaces.Lust;

public class LustSin extends Sin implements Lust {
    @Override
    public void sin() {

    }

    @Override
    public SinType getSinType() {
        return SinType.LUST;
    }
}
