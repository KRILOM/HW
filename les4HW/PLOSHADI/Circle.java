public class Circle {

   private int R;
   private double dlina;

   public void setR(int r) {
      R = r;
   }

   public void cirDlin(Circle circle){
      dlina = 3.14 * 2 * circle.R;
   }

   public void showDlina(){
      System.out.println("Длинна окружност:"+ dlina);
   }
}