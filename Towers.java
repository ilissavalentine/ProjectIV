public class Towers {
    //Solution to the Towers of Hanoi game.
    private int numDiscs; //Number of discs
    //Constructor param - the number of discs to use
    //Constructor calls a recursive method
    public Towers(int n){
        this.numDiscs = n;

        //Move the number of discs from peg 1 to peg 2
        //using peg 2 as a temporary storage location.
        this.moveDiscs(this.numDiscs, 1, 3, 2);
    }
        private void moveDiscs(int num, int fromPeg,
                               int toPeg, int tempPeg){
        if (num > 0){
            //recursive call - creates another whole copy of method in RAM
            moveDiscs(num - 1, fromPeg, tempPeg, toPeg);
            System.out.println("Move a disc from peg " +
                    fromPeg + " to peg " + toPeg);

            moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
        }
        }
}
