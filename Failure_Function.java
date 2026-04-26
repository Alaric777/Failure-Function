import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lol=new Scanner(System.in);

        System.out.println("Ponga una cadena de caracteres: ");
        String name= lol.next();

        Main example = new Main();
        example.failure_function_exercise_1(name);

        System.out.println("Para analizar otra cadena vuelva a correr el codigo");

    }

    //funcion de fallo or failure function
    public void failure_function_exercise_1(String name){
        // array de palabras
        String [] word=name.split("");
        // array de la funcion de fallo
        int _length=word.length;
        int [] failure=new int [_length];

        //----
        failure[0]=0; //asigancion por default propia del psudocodigo
        int t=0; // variable propia del pseudocodigo

        for (int i=1;i<_length;i++){

            while(t>0 && (word[i].compareTo(word[t]))!=0) {
                t = failure[t-1];
            } // fin del while loop
            if((word[i].compareTo(word[t]))==0){
                t++;
                failure[i]=t;
            } // fin del if

                else {
                    failure[i]=0;
            }// fin del else
            } //fin del for loop


        for (int XD:failure){
            System.out.println(XD);
        }
    }

}
