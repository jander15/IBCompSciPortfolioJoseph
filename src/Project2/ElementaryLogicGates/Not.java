package Project2.ElementaryLogicGates;

public class Not {
    public boolean out;
    public Nand nand1= new Nand();
    public Not() {

    }

    public void compute(boolean in){
    nand1.compute(in,in);
    out=nand1.out;
    }

}
