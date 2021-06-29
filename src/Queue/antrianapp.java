package Queue;
public class antrianapp {
    public static void main (String[]args){
    antrian antrian= new antrian (5);
    antrian.enqueue(7);
    antrian.display();
    antrian.enqueue(8);
    antrian.display();
    System.out.println("yang diambil dari antrian = "+ antrian.dequeue());
    System.out.println("Nama saya adalah Sifa Nuzul Wulan");
    antrian.display();
    System.out.println("");
    antrian.enqueue(7);
    antrian.display();
    antrian.enqueue(6);
    antrian.display();
    System.out.println("nilai yang paling depan = "+ antrian.peek());
    }
}