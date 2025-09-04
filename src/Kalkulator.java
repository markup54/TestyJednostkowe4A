public class Kalkulator {
    public static double dodajLiczby(double a, double b){
        return a+b;
    }

    public static double podziel(int a, int b)
    {
        return a/(double)b;
    }


    public static boolean czyLiczbaPierwsza(int liczba){
        if(liczba == 1) {
            return false;
        }
        int pierwiastek = (int)Math.sqrt(liczba);
        for (int i = 2; i <= pierwiastek; i++) {
            if(liczba%i==0){
                return false;
            }
        }
        return true;
    }

public static int potega(int podstawa,int wykladnik){
        return 1;
}

}
