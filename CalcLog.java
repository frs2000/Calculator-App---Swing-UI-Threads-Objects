package newCalc;

public class CalcLog {
    private int oper1 ;
    private int oper2 ;
    private int result ;
    private String simbol ;

    public void setOper1(int oper1){
        this.oper1 = oper1 ;
    }

    public void setOper2(int oper2){
        this.oper2 = oper2 ;
    }

    public int getOper1(){
        return oper1 ;
    }

    public int getOper2(){
        return oper2 ;
    }

    public void setChat(String simbol){
        this.simbol = simbol ;
    }

    public int getetResult(){
        if (simbol.equals("+")) result = oper1 + oper2 ;
        if (simbol.equals("-")) result = oper1 - oper2 ;
        if (simbol.equals("*")) result = oper1 * oper2 ;
        if (simbol.equals("/")) result = oper1 / oper2 ;

        return result ;
    }


}
