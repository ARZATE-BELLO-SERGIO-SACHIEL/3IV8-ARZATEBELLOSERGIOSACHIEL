import java.util.Scanner;

class ESTRUCTURAS{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int edad, letra;
        int numero;
        int opcion, opciona;
        int positivo=0;
        int negativo=0;
        double temp, tempc, numero2,numero4,numero5;
        double altura,lado,area,perimetro = 0;
        long factorial = 1;
        char selector;
        double suma=0;
     
        do{
        System.out.println("**********************************");
        System.out.println("*3IV8_ARZATE_BELLO_SERGIO_SACHIEL*");
        System.out.println("**********************************");
        System.out.println("HOLA BIENVENIDO A MI MENU, ESPERO TE GUSTE UWU XD");
        System.out.println("");
        System.out.println("ELIGE UNA OPCION");
        System.out.println("1 EDAD");
        System.out.println("2 COMVIERTE DECIAMAL A BINARIO");
        System.out.println("3 CONVIERSOR DE TEMPERATURA");
        System.out.println("4 CONTAR POSITIVOS Y NEGATIVOS");
        System.out.println("5 LEER CANTIDADES");
        System.out.println("6 AREA Y PERIMETRO");
        System.out.println("7 TABLA DE VALORES");
        System.out.println("8 FACTORIAL");
        System.out.println("9 SALIDA");
        

        opcion = entrada.nextInt();
        
        switch (opcion) {
            
            case 1:
                do{
                System.out.println("HOLA INGRESE SU EDAD POR FAVOR");
                edad = entrada.nextInt();
                if(edad>=65){
                System.out.println("USTED APLICA PARA UN DESCUENTO DEL 40%");

                }
                else{
                    if(edad<=21 && edad>0){
                        System.out.println("¿SUS PAPAS SON SOCIOS? DE SERLO PRECIONE s");
                        selector = entrada.next().charAt(0);

                        if(selector == 's' || selector == 'S'){
                        System.out.println("USTED APICA PARA UN DESCUENTO DEL 45%");

                        }
                        else{
                              System.out.println("USTED APICA PARA UN DESCUENTO DEL 25%");  
                            }
                        }
                        else{
                            System.out.println("USTED NO APLICA PARA NINGUN DESCUENTO");
                            
                        }

                    }
                    System.out.println("");
                    System.out.println("SI DESEA REPETIR EL PRGRAMA PRECIONE s");
                    System.out.println("SI DESEA SALIR PRECIONE e");
                    System.out.println("");
                    selector = entrada.next().charAt(0);
                 }while(selector=='s'||selector=='S');
                   
                break;
            case 2:
                 do{
                System.out.println("DAME TU NUMRO DECIMAL");
                numero = entrada.nextInt();
                String binario = "";

                if (numero > 0) {
        
                    while (numero > 0) {
        
                        if (numero % 2 == 0) {
        
                            binario = "0" + binario;
        
                        } else {
        
                            binario = "1" + binario;
        
                        }
        
                        numero = (int) numero / 2;
        
                    }
        
                } else if (numero == 0) {
        
                    binario = "0";
        
                } else {
        
                    binario = "No se pudo convertir el numero. Ingrese solo números positivos";
        
                }
        
                System.out.println("El número convertido a binario es: " + binario);
                System.out.println("");
                System.out.println("SI DESEA REPETIR EL PRGRAMA PRECIONE s");
                System.out.println("SI DESEA SALIR PRECIONE e");
                System.out.println("");
                selector = entrada.next().charAt(0);
                }while(selector=='s'||selector=='S');
                break;
              
            case 3:
                do{
                System.out.println("ingrese su temperatura en grados");
                temp = entrada.nextDouble();
                System.out.println(temp);
                System.out.println("");
                System.out.println("");
                System.out.println("seleccione una opcion");
                System.out.println("");
                System.out.println("1 DE FAHRENHEIT A CELCIUS");
                System.out.println("2 DE FAHRENHEIT A KELVIN");
                System.out.println("3 DE FAHRENHEIT A RANKINE");
                System.out.println("4 DE CELCIUS A FAHERENHEIT");
                System.out.println("5 DE CELCIUS A KELVINE");
                System.out.println("6 DE CELCIUS A RANKINE");
                System.out.println("7 DE KELVINE A FAHRENHEIT");
                System.out.println("8 DE KELVINE A CELCIUS");
                System.out.println("9 DE KELVINE A RANKINE");
                System.out.println("10 DE RANKINE A FAHRENHEIT");
                System.out.println("11 DE RANKINE A CELCIUS");
                System.out.println("12 DE RANKINE A KELVINE");
                System.out.println("13 SALIR");
                System.out.println("INTRODUSCA SU OPCION");
                opciona = entrada.nextInt();
                switch (opciona) {
                    case 1:
                        tempc = (temp-32)*5/9;
                        System.out.println("LA TEMPERATURA ES: "+tempc);
                        break;
                    case 2:
                        tempc = (temp-32)*5/9+273.15;
                        System.out.println("LA TEMPERATURA ES: "+tempc);
                        break;
                    case 3:
                        tempc = temp+459.67;
                        System.out.println("LA TEMPERATURA ES: "+tempc);
                        break;
                    case 4:
                        tempc = temp*9/5+32;
                        System.out.println("LA TEMPERATURA ES: "+tempc);
                        break;
                    case 5:
                        tempc = temp+273.15;
                        System.out.println("LA TEMPERATURA ES: "+tempc);
                        break;
                    case 6:
                        tempc = temp*9/5+491.67;
                        System.out.println("LA TEMPERATURA ES: "+tempc);
                        break;
                    case 7:
                        tempc = temp-273.15*9/5+32;
                        System.out.println("LA TEMPERATURA ES: "+tempc);
                        break;
                    case 8:
                        tempc = temp-273.15;
                        System.out.println("LA TEMPERATURA ES: "+tempc);
                    case 9:
                        tempc = temp*9/5;
                        System.out.println("LA TEMPERATURA ES: "+tempc);
                        break;
                    case 10:
                        tempc = temp-259.67;
                        System.out.println("LA TEMPERATURA ES: "+tempc);
                        break;
                    case 11:
                        tempc = (temp-491.67)*5/9;
                        System.out.println("LA TEMPERATURA ES: "+tempc);
                        break;
                    case 12:
                        tempc = (temp)*5/9;
                        System.out.println("LA TEMPERATURA ES: "+tempc);
                        break;

                    default:
                        System.out.println("GRACIAS POR USAR MI PROGRAMA UWU");
                        break;
                }
                System.out.println("");
                System.out.println("SI DESEA REPETIR EL PROGRAMA ESCRIBA s");
                System.out.println("SI DESEA SALIR PRECIONE e");
                System.out.println("");
                selector = entrada.next().charAt(0);
                }while(selector == 's'|| selector == 'S');
                break;
            case 4:
                
                do{
                System.out.println("INTRODUSCA LAC CANTIDAD DE DATOS QUE DESEA ANALIZAR");
                numero = entrada.nextInt();
                if(numero>0){
                    for(int i = 1;i<=numero;i++){
                        
                        System.out.println("INGRESE UN NUMERO NATURAL");
                        numero2 = entrada.nextDouble();

                        if(numero2>0){
                            positivo++;


                        }else{
                            if(numero2<0){
                                negativo++;
                            }

                        }

                    }
                    System.out.println("LA CANTIDAD DE NUMEROS POSITIVOS FUE: "+positivo);
                    System.out.println("LA CANTIDAD DE NUMEROS NEGATIVOS FUE: "+negativo);
                    

                }else{
                    do{
                       
                    System.out.println("EL NUMERO QUE INGRESO NO ES VALIDO, INGRESE UN NUMERO MAYOR A 0");
                    numero = entrada.nextInt();
                  }while(numero<=0);
                  for(int i = 1;i<=numero;i++){
                        
                    System.out.println("INGRESE UN NUMERO NATURAL");
                    numero2 = entrada.nextDouble();

                    if(numero2>0){
                        positivo++;


                    }else{
                        if(numero2<0){
                            negativo++;
                        }

                    }

                }
                System.out.println("LA CANTIDAD DE NUMEROS POSITIVOS FUE: "+positivo);
                System.out.println("LA CANTIDAD DE NUMEROS NEGATIVOS FUE: "+negativo);


                }
                int i = 1; 
                numero2 = 0;
                numero = 0;
                positivo=0;
                negativo=0;
                System.out.println("");
                System.out.println("SI DESEA REPETIR EL PROGRAMA ESCRIBA s");
                System.out.println("DE LO CONTRARIO PRESIONE e");
                System.out.println("");
                selector = entrada.next().charAt(0);
                
                }while(selector == 's'|| selector == 'S');
               

                break;
            case 5:
                do{
                System.out.println("INGRESE EL NUMERO DE COSASA QUE COMPRO");
                numero = entrada.nextInt();
                if(numero<=0){
                    do{
                        System.out.println("INGRESE UN VALOR MAYOR A 0 POR FAVOR");
                        numero = entrada.nextInt();
                    }while(numero<=0);
                        for(int i = 1;i<=numero;i++){
                        System.out.println("INGRESE EL PRECIO");
                        numero4 = entrada.nextDouble();
                        suma=numero4+suma;
                        }
                        
                        System.out.println("USTED COMPRO "+numero+" PRODUCTOS Y SU FACTURA ES DE $"+suma);
                    

                }else{
                    for(int i = 1;i<=numero;i++){
                    System.out.println("INGRESE EL PRECIO");
                    numero4 = entrada.nextDouble();
                    suma=numero4+suma;
                    }
                    System.out.println("USTED COMPRO "+numero+" PRODUCTOS Y SU FACTURA ES DE $"+suma);
                    
                }
                suma=0;
                System.out.println("");
                System.out.println("SI DESEA REPETIR EL PROGRAMA ESCRIBA s");
                System.out.println("SI DESEA SALIR PRECIONE e");
                selector = entrada.next().charAt(0);
                }while(selector == 's'|| selector == 'S');
                break;
            case 6:
                do{
                System.out.println("ELIJA LA OPCION DESEADA");
                System.out.println("");
                System.out.println("1 CALCULAR EL AREA Y EL PERIMETRO DE UN RECTANGULO");
                System.out.println("2 CALCULAR EL AREA Y EL PERIMETRO DE UN TRIANGULO");
                System.out.println("3 CALCULAR EL VOLUMEN DE UNA ESFERA");
                System.out.println("4 CALCULAR EL VOLUMEN DE UN CILINDRO");
                opciona = entrada.nextInt();
                switch (opciona) {
                    case 1:
                        System.out.println("INGRESA LA BASE");
                        lado = entrada.nextDouble();
                        System.out.println("INGRESA LA ALTURA");
                        altura = entrada.nextDouble();
                        perimetro = 2*(lado)+2*(altura);
                        area = lado*altura;
                        System.out.println("EL PERIMETRO DEL RECTANGULO ES: "+perimetro);
                        System.out.println("EL AREA DEL RECTANGULO ES: "+area);

                        
                        break;
                    case 2:
                        System.out.println("INGRESA LA BASE");
                        lado = entrada.nextDouble();
                        System.out.println("INGRESA LA ALTURA");
                        altura = entrada.nextDouble();
                        perimetro = 3*lado;
                        area = (lado*altura)/2;
                        System.out.println("EL PERIMETRO DEL TRIANGULO ES: "+perimetro);
                        System.out.println("EL AREA DEL TRIANGULO ES: "+area);

                        break;
                    case 3:
                        System.out.println("INGRESE EL RADIO");
                        lado = entrada.nextDouble();
                        area = (4/3)*(3.1416)*(lado*lado*lado);
                        System.out.println("EL V0LUMEN DE TU ESFERA ES: "+area);
                        break;
                    case 4:
                        System.out.println("INGRSE EL RADIO");
                        lado = entrada.nextDouble();
                        System.out.println("INGRESE LA ALTURA");
                        altura = entrada.nextDouble();
                        area = (3.1416)*(lado*lado)*altura;
                        System.out.println("EL V0LUMEN DE TU CILINDRO ES: "+area);
                        break;
                    default:
                        break;
                }
                System.out.println("");
                System.out.println("SI DESEA REPETIR EL PROGRAMA ESCRIBA s");
                System.out.println("SI DESEA SALIR PRECIONE e");
                System.out.println("");
                selector = entrada.next().charAt(0);
                }while(selector == 's'|| selector == 'S');
                break;
            case 7:
                do{
                System.out.println("---------------------------------");
                System.out.println("|N      |       |       |       |");
                System.out.println("---------------------------------");
                System.out.println("|1      |10     |100    |1000   |");
                System.out.println("---------------------------------");
                System.out.println("|2      |20     |200    |2000   |");
                System.out.println("---------------------------------");
                System.out.println("|3      |3      |300    |3000   |");
                System.out.println("---------------------------------");
                System.out.println("|4      |0      |400    |4000   |");
                System.out.println("---------------------------------");
                System.out.println("|5      |50     |500    |5000   |");
                System.out.println("---------------------------------");
                System.out.println("|6      |60     |600    |6000   |");
                System.out.println("---------------------------------");
                System.out.println("|7      |70     |700    |7000   |");
                System.out.println("---------------------------------");
                System.out.println("|8      |80     |800    |8000   |");
                System.out.println("---------------------------------");
                System.out.println("|9      |90     |900    |9000   |");
                System.out.println("---------------------------------");
                System.out.println("|10     |100    |1000   |1000   |");
                System.out.println("---------------------------------");
                System.out.println("");
                System.out.println("SI DESEA REPETIR LA TABLA ESCRIBA s");
                System.out.println("SI DESEA SALIR PRECIONE e");
                System.out.println("");
                selector = entrada.next().charAt(0);
                }while(selector == 's'|| selector == 'S');
                break;
              
            case 8:
                do{
                System.out.println("DAME TU NUMERO:");
                numero = entrada.nextInt();
                if(numero<0){
                    do{
                        System.out.println("DAME SOLO NUMEROS POSITIVOS");
                        numero = entrada.nextInt();
                    }while(factorial<0);
                        
                        for (int i = numero; i > 0; i--) {
                        factorial = factorial * i;
                        }
                        System.out.println("El factorial de " + numero + " es: " + factorial);
                }else{
                    for (int i = numero; i > 0; i--) {
                    factorial = factorial * i;
                    }
                    System.out.println("El factorial de " + numero + " es: " + factorial);
                
                }
             factorial=1;
             System.out.println("");
             System.out.println("SI DESEA REPETIR EL PROGRAMA ESCRIBA s");
             System.out.println("SI DESEA SALIR PRECIONE e");
             System.out.println("");
             selector = entrada.next().charAt(0);
             }while(selector == 's'|| selector == 'S');
             break;
        
            default:
                
                break;
         
        }
        System.out.println("");
        System.out.println("SI DESEA IR AL MENU PRINCIPAL PRESIONE m");
        System.out.println("SI DESEA SALIR PRESIONE e");
        System.out.println("");
        selector = entrada.next().charAt(0);
        }while(selector=='m'||selector=='M');
        System.out.println("");
        System.out.println("GRACIAS POR USAR MI PROGRAMA UWU,GG");
        System.out.println("");
    }


}


