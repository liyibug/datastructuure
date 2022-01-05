public class palindrome {
    //暴力匹配算法
//    public String longestPalindrome(String s) {
//        if (s.length()<1){
//            return "";
//        }else if (s.length()<2){
//            return s;
//        }
//        int max=1;
//        int start=0;
//        int end=0;
//        int len=s.length();
//        for (int i=0;i<len;i++){
//            for (int j=i+1;j<len;j++){
//                if (isoalindrome(s.substring(i,j))&&(j-i)>max){
//                    max=j-i;
//                    start=i;
//                    end=j;
//                }
//            }
//        }
//        return s.substring(start,end);
//
//
//
//    }
//    public Boolean isoalindrome(String string){
//        int len=string.length();
//        for (int i=0;i< len/2;i++){
//            if (string.charAt(i)!=string.charAt(len-i-1)){
//                return false;
//            }
//
//        }
//        return true;
//    }
    //动态规划算法
    public  String longestPalindrome (String s){
        int slen=s.length();
        int max=1;
        int bengin=0;
        if (slen<2){
            return s;
        }
        boolean[][] flag=new boolean[slen][slen];
        for (int i=0;i<s.length();i++){
            flag[i][i]=true;
        }
        char charray[]=s.toCharArray();
        //从长度i=2开始
        for (int i=2;i<=slen;i++){
            //左边界 j
            for (int j=0;j<slen;j++){
                //右边界 r通过 i 和j判断
                int r=j+i-1;
                if (r>slen){
                    break;
                }
                if (charray[i]==charray[r]){
                    if (i==2){
                        flag[j][r]=true;
                    }else {
                        flag[j][r]=flag[j+1][r-1];
                    }
                }else {
                    flag[j][r]=false;
                }
                if (flag[j][r]&&r-j-1>max){
                    max=r-j-1;
                    bengin=j;
                }


            }

        }
        return s.substring(bengin,max);

    }
}
