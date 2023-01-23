package shapes;

public class Counter {
    private int round;
    private int triangular;
    private int quadrangular;
    private int[] colors = new int[Color.values().length];

    public int getRound() {
        return round;
    }

    public int getTriangular() {
        return triangular;
    }

    public int getQuadrangular() {
        return quadrangular;
    }

    public void addRound() {
        round++;
    }
    public void addTriangular() {
        triangular++;
    }
    public void addQuadrangular() {
        quadrangular++;
    }
    public void addColor(int num) {
        colors[num]++;
    }
    public int getCountColor(int num) {
        return colors[num];
    }
}
