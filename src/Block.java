public class Block {
    private int[] arrayNumber;
//-----------------I A)-------------------------
    public Block(int numberQuantity) {
        if (numberQuantity < 6) {
            numberQuantity = 6;

        } else if (numberQuantity > 49) {
            numberQuantity = 49;
        }
        arrayNumber = new int[numberQuantity]; // array length
        int i = 0;
        while (i < numberQuantity) {
            int randNumber = (int) Math.floor(Math.random() * (49 - 1 + 1) + 1);
            boolean repeatedNumber = false;
            for (int j = 0; j < i && repeatedNumber == false; j++) {
                if (arrayNumber[i] == randNumber) {
                    repeatedNumber = true;
                }
            }
            if(repeatedNumber == false){
                arrayNumber[i] = randNumber;
            }

        }
    }
//-------- II A)----------------------------
    public Block (int [] preselectedNumbers){
        arrayNumber = preselectedNumbers;


    }

    //-------- III A)----------------------------
    public String toString() {
        String resultString = "";
        for (int i = 0 ; i < arrayNumber.length ; i++){
            resultString += arrayNumber[i] + ", ";
            if(i == arrayNumber.length -1){
                resultString += arrayNumber[i];
            }
        }
        return resultString  ;
    }
    // ----------------- IV A) ---------------------------------
    public int [] getNumbers(){
        return arrayNumber;

    }


}

