public class Ticket {

    //-------- I B)--------------------------
    private Block[] blockArray;

    public Ticket(int numBlocks) {
        blockArray = new Block[numBlocks];
        for (int i = 0; i < numBlocks; i++) {
            Block auxBlock = new Block(6);
            blockArray[i] = auxBlock;
        }
    }

    //-------- II B)--------------------------
    public String toString() {
    String resString = "";
    for(int i = 0 ; i < blockArray.length; i ++){
        resString += blockArray[i].toString() + "\n";
    }
    return resString;
    }
    //-------- III B)--------------------------
    public void printUsedNumbers(){
        String resUsedNumbers = "";
        int [] auxRepeated = new int[49];
        int auxUsedNumber = 0;
        for(int i = 0; i < blockArray.length; i++){
            for(int j = 0 ; j <blockArray[i].getNumbers().length; j++){
                //comprobacion de que no esta repetido
                boolean usedNumber = false;
                for(int k = 0; k < auxRepeated.length ; k++){
                    if(blockArray[i].getNumbers()[j] == auxRepeated[k]){
                    usedNumber = true;
                    }
                }
                if(usedNumber == false){
                    resUsedNumbers += blockArray[i].getNumbers()[j] + ", ";
                    auxRepeated[auxUsedNumber] = blockArray[i].getNumbers()[j];
                    auxUsedNumber ++;
                }
            }
        }
        System.out.println(resUsedNumbers);


    }




}
