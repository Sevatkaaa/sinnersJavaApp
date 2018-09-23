package com.sinners.sin.impl;

import com.sinners.sin.Sin;
import com.sinners.sin.SinType;
import com.sinners.sin.interfaces.Sloth;

public class WrathSin extends Sin implements Sloth {


    public WrathSin() {
    }

    public WrathSin(Integer weight, String message) {
        super(weight, message);
    }

    @Override
    public void sin() {

    }

    @Override
    public SinType getSinType() {
        return SinType.WRATH;
    }
}
