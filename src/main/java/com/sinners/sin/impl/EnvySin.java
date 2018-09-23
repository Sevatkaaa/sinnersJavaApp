package com.sinners.sin.impl;

import com.sinners.sin.Sin;
import com.sinners.sin.SinType;
import com.sinners.sin.interfaces.Envy;

public class EnvySin extends Sin implements Envy {

    public EnvySin() {
    }

    public EnvySin(Integer weight) {
        super(weight);
    }

    public EnvySin(Integer weight, String message) {
        super(weight, message);
    }

    @Override
    public void sin() {

    }

    @Override
    public SinType getSinType() {
        return SinType.ENVY;
    }
}
