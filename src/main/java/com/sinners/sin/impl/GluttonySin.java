package com.sinners.sin.impl;

import com.sinners.sin.Sin;
import com.sinners.sin.SinType;
import com.sinners.sin.interfaces.Gluttony;

public class GluttonySin extends Sin implements Gluttony {

    public GluttonySin() {
    }

    public GluttonySin(Integer weight) {
        super(weight);
    }

    public GluttonySin(Integer weight, String message) {
        super(weight, message);
    }

    @Override
    public void sin() {

    }

    @Override
    public SinType getSinType() {
        return SinType.GLUTTONY;
    }
}
