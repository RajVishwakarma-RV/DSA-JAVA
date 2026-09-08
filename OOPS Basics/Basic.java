public class Basic {
    int age;  //inko instance variable kehte hai

    String name; //abhi inke koi value nhi hai ye khali hai 

    void display(){ // ye method hai

    System.out.println("age   "+age+"\n"+"name  "+name);}
    public static void main(String [] args){//ye main method hai code tab tak nhi chalega jab tak yaha se call nhi karoge

        Basic a1 = new Basic();// isme a1 variable basic class ka hai aur new keyword se heap mai naya memory allocation yaha "Basic()" constructor hai ye khali gajah par variable ki value ko rakh deta hai

      Basic a2 = new Basic();
       a1.age = 22;
       a1.name ="RAJ";
       a2.age =23;
       
       a1.display(); // ye syso mai jata hai aur  execute karta hai
       a2.display();
    }
}
