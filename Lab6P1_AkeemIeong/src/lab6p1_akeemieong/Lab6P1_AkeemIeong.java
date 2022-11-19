package lab6p1_akeemieong;

import java.util.Scanner;
import java.util.Random;

public class Lab6P1_AkeemIeong {

static Scanner leer=new Scanner(System.in);
static Random random=new Random();
    
    public static void main(String[] args) {
        int opcion;
        String place="";
        do{
            System.out.println("Bienvenido");
            System.out.println("1<-Turing");
            System.out.println("2<-Constante de Kaprekar");
            System.out.println("3<- salida");
            opcion=leer.nextInt();
            switch (opcion){
                case 1:
                    int num;
                    System.out.println("Ingrese el tamano del arreglo: ");
                    num=leer.nextInt();
                    
                    int []nume=numeros(num);
                    imprimir(nume);
                    
                    System.out.println("Ingrese las instruciones: ");
                    String inst=leer.next().toUpperCase();
                        position(inst,nume);
                        //System.out.println("Cadena "+position);
                    
                    
                        
                    
                    break;
                case 2:
                    int origin,tem,cont=0;
                    System.out.print("Numero original: ");
                    origin=leer.nextInt();
                    tem=origin;
                    while(tem>0){
                        tem=tem/10;
                        cont++;
                    }
                    if (cont==4){
                        iguales(origin);
                        menormayor(origin);
                        
                    }
                    else System.out.println("No tiene 4 digitos");
                    break;
            }
        }while(opcion!=3);
    }
    public static int[] numeros(int num ){
        int[]nume=new int[num];
        for(int i=0;i<num;i++){
            nume[i]=random.nextInt(10);
            
        }
     return nume;
    }
    
   public static void imprimir(int []array){
        for(int i=0;i<array.length;i++){
            System.out.print("["+array[i]+"]");
        }
        System.out.println();
    }

   public static  String position(String inst,int [] nume){
       int it=0;
       String finale="";
        for (int i=0;i<inst.length();i++){
            
            if (inst.charAt(i)=='L'){          
            it--;
                
            }else
                if (inst.charAt(i)=='R'){
                it++;
                    
                }else
                    if (inst.charAt(i)=='X'){
                        
                        System.out.println(nume);
                        for(int p=0;p<nume.length;p++){
                            if (it==nume[p]){
                            finale+=nume[p];
                                System.out.println(nume[p]);
                            }
                        }
                    }
                    else System.out.println("Instrucion no declarada");
        }
       return finale;
   }
   public static int iguales(int origin){
       boolean compro=false;
       int tempo=origin,res,lon=0;
       while(tempo>0){
            res=tempo%10;
            tempo=tempo/10;
            if (res==tempo%10){
           lon++;
            }
        }
       if (lon==3){
           System.out.println("El digito se repite 4 veces");  
       }
       
       return origin;
   }
   public static int[]menormayor(int origen){
       int gen,residuo,residuo2;
       int[]menor=new int [4];
       int i=0;
       if (i==0){
        gen=origen/1000;
        menor[i]=gen;
        residuo=gen*1000;
        i++;
       }else
           if(i==1){
               gen=origen/100-residuo;
        menor[i]=gen;
        residuo=gen*100;
        i++;
           }else
               if(i==2){
                   gen=origen/10;
                    menor[i]=gen;
                    i++;
                   
               }else
                   if(i==3);
                    menor[i]=gen;
                    i++;
                       
                   }
       imprimir(menor);
       return menor;
   }
   //public static int[]mayormenor(int menor){
       
   //}
}
