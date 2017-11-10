package io.zipcoder.microlabs.arrays;


import java.util.Arrays;

public class ArrayParty {

    public String printArray(String[] inputArray){
        String output = "*** Output ***";
        for (String foods: inputArray){
            output += "\n" + foods;
        }
        return output;
    }

    public String lastElement(String[] inputArray){
        return inputArray[inputArray.length-1];

    }

    public String lastButOne(String[] inputArray){

        return inputArray[inputArray.length-2];
    }

    public String reverse(String[] inputArray){
        String output = "";
        for (int i = inputArray.length-1; i >= 0; i-- ){
            output += inputArray[i];
        }
        return output;
    }

    public boolean isPalindrome(String[] inputArray){
        int otherIndex = inputArray.length - 1;
        for (int i = 0; i < inputArray.length; i++) {
            if (!inputArray[i].equals(inputArray[otherIndex])) {
                return false;
            }
            otherIndex --;
        }
        return true;
    }

    public String compress(int[] inputArray){
        String output = "" + inputArray[0];
        for(int i = 1; i < inputArray.length; i++){
            if (inputArray[i] != inputArray[i-1]){
                output += inputArray[i];
            }
        }return output;
    }

    public String pack(char[] inputArray){
        String output = "" + inputArray[0];
        for (int i = 1; i < inputArray.length; i++){
            if(inputArray[i] == inputArray[i-1]) {
                output += inputArray[i];
            }else if(inputArray[i] != inputArray[i-1]){
                output +=  ", " + inputArray[i];
            }
        }return output;
    }

}
