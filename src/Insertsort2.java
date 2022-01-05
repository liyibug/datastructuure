import java.util.Arrays;

public class Insertsort2 {
    public static void main(String[] args) {

        int [] ints={1,2,3,4,5,6,7,8};
        int temp;
        for (int i=1;i<ints.length;i++){
            int j=i;
            while (j>=1&&ints[j]>ints[j-1]){
                temp=ints[j];
                ints[j]=ints[j-1];
                ints[j-1]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}
