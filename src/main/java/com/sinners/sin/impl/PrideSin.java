package com.sinners.sin.impl;

import com.sinners.sin.Sin;
import com.sinners.sin.SinType;
import com.sinners.sin.interfaces.Pride;

public class PrideSin extends Sin implements Pride {

    public PrideSin() {
    }

    public PrideSin(Integer weight) {
        super(weight);
    }

    public PrideSin(Integer weight, String message) {
        super(weight, message);
    }

    @Override
    public void sin() {

    }

    @Override
    public SinType getSinType() {
        return SinType.PRIDE;
    }
}
