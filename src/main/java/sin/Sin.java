package sin;

public class Sin {
    protected SinType type;
    protected Integer weight;
    protected String message;

    public SinType getType() {
        return type;
    }

    public void setType(SinType type) {
        this.type = type;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Sin() {}
}
