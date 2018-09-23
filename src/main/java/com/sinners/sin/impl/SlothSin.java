package com.sinners.sin.impl;

import com.sinners.sin.Sin;
import com.sinners.sin.SinType;
import com.sinners.sin.interfaces.Sloth;

public class SlothSin extends Sin implements Sloth {

    public SlothSin() {
    }

    public SlothSin(Integer weight) {
        super(weight);
    }

    public SlothSin(Integer weight, String message) {
        super(weight, message);
    }

    @Override
    public void sin() {

    }

    @Override
    public SinType getSinType() {
        return SinType.SLOTH;
    }
}
