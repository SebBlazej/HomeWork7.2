package app;

public class TestClass {

    public static void main(String[] args) {


        int startingNumberRange = 1;
        int finishNumberRange = 20;

        int numberToTry = 0;

        int modulo;
        do{
            modulo = 0;
            numberToTry++;
            for(int divider = startingNumberRange; divider <= finishNumberRange; divider++){
                modulo = numberToTry % divider;
                if(modulo != 0 ) break;
            }

        }while(modulo != 0);

        System.out.println("Najmniejsza szukana liczba to - " + numberToTry);

    }
}
