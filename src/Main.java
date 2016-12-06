/*
 *  TURBOSHOP ULTRA BEAST ELECTRO SHOP @miko @bundy @roxor
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class Main {
	// ints,string,float,chars here.. dame ich ako public do mainu
	public static String foo;
	public static int fooInt;
	private static int money;
	public static Scanner sc = new Scanner(System.in);
	public static int menuChoice;
	public static int menuChoice2;
	public static String namepath = "name.txt";
	public static String moneypath = "money.txt";
	public static String listpath = "list.txt";
	public static File file = new File("name.txt");
	public static File fileM = new File("money.txt");
	public static String nameSet;
	public static BufferedWriter bw = null;
	public static FileWriter fw = null;
	public static BufferedWriter bwm = null;
	public static FileWriter fwm = null;
	public static String redo;
	
	public static String name;
	public static String[] nameArray;
	
	
	
	// JUST FOR FUN
	public static void intro() throws InterruptedException{
		System.out.printf("Loading shop.");
		TimeUnit.SECONDS.sleep(1);
		System.out.printf(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.printf(".");
		TimeUnit.SECONDS.sleep(1);
	}
	
	
	 public static void menuShow() throws IOException, InterruptedException{
		 line();
		 System.out.println("1) Products");
		 System.out.println("2) Buy");
		 System.out.println("3) Sell");
		 System.out.println("4) Settings");
		 System.out.println("5) Credits");
		 System.out.println("6) Exit");
		 
		 menuChoice = sc.nextInt();
		 ifka();
		 
		
	 }
	
	
	
	public static void line() throws IOException{
		//get data
		BufferedReader reader = null;
		int num=0;
	
	    	
		    reader = new BufferedReader(new FileReader(file));
		    name = reader.readLine();
			decodeRX5();
		
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("_______________________________________");
	System.out.println("Money: " +money +" | "      + "Shop Name: " +name);
	System.out.println();
	}
	
	public static void nameSet() throws IOException, InterruptedException{
		System.out.println("Enter Shop Name: ");
		nameSet = sc.nextLine();
		String content = nameSet;
	
		file.createNewFile();
		fileM.createNewFile();
		
		
		try {


			fw = new FileWriter(namepath);
			bw = new BufferedWriter(fw);
			bw.write(content);
			

			System.out.println("Shop Created !");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
		try {


			fwm = new FileWriter(moneypath);
			bwm = new BufferedWriter(fwm);
			bwm.write("a");
			bwm.newLine();
			bwm.write("v");
			bwm.newLine();
			bwm.write("c");
			bwm.newLine();
			bwm.write("a");
			bwm.newLine();
			bwm.write("h");
			bwm.newLine();
			
			
			bwm.write("t");
			bwm.newLine();
			bwm.write("p");
			bwm.newLine();
			bwm.write("p");
			bwm.newLine();
			bwm.write("p");
			bwm.newLine();
			
			bwm.write("x");
			bwm.newLine();
			
			bwm.write("d");
			bwm.newLine();
			bwm.write("h");
			bwm.newLine();
			bwm.write("l");
			

			System.out.println("5000 E added !");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bwm != null)
					bwm.close();

				if (fwm != null)
					fwm.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
		menuShow();
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
	
	public static void list(){}
	
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
	
	public static void buy(){}
	
	/*______________________________________________________
	 *buy(){ 
	 *line();
	 *
	 * 2 moznosti bud kupit Current cislo dodat kus
	 * abo new product
	 *______________________________________________________
	 */
	
	public static void sell(){}
	
	/*______________________________________________________
	 *sell(){ 
	 * otazka.. cislo produktu ktory chce predat
	 * toto musime poriesit ako sa na to pustime je tu viacero moznosti
	 *______________________________________________________
	 */
	
	
	
	public static void settings() throws InterruptedException, IOException{
		
	line();
	System.out.println("1) Change name");
	System.out.println("2) Restart");
	System.out.println("3) Back");
	
	 menuChoice2 =sc.nextInt();
	 if(menuChoice2 == 1){
			nameChange();	
			}
			if(menuChoice2 == 2){
			restartProgram();	
			}
			if(menuChoice2 == 3){
			menuShow();	
			}
			if(menuChoice2 != 1 || menuChoice2 != 2 || menuChoice2 != 3 ){
			error();
			settings();
			}
	
	}
	
	public static void credits() throws IOException, InterruptedException{
		System.out.println("*******************************");
		System.out.println("");
		System.out.println("     TURBOELEKTRO 2016");
		System.out.println("www.bit.ly/GitHub_turboelektro");
		System.out.println("");
		System.out.println("@R.Olejar @A.Bodnar @A.Rosko");
		System.out.println("");
		System.out.println("*******************************");
		System.out.println("Press \"ENTER\" to continue...");
		   Scanner scanner = new Scanner(System.in);
		   scanner.nextLine();
		
		   menuShow();
		
	}
	public static void exit(){
	 System.exit(0);
	}
	
	public static void nameChange(){}
	
	/*______________________________________________________
	 *nameChange(){
	 *scanner na string nameSet
	 *companyName = nameSet 
	 *zapis mena do compname.txt
	 *menuShow();
	 *______________________________________________________
	 */
	
	public static void restartProgram(){}
	
	/*______________________________________________________
	 *restartProgram(){
	 *bud delete suborov alebo len nahradenie prazdnym, asi skor delete
	 *nameOn = 0;
	 *exit();
	 *______________________________________________________
	 */
	
	public static void productSetUp(){}
	
	/*______________________________________________________
	 *productSetUp(){
	 *najoblubenejsia uloha
	 *vytvorit products.txt
	 *zapisat ich tam
	 *menuShow();  
	 *______________________________________________________
	 */
	
	public static void checkOut() throws IOException, InterruptedException{
		
		boolean exists = file.exists();
		if(exists == true){
			menuShow();
		
		}
		if(exists == false){

			
			try {
				nameSet();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
		
	}
	
	/*______________________________________________________
	 *checkOut(){
	 *najst subor reg.txt
	 *if string nameOn = yes pokracuj, else nameSet();
	 *______________________________________________________
	 */
	
	
	 public static void decodeRX5() throws IOException{
	 BufferedReader reader = null;
	 
	 FileReader f;
	try {
		foo="";
		f = new FileReader(fileM);
		BufferedReader br = new BufferedReader(f);
		
		 while ((redo=br.readLine())!=null)
	     {
			 if(redo.equals("q") || redo.equals("w") || redo.equals("e") || redo.equals("r") || redo.equals("t") || redo.equals("y") || redo.equals("u") || redo.equals("i") || redo.equals("o") || redo.equals("p")){
				 foo = foo +redo;
				 System.out.println(foo);	 
			 }
			 if(redo.equals("x")){
				 break;
			 }
	     }
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
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
	 System.out.println(foo);
	 
	 fooInt = Integer.parseInt(foo);
	 money = fooInt;	 

	 }
	 
	 
	
	
	 public static void randomLetters(){
		 Random r = new Random();

		    String alphabet = "asdfghjklzcvbnm";
		    for (int i = 0; i < 5; i++) {
		    	
				try {
					bwm.write(alphabet.charAt(r.nextInt(alphabet.length())));
					bwm.newLine();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		    } 
	 }
	 
	 
	 public static void encodeRX5(){

		 try{


	    		if(fileM.delete()){
	    			System.out.println(fileM.getName() + " is deleted!");
	    		}else{
	    			System.out.println("Error !");
	    		}

	    	}catch(Exception e){

	    		e.printStackTrace();

	    	}
		 
		try {
			fileM.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
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
		
		String[] fooArray =foo.split("(?!^)");
		
		int aa=0;
		int i=0;
		while (i != fooArray.length){
			
		try {
			bwm.write(fooArray[aa]);
			bwm.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		aa++;
		i++;
		}
		
		
		try {
			bwm.write("x");
			bwm.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		randomLetters();
	 }
	 
	 public static void error() throws InterruptedException{
		 System.out.println("Error!");
			TimeUnit.SECONDS.sleep(1);
	 }

	 
	
	 public static void ifka() throws IOException, InterruptedException{
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
	 }
	 
	public static void main(String[] args) throws InterruptedException, IOException {
		checkOut();
		//intro();
		
	
		
		
		menuShow();

		
		
	}

}
