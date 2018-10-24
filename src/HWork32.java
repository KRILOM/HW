import java.util.Arrays;

public class HWork32 {
    public static void main(String[] args) {
    int [] arr;
    arr = new int[51];
    //arr[0]=1;
    for (int i = 1; i < arr.length; i++){
        arr[i]=(i*2)-1;
        System.out.println(arr[i] + " ");
    }
        System.out.println(Arrays.toString(arr));
    int [] arr_rev;
    arr_rev = new int[51];
    for (int i = arr_rev.length-1;i>0;i--){
     arr_rev[i]= (i*2)-1;
        System.out.println(arr_rev[i] + " ");
    }
        System.out.println(Arrays.toString(arr_rev));

    }
}
