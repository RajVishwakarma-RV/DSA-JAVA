public class Setter {
    public static void main(String args[]){//main method declaration
        Pen p1 = new Pen(); // created a pen object called p1 , this is obj initialisation
        p1.setColor("Blue");
        System.out.println(p1.color);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}



