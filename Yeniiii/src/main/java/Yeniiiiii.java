import java.util.Scanner;

public class Yeniiiiii {
    public static void main(String[] args) {
        int dogum;
        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        dogum = inp.nextInt();
        dogum = dogum%12;
        switch(dogum){
            case 0:
                System.out.println("Zodyağınız : Maymun");
                break;
            case 1:
                System.out.println("Zodyağınız : Horoz");
                break;
            case 2:
                System.out.println("Zodyağınız : Köpek");
                break;
            case 3:
                System.out.println("Zodyağınız : Domuz");
                break;
            case 4:
                System.out.println("Zodyağınız : Fare");
                break;
            case 5:
                System.out.println("Zodyağınız : Öküz");
                break;
            case 6:
                System.out.println("Zodyağınız : Kaplan");
                break;
            case 7:
                System.out.println("Zodyağınız : Tavşan");
                break;
            case 8:
                System.out.println("Zodyağınız : Ejderha");
                break;
            case 9:
                System.out.println("Zodyağınız : Yılan");
                break;
            case 10:
                System.out.println("Zodyağınız : At");
                break;
            case 11:
                System.out.println("Zodyağınız : Koyun");
                break;

        }

    }

}
