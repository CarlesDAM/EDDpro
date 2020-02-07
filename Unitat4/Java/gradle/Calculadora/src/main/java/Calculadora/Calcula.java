
package Calculadora;


public class Calcula {
      private float lastResult;
    private String lastOp;

    public float getLastResult(){
        return this.lastResult;
    }

    public String getLastOp(){
        return this.lastOp;
    }

    public float suma(float op1, float op2){
        float result=op1+op2;
        this.lastResult=result;
        this.lastOp="Suma";

        return result;
    }

    public float resta(float op1, float op2){
        float result=op1-op2;
        this.lastResult=result;
        this.lastOp="Resta";

        return result;
    }

    public float multiplica(float op1, float op2){
        // Fem els càlculs
        float result=op1*op2;

        // Actualitzem els atributs de la classe
        this.lastResult=result;
        this.lastOp="Multiplica";

        // I finalment retornem els resultats
        return result;
    }

    public float divideix(float op1, float op2){
        // Fem els càlculs
        float result=op1/op2;

        // Actualitzem els atributs de la classe
        this.lastResult=result;
        this.lastOp="Divideix";

        // I finalment retornem els resultats
        return result;
    }

     public boolean MajorQue(float op1, float op2){
        // Fem els càlculs
        
        boolean result;
        
        if(op1 > op2){
              result=true;
        }
        else{
            result=false;
        }

        // I finalment retornem els resultats
        return result;
    }
     public float mitjana(float op1, float op2){
        // Fem els càlculs
          float result=(op1+op2)/2;

        // Actualitzem els atributs de la classe
        this.lastResult=result;
        this.lastOp="Mitjana";

        // I finalment retornem els resultats
        return result;
    }
     public static boolean EsPrim(int op1){
         int contador = 2;
         boolean Prim = true;
         while ((Prim)&&(contador!=op1)){
             if (op1 % contador == 0)
                 Prim = false;
             contador++;
         }
         
         if(Prim = true){
             System.out.println("El numero que has triat es Prim");
         }else
        {
            System.out.println("El numeor que has triat no es Prim");
        }
         
      return Prim;       
     }
    
}
