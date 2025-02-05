import java.util.ArrayList;
import java.util.List;

class Solution {

    public String encode(List<String> strs) {

        if(strs.isEmpty()){
            return null;
        }
        StringBuilder encondedString = new StringBuilder();
    
        int i = 0;
        for (i = 0; i< strs.size(); i++) {
            encondedString.append(strs.get(i)).append("-");
        }

        String newString = encondedString.toString();

        return newString.substring(0, newString.length()-1 );
    }

    public List<String> decode(String str) {
        List<String> decodedString = new ArrayList<>();

        if(str == null){
            return decodedString;
        }

        if(str.isEmpty()){
            decodedString.add("");
            return decodedString;
        }

        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '-'){
                decodedString.add(word.toString());
                word = new StringBuilder();
            }else{
                word.append(str.charAt(i));
            }
        }
        decodedString.add(word.toString());

        return decodedString;
    }
}