package Stack;
public class TumpukkanApp {
    public static void main(String[] args){
        Tumpukkan tumpukan=new Tumpukkan(10);
        tumpukan.push(7);
        tumpukan.baca();
        tumpukan.push(2);
        tumpukan.baca();
        tumpukan.push(3);
        tumpukan.baca();
        long nilai3=tumpukan.peek();
        System.out.println("nilai teratas = " + nilai3);
        System.out.println("Nama saya adalah Sifa Nuzul Wulan");
        long nilai2 = tumpukan.pop();
        System.out.println("nilai yang dihapus = " + nilai2);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(4);
        tumpukan.baca(); 
    }
}



