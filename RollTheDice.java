import java.util.Scanner;
import java.awt.event.*;
public class RollTheDice {
	public static void gjuajeZarin(){
		System.out.println("Lojtari i pare te luaje duke shenuar numrin 1");
		
		Scanner sc = new Scanner(System.in);
		
		short lojtari1 = sc.nextShort();
		
		rezultatiIZarit1();
		
		System.out.println("Lojtari i dyte te luaje duke shenuar numrin 2");
		
		short lojtari2 = sc.nextShort();
		
		rezultatiIZarit2();
	}
	
	
	public static void rezultatiIZarit1() {
		
		short hedhja1 = (short)(6* Math.random() + 1);
		
		if(hedhja1 == 6) {
			
					String katrori_i_shtepise1 = (
							" -----\n|     |\n|     |\n -----"
							);
			System.out.println(katrori_i_shtepise1);
			
					
		}else if(hedhja1 == 5) {
			
				
				String kulmi_i_shtepise1 = (
						"\t\b\b/\t\b\b/\n-----\n|     |\n|     |\n -----"
						);
				System.out.println(kulmi_i_shtepise1);
		
				 
		}else {
			System.out.println("nuk ke hedhur ndonje numer fitoreje");
		}
		System.out.println("Hedhja e pare: " + hedhja1);
	}
	
	
	public static void rezultatiIZarit2() {
		short hedhja2 = (short)(6* Math.random() + 1);
		
		System.out.println("Hedhja e dyte: " + hedhja2);
		
	}
	
	
	public static void main(String [] args) {
		//System.out.println(" -----\n|     |\n|     |\n -----");
		//while()
		System.out.println("\t  \b  \b/   \n\n -----\n|     |\n|     |\n -----");
		gjuajeZarin();
		
		
	}
}
