/*
 *  TURBOSHOP ULTRA BEAST ELECTRO SHOP @miko @bundy @roxor
 */

import java.util.*;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main {
	// ints,string,float,chars here.. dame ich ako public do mainu
	public static String foo;
	public static int fooInt;
	private static int money;
	public static Scanner sc = new Scanner(System.in);
	public static int menuChoice;
	
	// JUST FOR FUN
	public static void intro() throws InterruptedException{
		System.out.printf("Loading shop.");
		TimeUnit.SECONDS.sleep(1);
		System.out.printf(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.printf(".");
	}
	
	
	 public static void menuShow(){
		 line();
		 System.out.println("1) Products");
		 System.out.println("2) Buy");
		 System.out.println("3) Sell");
		 System.out.println("4) Settings");
		 System.out.println("5) Credits");
		 System.out.println("6) Exit");
		 
		
	 }
	
	
	
	public static void line(){
	System.out.println("");
	System.out.println("");
	System.out.println("_______________________________________");
	// decodeRX5();
	//money = fo;
	// companyName zo suboru compname, money zo suboru compmoney
	System.out.println("Money: "       + "Shop Name: ");
	System.out.println();
	}
	
	
	/*______________________________________________________ 
	 * nameSet(){
	 * scanner na string nameSet
	 * companyName = nameSet
	 * vytvorenie suboru compname.txt
	 * zapisanie mena do suboru 
	 * vytvorenie suboru compmoney.txt
	 * 5000 convert to HASH  !!!! O to sa postara rikarox..
	 * zapisanie hashu do compmoney.txt
	 * vytvorenie suboru /zapisanie do suboru reg.txt yes // znamena ze je zaregistrovany
	 * productSetUp();
	 *______________________________________________________
	 */
	
	
	/*______________________________________________________
	 *list(){ 
	 *line();
	 * otvorit subor products.txt
	 * vypis
	 *  pred kazdym produktom bude cislo
	 *  
	 *   
	 *   otazka SELL abo BUY abo BACK(to je menu)
	 *   
	 *   sell();
	 *   buy();
	 *   menuShow();
	 *______________________________________________________
	 */
	
	/*______________________________________________________
	 *buy(){ 
	 *line();
	 *
	 * 2 moznosti bud kupit Current cislo dodat kus
	 * abo new product
	 *______________________________________________________
	 */
	
	/*______________________________________________________
	 *sell(){ 
	 * otazka.. cislo produktu ktory chce predat
	 * toto musime poriesit ako sa na to pustime je tu viacero moznosti
	 *______________________________________________________
	 */
	
	/*______________________________________________________
	 *randomSell(){ 
	 *line();
	 *
	 *   toto mozno bude mozno nebude je to optional ci sa nam chce s tym srat
	 *   asi kasleme na toto :D
	 *______________________________________________________
	 */
	
	/*______________________________________________________
	 *settings(){ 
	 *line();
	 *vypis
	 *1)zmena mena
	 *2)odznova
	 *3)back
	 * scanner na int settingsVyber
	 * case abo if. 
	 * 
	 * nameChange(); 1
	 * restartProgram(); 2
	 * menuShow(); 3
	 *______________________________________________________
	 */
	
	/*______________________________________________________
	 *credits(){ 
	 *printf kto to vyrobil a preco(skolska uloha)
	 *Space to continue
	 *menuShow();
	 *______________________________________________________
	 */
	
	public static void exit(){
	 System.exit(0);
	}
	
	/*______________________________________________________
	 *nameChange(){
	 *scanner na string nameSet
	 *companyName = nameSet 
	 *zapis mena do compname.txt
	 *menuShow();
	 *______________________________________________________
	 */
	
	/*______________________________________________________
	 *restartProgram(){
	 *bud delete suborov alebo len nahradenie prazdnym, asi skor delete
	 *nameOn = 0;
	 *exit();
	 *______________________________________________________
	 */
	
	/*______________________________________________________
	 *productSetUp(){
	 *najoblubenejsia uloha
	 *vytvorit products.txt
	 *zapisat ich tam
	 *menuShow();  
	 *______________________________________________________
	 */
	
	/*______________________________________________________
	 *checkOut(){
	 *najst subor reg.txt
	 *if string nameOn = yes pokracuj, else nameSet();
	 *______________________________________________________
	 */
	
	
	 public static void decodeRX5(){
		 // chcem aby so suboru money od 6 riadku tahalo znaky a zapisovalo do jedneho stringu foo, ak sa znak nebude rovnat qwertyuiop tak ukonci pridavanie
	 foo = foo.replace('q', '1');
	 foo = foo.replace('w', '2');
	 foo = foo.replace('e', '3');
	 foo = foo.replace('r', '4');
	 foo = foo.replace('t', '5');
	 foo = foo.replace('y', '6');
	 foo = foo.replace('u', '7');
	 foo = foo.replace('i', '8');
	 foo = foo.replace('o', '9');
	 foo = foo.replace('p', '0');
	 
	 fooInt = Integer.parseInt(foo);
	 money = fooInt;	 

	 }
	
	
	 public static void randomLetters(){
		 Random r = new Random();

		    String alphabet = "asdfghjklzcvbnm";
		    for (int i = 0; i < 5; i++) {
		    	//zapis do suboru money.txt
		        System.out.println(alphabet.charAt(r.nextInt(alphabet.length())));
		    } 
	 }
	 
	 
	 public static void encodeRX5(){
		//vymazat vsetko zo suboru money.txt
		randomLetters();
	    
	    StringBuilder fooConv = new StringBuilder();
	    fooConv.append("");
	    fooConv.append(money);
	    foo = fooConv.toString();
	    
		foo = foo.replace('1', 'q');
		foo = foo.replace('2', 'w');
		foo = foo.replace('3', 'e');
		foo = foo.replace('4', 'r');
		foo = foo.replace('5', 't');
		foo = foo.replace('6', 'y');
		foo = foo.replace('7', 'u');
		foo = foo.replace('8', 'i');
		foo = foo.replace('9', 'o');
		foo = foo.replace('0', 'p');
		
	    //zapisat foo do money.txt
        //zapisat do suboru "x"
		randomLetters();
	 }
	 
	 public static void error() throws InterruptedException{
		 System.out.println("Error!");
			TimeUnit.SECONDS.sleep(1);
	 }

	 
	
	public static void main(String[] args) throws InterruptedException {
		//checkOut();
		//intro();



		menuShow();
		menuChoice = sc.nextInt();
		if(menuChoice == 1){
		list();	
		}
		if(menuChoice == 2){
		buy();	
		}
		if(menuChoice == 3){
		sell();	
		}
		if(menuChoice == 4){
		settings();	
		}
		if(menuChoice == 5){
		credits();	
		}
		if(menuChoice == 6){
		exit();	
		}
		if(menuChoice != 1 || menuChoice != 2 || menuChoice != 3 || menuChoice != 4 || menuChoice != 5 || menuChoice != 6 ){
		error();
		menuShow();
		}

		
		
		// case abo if, na vyber moznosti
		/*
		 * list();
		 * randomSell();  *optional moznost
		 * settings();
		 * credits();
		 * exit();
		 * 
		 * 
		 */
		
		// line();
		
		
		

		
		
		
		
	}

}
