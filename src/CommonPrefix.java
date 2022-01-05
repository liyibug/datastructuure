public class CommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs==null||strs.length==0){
            return "";
        }
        String prefix=strs[0];
        for (int i=1;i<strs.length;i++){
            prefix=preFix(prefix,strs[i]);
            if (prefix.length()==0){
                return "";
            }

        }
        return prefix;


    }
    public String preFix(String prefix, String s2){
        int length=Math.min(prefix.length(),s2.length());
        int i=0;
        while (true){
            if (i>length){
                return prefix;
            }
            if (prefix.charAt(i)==s2.charAt(i)){
                i++;
            }else {
                return prefix.substring(0,i);
            }

        }

    }

}
