package poop8;


public class Cuadrilatero extends Poligono {
    private int alpha, beta;
    private int a, b;
    private float base, altura;

    public Cuadrilatero() {
    }

    public Cuadrilatero(int alpha, int beta, int a, int b, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }
    @Override
    public float area(){
        return base*altura;
    }
    @Override
    public float primetro(){
        return 2*a+2*b;
    }
    
    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    
}
