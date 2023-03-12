package nagarro;

import java.util.ArrayList;
import java.util.List;

public class KPC {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		KPC("234","", list);
		System.out.println(list);
	}
	
	public static void KPC(String ques, String ans, List<String> list) {
		
		if(ques.length()==0) {
			list.add(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		String code = getCode(ch);
		
		for(int i=0; i<code.length(); i++)
			KPC(roq, ans+code.charAt(i),list);
	}
	
	public static String getCode(char n){
        if(n=='2'){
            return "abc";
        }else if(n=='3'){
            return "def";
        }else if(n=='4'){
            return "ghi";
        }else if(n=='5'){
            return "jkl";
        }else if(n=='6'){
            return "mno";
        }else if(n=='7'){
            return "pqrs";
        }else if(n=='8'){
            return "tuv";
        }else if(n=='9'){
            return "wxyz";
        }else{
            return "";
        }
    }

}
