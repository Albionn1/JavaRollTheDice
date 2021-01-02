import java.util.Scanner;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class RollTheDice {
	public static void gjuajeZarin(){

		System.out.println("Lojtari i pare te luaje duke shenuar numrin 1");
		
		Scanner sc = new Scanner(System.in);
		
		int lojtari1 = sc.nextShort();
		rezultatiIZarit1();
		
		System.out.println("Lojtari i dyte te luaje duke shenuar numrin 2");
		
		int lojtari2 = sc.nextShort();
		
		rezultatiIZarit2();
	}
	
	public static void rezultatiIZarit1() {
		
		int hedhja1 = (int)(6* Math.random() + 1);
		//Shtimi i numrave te zarave te arrayLista rezultati1 ma posht
		rezultati1.add(hedhja1);

		//hedhja1 =
		if(hedhja1 == 6) {
			
					String katrori_i_shtepise1 = (
							" -----\n|     |\n|     |\n -----"
							);
			System.out.println(katrori_i_shtepise1);
			
					
		}else if(hedhja1 == 5 & rezultati1.contains(6)) {
			
				
				String kulmi_i_shtepise1 = (
					"\t  \b\b\b\b\b\b\b\b \b/\\\n\t\b\b\b\b\b\b\b/\t\b\b\b\b\\\n -----\n|     |\n|     |\n -----"
						);
				System.out.println(kulmi_i_shtepise1);
		
				 
		}else if(hedhja1 == 4 & rezultati1.contains(5) & rezultati1.contains(6)){


			String dera_e_shtepise1 = "\t  \b\b\b\b\b\b\b\b \b/\\\n\t\b\b\b\b\b\b\b/\t\b\b\b\b\\\n -----\n|  _  |\n| | | |\n -----";

			System.out.println(dera_e_shtepise1);
		}else if(hedhja1 == 3 & rezultati1.contains(4) & rezultati1.contains(5) & rezultati1.contains(6)) {

			String dritarja = ("\t  \b\b\b\b\b\b\b\b \b/\\\n\t\b\b\b\b\b\b\b/\t\b\b\b\b\\\n -----\n|  _  |\n|x| |x|\n -----");

			System.out.println(dritarja);

		}
		else {
			System.out.println("nuk ke hedhur ndonje numer fitoreje");
		}
		System.out.println("Hedhja e pare: " + hedhja1);
		Collections.sort(rezultati1);
		System.out.println(rezultati1);
	}
	
	
	public static void rezultatiIZarit2() {
		int hedhja2 = (int)(6* Math.random() + 1);
		rezultati2.add(hedhja2);
		//hedhja1 =
		if(hedhja2 == 6) {
			
					String katrori_i_shtepise2 = (
							" -----\n|     |\n|     |\n -----"
							);
			System.out.println(katrori_i_shtepise2);
			
					
		}else if(hedhja2 == 5 & rezultati1.contains(6)) {
				
				String kulmi_i_shtepise2 = (
					"\t  \b\b\b\b\b\b\b\b \b/\\\n\t\b\b\b\b\b\b\b/\t\b\b\b\b\\\n -----\n|     |\n|     |\n -----"
						);
				System.out.println(kulmi_i_shtepise2);
		
				 
		}else if(hedhja2 == 4 & rezultati1.contains(6) & rezultati1.contains(5)){


			String dera_e_shtepise2 = "\t  \b\b\b\b\b\b\b\b \b/\\\n\t\b\b\b\b\b\b\b/\t\b\b\b\b\\\n -----\n|  _  |\n| | | |\n -----";

			System.out.println(dera_e_shtepise2);
		}else if(hedhja2 == 3 & rezultati1.contains(4) & rezultati1.contains(5) & rezultati1.contains(6)){

			String dritarja = ("\t  \b\b\b\b\b\b\b\b \b/\\\n\t\b\b\b\b\b\b\b/\t\b\b\b\b\\\n -----\n|  _  |\n|x| |x|\n -----");

			System.out.println(dritarja);

		}
		else {
			System.out.println("nuk ke hedhur ndonje numer fitoreje");
		}
		System.out.println("Hedhja e dyte: " + hedhja2);
		Collections.sort(rezultati2);
		System.out.println(rezultati2);
	}
	private static List<Integer> rezultati2 = new ArrayList<>();
	private static List<Integer> rezultati1 = new ArrayList<>();
	public static void main(String [] args) {
		//System.out.println(" -----\n|     |\n|     |\n -----");
		//while()
		//System.out.println("\t  \b\b\b\b\b\b\b\b \b/\\\n\t\b\b\b\b\b\b\b/\t\b\b\b\b\\\n -----\n|  _  |\n|x| |x|\n -----");
		while(true){
		gjuajeZarin();
		}
	}
}
