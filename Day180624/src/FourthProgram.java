public class FourthProgram {
    static boolean check(String word){
        try{
            if(Integer.parseInt(word)>0)return false;
        }
        catch(Exception e){
            return true;
        }
        return true;
    }
    int CountNoOfWords(String words[]){
        int count=0;
        for(int i=0;i<words.length;i++){
            if(check(words[i])){
//                System.out.println(words[i]);
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        FourthProgram Prog4=new FourthProgram();
        String sentence="Sum of 12 and 20 is 32";
        String words[]=sentence.split(" ");
        System.out.println(Prog4.CountNoOfWords(words));
    }
}
