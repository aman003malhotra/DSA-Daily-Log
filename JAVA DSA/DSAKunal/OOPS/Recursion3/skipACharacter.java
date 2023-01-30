package DSAKunal.OOPS.Recursion3;

public class skipACharacter {
    public static void main(String[] args) {
        System.out.println(skipCharacter("", "abacbsba"));
        System.out.println(skipCharacter2("abacbsba"));
    }

    // 
    public static String skipCharacter(String processsed, String unprocessed){
        if(unprocessed.isEmpty()){
        //    System.out.println(processsed);
           return processsed; 
        }

        char ch = unprocessed.charAt(0);

        if(ch == 'a'){
            return skipCharacter(processsed, unprocessed.substring(1));
        }else{
            return skipCharacter(processsed + ch, unprocessed.substring(1));
        }
    }
    
    
    public static String skipCharacter2(String unprocessed){
        if(unprocessed.isEmpty()){
           return ""; 
        }

        char ch = unprocessed.charAt(0);

        if(ch == 'a'){
            return skipCharacter2(unprocessed.substring(1));
        }else{
            return ch + skipCharacter2(unprocessed.substring(1));
        }
    }

}
