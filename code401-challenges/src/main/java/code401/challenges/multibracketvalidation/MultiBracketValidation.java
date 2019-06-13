package code401.challenges.multibracketvalidation;

public class MultiBracketValidation {

    public static void main(String[] args){
        System.out.println(multiBracketValidation("{(})"));
    }

    public static boolean multiBracketValidation(String input){
        //an array of size 3 that will represent the number of each type of bracket the string contains
        //index 0 represents "(" and ")", index 1 represents "[" and "]",index 2 represents "{" and "}"
        int[] bracketArr = new int[] {0,0,0};

        for(int i =0; i < input.length(); i++){
            if(input.charAt(i) == '('){
                bracketArr[0]++;
            }else if(input.charAt(i) == ')'){
                bracketArr[0]--;
            }else if(input.charAt(i) == '['){
                bracketArr[1]++;
            }else if (input.charAt(i) == ']'){
                bracketArr[1]--;
            }else if(input.charAt(i) == '{'){
                bracketArr[2]++;
            }else if (input.charAt(i) == '}'){
                bracketArr[2]--;
            }
        }
        if(bracketArr[0] == 0 && bracketArr[1] == 0 && bracketArr[2] == 0){
            return true;
        }else{
            return false;
        }
    }
}
