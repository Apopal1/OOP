import java.util.Scanner;
public class Main {
    private static Oxima [] pinOximata;

    public static void main(String[] args) throws NumberException {

        // ���������� ��������
        pinOximata = new Oxima[3];
        pinOximata[0] = new Epivatiko("CAC 17535", 3, new EswterikisKausis(110, 1600));
        pinOximata[1] = new Epivatiko("POI 15234", 3, new EswterikisKausis(652, 4500));
        pinOximata[2] = new Epivatiko("MHD 21494", 5, new EswterikisKausis(121, 1600));

        // ������������� ? �������� instanceof - downcasting
        for (int i = 0; i < pinOximata.length; i++) {

            //System.out.println(pinOximata[i] instanceof Oxima);

        }

        // ���������� ��� ������ ���� ��������
        //System.out.print("\n\n\nGive a position in the array:");
        //Scanner sc = new Scanner(System.in);
        int thesiPin = 0;
        try {
            System.out.print("\n\n\nGive a position in the array:");
            Scanner sc = new Scanner(System.in);
            thesiPin = sc.nextInt();
            sc.close();
        } catch (Exception e) {
            String message = e.getMessage();
            System.out.println(message);

        }
        ;
        //int thesiPin = sc.nextInt();

        pinOximata[thesiPin].vazeiMpros();
        
        pinOximata[thesiPin].seKinisi(2000); 
        pinOximata[thesiPin].allagiTaxititas();

         
        /* 
        String j = pinOximata[thesiPin].getArKykloforias();
        System.out.println(j);

        String p = pinOximata[thesiPin].toString();
        System.out.println(p);
        */


        System.exit(0);

    }

}