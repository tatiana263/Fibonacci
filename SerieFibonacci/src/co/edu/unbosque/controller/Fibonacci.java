package co.edu.unbosque.controller;

	public class Fibonacci {
		
	    public void serie() {
	        int a = 0;
	        int b = 1;
	        int limite = 32767;

	        System.out.print(a + " " + b);  

	        for(int i = 2; ; i++) {  
	            int suma = a + b;
	            if (suma > limite) {  
	                break;  
	            }
	            System.out.print(" " + suma);  
	            a = b;  
	            b = suma;  
	        }
	        System.out.println();  
	    }

	    public static void main(String[] args) {
	        Fibonacci x = new Fibonacci();
	        System.out.println("La serie de Fibonacci es:");
	        x.serie();
	    }
	}


