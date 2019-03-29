package calculadora;
public class Operacoes {
    float soma;
    float subtrai;
    float multiplica;
    float dividir;
    
    public float Soma(float x, float y){
        this.soma=x+y;
        return this.soma;
    }
    
    public float Subtrai(float x, float y){
        this.subtrai=x-y;
        return this.subtrai;
    } 
    
    public float Multiplica(float x, float y){
        this.multiplica = x * y;
        return this.multiplica;
    }
    
    public float Divide(float x, float y){
        this.dividir = x / y;
        return this.dividir;
    }
    
}

