
public class HWork5 {
    public static void main(String[] args) {
        double ipkred , procstav , mes;
        ipkred = 1000000.00;
        procstav = ((2.00/ 100.00)/12);
        mes = 12.00;
        double  partkoef1 = ((procstav) * (1 - (procstav)) );
        System.out.println(partkoef1);
        double partkoef12 = (1 + procstav);
        System.out.println(partkoef12);
        double koef = ( Math.pow(partkoef1,mes)) /  ((Math.pow(partkoef12,(mes)))-1);
        System.out.println(koef);
        double ejemesplat = koef * ipkred;
        System.out.println(ejemesplat);
        double stoimostpokred = mes * ejemesplat;
        System.out.println(stoimostpokred);
        double pereplata = stoimostpokred - ipkred;
        System.out.println(pereplata);

    }

}
