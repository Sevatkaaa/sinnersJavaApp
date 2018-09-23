package com.sinners.sin.impl;

import com.sinners.sin.Sin;
import com.sinners.sin.SinType;
import com.sinners.sin.interfaces.Lust;

public class LustSin extends Sin implements Lust {

    public LustSin() {
    }

    public LustSin(Integer weight) {
        super(weight);
    }

    public LustSin(Integer weight, String message) {
        super(weight, message);
    }

    @Override
    public void sin() {

    }

    @Override
    public SinType getSinType() {
        return SinType.LUST;
    }
}
