public class Setter1 {
    public static void main(String[] args) {
        R a1 = new R();
        a1.setColor("Red");
        System.out.println("Color "+a1.color);
    }}
    class R{
        String color;
void setColor(String newColor){
    color = newColor;
}
    }

