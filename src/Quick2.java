import java.util.Arrays;

public class Quick2 {
    public static void main(String[] args) {
        int[] ints={3,3,534,647,7,352,414,234};
        quickSort(ints,0,ints.length-1);

        System.out.println(Arrays.toString(ints));


    }
    static void  quickSort(int[] ints,int begin,int end){
        if (begin>end){
            return ;
        }
        int temp=ints[begin];
        int i=begin;
        int j=end;
        while (i!=j){
            while (i<j&&ints[j]>=temp){
                j--;
            }

        while (i<j&&ints[i]<=temp){
            i++;
        }

        if (j>i) {
              int t = ints[i];
              ints[i] = ints[j];
              ints[j] = t;
           }
        }
        ints[begin]=ints[i];
        ints[i]=temp;
        quickSort(ints,begin,i-1);
        quickSort(ints,i+1,end);

    }
}
