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
        for (int i = 2; i < liczba; i++) {
            if(liczba%i==0){
                return false;
            }
        }
        return true;
    }



}
