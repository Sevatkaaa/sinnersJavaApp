package utils;

import sin.Sin;
import sin.SinType;
import sin.impl.*;

public class Sins {
    public Sin createSin(SinType type) {
        Sin sin;
        switch (type) {
            case ENVY:
                sin = new EnvySin();
                break;
            case GLUTTONY:
                sin = new GluttonySin();
                break;
            case GREED:
                sin = new GreedSin();
                break;
            case LUST:
                sin = new LustSin();
                break;
            case PRIDE:
                sin = new PrideSin();
                break;
            case SLOTH:
                sin = new SlothSin();
                break;
            case WRATH:
                sin = new WrathSin();
                break;
            default:
                throw new IllegalArgumentException("No greed type defined");
        }
        return sin;
    }
    public Sin createSin(SinType type, Integer weight) {
        Sin sin = createSin(type);
        sin.setWeight(weight);
        return sin;
    }

    public Sin createSin(SinType type, Integer weight, String message) {
        Sin sin = createSin(type, weight);
        sin.setMessage(message);
        return sin;
    }
}
