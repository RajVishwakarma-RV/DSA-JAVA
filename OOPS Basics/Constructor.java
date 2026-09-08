public class Constructor {
    public static void main(String[] args) {
       
        Pen p1 = new Pen(); 
        
        p1.SetColor("blue"); // Naam wahi rakho jo niche define kiya hai
        System.out.println(p1.color);
        
        p1.SetTip(5);
        System.out.println(p1.tip);
    }
}

class Pen {
    int tip;
    String color;

    // Ye ek METHOD hai
    void SetColor(String newColor) {
        color = newColor;
    }

    void SetTip(int newTip) {
        tip = newTip;
    }
}
    

