public class ReverseString {
    public void reverseString(char[] s) {
        int head=0;
        int end=s.length-1;
        char temp;
        while (head<end){
            temp=s[head];
            s[head]=s[end];
            s[end]=temp;
            head+=1;
            end-=1;


        }
        for (int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }


    }
}
