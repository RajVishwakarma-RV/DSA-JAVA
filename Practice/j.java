
public class j {
    public static void main(String[] args) {
        // BankAccount class ka ek naya object 'myAcc' banaya 🏦
        BankAccount myAcc = new BankAccount();
        
        // username 'public' hai, isliye usko direct access karke value set kar di 👤
        myAcc.username = "shradhaKhapra";
        System.out.println( myAcc.username );
        
        // password 'private' hai, toh usko direct change nahi kar sakte. 
        // Isliye public setter method ka use karke password set kiya 🔒
        myAcc.setPassword("abcdefghi");
         System.out.println(myAcc.password);
    }
}

// BankAccount ka blueprint 📝
class BankAccount {
    // public modifier: Ise class ke bahar se kahin bhi direct access kiya jaa sakta hai 🟢
    public String username;
    
    // private modifier: Ise sirf isi BankAccount class ke andar hi access kar sakte hain 🔴
    private String password;
    
    // private password variable ko update karne ke liye ek public method banaya 🔑
    public void setPassword(String pwd) {
        password = pwd; // jo nayi value aayegi (pwd), wo private variable mein save ho jayegi
    }
}

