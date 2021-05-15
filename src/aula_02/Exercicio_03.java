package aula_02;
public class Exercicio_03 {
    public void exercicio_03(){
        int pen = 0;
        int ult = 1;
        System.out.println(pen);
        System.out.println(ult);
        for (int c = 0; c < 30; c++) {
            int prox = pen + ult;
            System.out.println(prox);
            pen = ult;
            ult = prox;
        }
    }
}
