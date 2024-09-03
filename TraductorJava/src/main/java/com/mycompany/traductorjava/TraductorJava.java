package com.mycompany.traductorjava;
import java.util.Scanner;
public class TraductorJava {

   
        
    static String[] numerosEsp = {
        "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
        "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte",
        "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco", "veintiséis", "veintisiete", "veintiocho", "veintinueve", "treinta",
        "treinta y uno", "treinta y dos", "treinta y tres", "treinta y cuatro", "treinta y cinco", "treinta y seis", "treinta y siete", "treinta y ocho", "treinta y nueve", "cuarenta",
        "cuarenta y uno", "cuarenta y dos", "cuarenta y tres", "cuarenta y cuatro", "cuarenta y cinco", "cuarenta y seis", "cuarenta y siete", "cuarenta y ocho", "cuarenta y nueve", "cincuenta",
        "cincuenta y uno", "cincuenta y dos", "cincuenta y tres", "cincuenta y cuatro", "cincuenta y cinco", "cincuenta y seis", "cincuenta y siete", "cincuenta y ocho", "cincuenta y nueve", "sesenta",
        "sesenta y uno", "sesenta y dos", "sesenta y tres", "sesenta y cuatro", "sesenta y cinco", "sesenta y seis", "sesenta y siete", "sesenta y ocho", "sesenta y nueve", "setenta",
        "setenta y uno", "setenta y dos", "setenta y tres", "setenta y cuatro", "setenta y cinco", "setenta y seis", "setenta y siete", "setenta y ocho", "setenta y nueve", "ochenta",
        "ochenta y uno", "ochenta y dos", "ochenta y tres", "ochenta y cuatro", "ochenta y cinco", "ochenta y seis", "ochenta y siete", "ochenta y ocho", "ochenta y nueve", "noventa",
        "noventa y uno", "noventa y dos", "noventa y tres", "noventa y cuatro", "noventa y cinco", "noventa y seis", "noventa y siete", "noventa y ocho", "noventa y nueve", "cien"
    };
    
    static String[] numerosEng = {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
        "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine", "thirty",
        "thirty-one", "thirty-two", "thirty-three", "thirty-four", "thirty-five", "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine", "forty",
        "forty-one", "forty-two", "forty-three", "forty-four", "forty-five", "forty-six", "forty-seven", "forty-eight", "forty-nine", "fifty",
        "fifty-one", "fifty-two", "fifty-three", "fifty-four", "fifty-five", "fifty-six", "fifty-seven", "fifty-eight", "fifty-nine", "sixty",
        "sixty-one", "sixty-two", "sixty-three", "sixty-four", "sixty-five", "sixty-six", "sixty-seven", "sixty-eight", "sixty-nine", "seventy",
        "seventy-one", "seventy-two", "seventy-three", "seventy-four", "seventy-five", "seventy-six", "seventy-seven", "seventy-eight", "seventy-nine", "eighty",
        "eighty-one", "eighty-two", "eighty-three", "eighty-four", "eighty-five", "eighty-six", "eighty-seven", "eighty-eight", "eighty-nine", "ninety",
        "ninety-one", "ninety-two", "ninety-three", "ninety-four", "ninety-five", "ninety-six", "ninety-seven", "ninety-eight", "ninety-nine", "one hundred"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer número (0-100): ");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el segundo número (0-100): ");
        int numero2 = sc.nextInt();
        
        System.out.println("english/espanol");
        String idioma = sc.next();
        
        int suma = numero1 + numero2;
        
        if (idioma.equalsIgnoreCase("espanol")) {
            System.out.println("La suma de " + numerosEsp[numero1] + " más " + numerosEsp[numero2] + " es " + numerosEsp[suma] + ".");
        } else if (idioma.equalsIgnoreCase("english")) {
            System.out.println("The sum of " + numerosEng[numero1] + " plus " + numerosEng[numero2] + " is " + numerosEng[suma] + ".");
        } else {
            System.out.println("Idioma no reconocido");
        }
        
     
    }
}
    
