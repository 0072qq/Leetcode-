package 最长公共前缀;

/**
 * 前两个串进行比较，比较之后的结果依次往后边去比
 * 直到比较结束
 */
public class solution {
    public String longestCommonPrefix(String[] strs) {

        //无输入
        if(strs[0]==""){
            return "";
        }
        //首串与其他串进行比较
        int a = strs.length;
        String str = strs[0];
        for(int i=1;i<a;i++){
            while(strs[i].indexOf(str) != 0){
                str = str.substring(0,str.length()-1);
                //此处为官方的判断，未考虑
                if(str.isEmpty()){
                    return "";
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","fla"};
        solution solution = new solution();
        String s = solution.longestCommonPrefix(strs);
        System.out.println(s);
    }
}
