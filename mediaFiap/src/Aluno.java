public class Aluno {

    String nome;
    int RM;
    float cp1, cp2, cp3;
    float GS;
    float challenge;


    //20%cp 60%globalsolution 20%challenge
     double calcularMedia(){

        float mediaCp = (cp1 + cp2 + cp3) / 3;
        double mediaTotal = cp1 * 0.2 + challenge * 0.2 + GS * 0.6;

        return mediaTotal;
    }

}


