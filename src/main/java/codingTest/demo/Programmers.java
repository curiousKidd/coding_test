package codingTest.demo;

public class Programmers {
    public void mbtiTest(){

        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        char[] arrayText = {'T', 'E', 'S', 'T'};
        int[] arrayValue = {0,0,0,0};

        int[] value = {3,2,1,0,-1,-2,-3};

        for(int i=0; i < choices.length; i++){

            int choiceValue = value[choices[i]-1];
            char[] chars = survey[i].toCharArray();

            switch (chars[0]){
                case 'R':
                    arrayValue[0] = arrayValue[0] + choiceValue;
                    break;
                case 'C':
                    arrayValue[1] = arrayValue[1] + choiceValue;
                    break;
                case 'J':
                    arrayValue[2] = arrayValue[2] + choiceValue;
                    break;
                case 'A':
                    arrayValue[3] = arrayValue[3] + choiceValue;
                    break;

                case 'T':
                    arrayValue[0] = arrayValue[0] - choiceValue;
                    break;
                case 'F':
                    arrayValue[1] = arrayValue[1] - choiceValue;
                    break;
                case 'M':
                    arrayValue[2] = arrayValue[2] - choiceValue;
                    break;
                case 'N':
                    arrayValue[3] = arrayValue[3] - choiceValue;
                    break;
            }

        }

        arrayText[0] = arrayValue[0] >= 0 ?  'R' : 'T' ;
        arrayText[1] = arrayValue[1] >= 0 ?  'C' : 'F' ;
        arrayText[2] = arrayValue[2] >= 0 ?  'J' : 'M' ;
        arrayText[3] = arrayValue[3] >= 0 ?  'A' : 'N' ;

        String returnText = new String(arrayText);
        System.out.println("returnText = " + returnText);
    }
}
