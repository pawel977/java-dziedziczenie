package bryly;

public
class Prostokat {

    private float bokA, bokB;

    public Prostokat(float bokA, float bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public Prostokat() {
    }

    //Math
    protected float liczPole() {
        return bokA * bokB;
    }


    //setters&Getters
    protected void setBokA(float bokA) {
        this.bokA = bokA;
    }

    protected void setBokB(float bokB) {
        this.bokB = bokB;
    }

    public float getBokA() {
        return bokA;
    }

    public float getBokB() {
        return bokB;
    }

    //show
    @Override
    public String toString() {
        return super.toString();
    }

    public String pokazPole() {
        return toString() + "\n" + liczPole();
    }
}
