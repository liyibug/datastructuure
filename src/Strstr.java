public class Strstr {
    public int strStr(String haystack, String needle) {
        int nlen=needle.length();
        int[] prefix=new int[nlen];
        int index=0;
        if (nlen==0){
            return index;
        }
        for (int i=1,j=0;i<nlen;i++){
            while (j>0&&needle.charAt(i)!=needle.charAt(j)){
                j=prefix[j-1];

            }
            if (needle.charAt(i)==needle.charAt(j)){
                j++;
            }
            prefix[i]=j;
        }
        for (int i=0,j=0;i<haystack.length();i++){
            while (j>0 && needle.charAt(i)!=needle.charAt(j)){
                j=prefix[j-1];

            }
            if (needle.charAt(i)==needle.charAt(j)){
                j++;
            }
            if (j==haystack.length()){
                return i-j+1;
            }
        }
        return -1;

    }

}
