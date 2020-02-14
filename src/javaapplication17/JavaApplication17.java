package javaapplication17;

import java.text.DecimalFormat;
import java.util.Scanner;
import javafx.scene.paint.Color;
import javax.swing.JLabel;

/**
 *FUNCTIONS SUBPROGRAMAS
 * @author paualbcar
 */
public class JavaApplication17 {

    static Scanner keyboard = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.000");
            
 public static final String ANSI_BLUE ="\u001B[34m";
 public static final String ANSI_PURPLE = "\u001B[35m";
 public static final String ANSI_YELLOW = "\u001B[33m";
 public static final String ANSI_RESET = "\u001B[0m";
 
  
    public static void main(String[] args) {
        System.out.println("Author: Pau");
       int euro = 100;
       float result = conversorPau(euro);
        System.out.println(result);
        int option;
        do {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {
            case 1: 
                    euro = keyboard.nextInt();
                    
                    result = conversorPau(euro);
                break;                  
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
            System.out.println("Letter ?:");
            char letter = (keyboard.next()).charAt(0);
            String letterBinary = Integer.toBinaryString(letter);
             System.out.println(letter + "=" + letterBinary);
            
            
            case 8:                 
                System.out.println("Letter ?:");
                
                break;
            }
        
        }while (option !=0);
    }
    

    
    
    //apartado 1 int to float
    private static float conversorPau(int euroPau){
        float resultPau=0;
        resultPau =(float)euroPau/0.91f;

        return resultPau;
    }
    
        private static double conversorIntDouble(int euroPau){
        double resultPau=0;
        
        resultPau =Double.valueOf(euroPau) /0.91f;

        return resultPau;
    }
    
      private static String conversorIntString(int euroPau){
        String resultPau="0";
        
        resultPau =String.valueOf(euroPau /0.91);
        return df.format(resultPau);
        
    }
    
     private static String conversorLetraInt(String euroPau){
        int resultPau= 0;
        
        resultPau = (int)(Integer.parseInt(euroPau) /0.91);
        return df.format(resultPau);
        
    }
    
     
      private static String conversorCharString(char letter){
        int resultPau=0;
        
        resultPau =(int) letter;
        return df.format(resultPau);
        
    }
        private static void charToBinary(char ch){
        String letterBinary = Integer.toBinaryString(ch);
            System.out.println(ch +"="+ letterBinary);
        
    }
        
         private static String StringToBinary2(String str){
        String result="";
        String letterBinary;
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
       result += Integer.toBinaryString(ch);
        }
        return result;
    }
         
         private static void Apartado10(){
        for (int i=0; i<255;i++){
            System.out.println(i + "\t"+ Integer.toString(i,16) + "=" + (char)i);
        }
    }
//    //Calcular PvP
//   private static double function(double price, double IVA){
//   
//    double  PVP = 0;
//    PVP = price + price*(IVA/100);
//    return PVP;
//}
   
//   private static void method(double pricepvp, double ivapvp, double pvpres) {
//       System.out.println("IVA= "+ANSI_BLUE+ivapvp+ANSI_RESET);
//       System.out.println("Precio SIN iva= "+ANSI_PURPLE+pricepvp+ANSI_RESET);
//       System.out.println("Precio con IVA " +ANSI_YELLOW+ pvpres+ANSI_RESET);
//}

    private static void userMenu() {
        System.out.println("Ask for € and return Dollars, int-Float");
        System.out.println("Ask for € and return Pounds, int-Double");
        System.out.println("Ask for € and return Yens, int-String");
        System.out.println("Ask for € and return BTC, String-Int");
        System.out.println("Ask for € and return Bat, float-int");
        System.out.println("Ask for € and return Dollars, float-string");
        System.out.println("Ask for € and return Dollars, char");
        System.out.println("Ask for € and return Dollars.char-binary");
        System.out.println("Ask for € and return Dollars, int-char");
        System.out.println("Ask for € and return Dollars, char-int");
    }
   
}
