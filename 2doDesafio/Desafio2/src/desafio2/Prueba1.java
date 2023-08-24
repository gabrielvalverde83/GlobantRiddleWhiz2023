package desafio2;

public class Prueba1 {

    public static void main(String[] args) {
        
        String jString;
        long numAdel;
        long numOriginal;
        long mult;
        boolean validacion = true;
        long j = 0;
        
        //142857            j=num2=14285              + 7
        //                  num2String=String.valueof(num2);
        //                  numOiriginal = num2 *10 + num1
        //5*142857          mult= k * numOriginal
        //=714285           num4 =  num1 * Math.pow(10, num2String.length)+num2 

        
        do{
            j++;
            if(j % 100000000 == 0){System.out.println("Ya lleva Mil millones: " + j);}
            for(int i=0; i<=9; i++){
                jString = String.valueOf(j);
                numAdel = Math.round(i*Math.pow(10, jString.length()) + j);
                numOriginal = j*10 + i;
                mult = 9*numOriginal;
                if(numAdel == mult){
                    //System.out.println("Numero orginial: " + numOriginal);
                    System.out.println("Numero original " + numOriginal + " multiplicado por 9 " + " = " + numAdel);
                    validacion = false;
                    break;
                }
            }
            if (validacion == false){break;}
        }while(validacion == true);
        
        
        
        
        
    }
    
}
