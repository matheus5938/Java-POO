public class Triangle {
    public double a;
    public double b;
    public double c;

    //public porque ele poderá ser usado em outras classes
    //o que a função retornará?, de colocar  public e se será int ou double ou string por exemplo

    public double area() {
        double p = (a + b + c) / 2.0;
        double result =Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return result;
    }
}
