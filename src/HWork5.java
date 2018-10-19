
public class HWork5 {
    public static void main(String[] args) {
        double ipkred , procstav , mes;
        ipkred = 1000000.00;
        procstav = (2.00/ 100.00);
        mes = 2.00;
        double koef = ((procstav * ((1 - procstav) * /* ^ */  mes))/ ((1 + procstav)* /* ^ */ mes - 1));
        double ejemesplat = koef * ipkred;
        double stoimostpokred = mes * ejemesplat;
        double pereplata = stoimostpokred - ipkred;
        System.out.println(pereplata);

    }

}
