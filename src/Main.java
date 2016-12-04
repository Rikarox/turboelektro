/*
 *  TURBOSHOP ULTRA BEAST ELECTRO SHOP @miko @bundy @roxor
 */

	/*______________________________________________________
	 * 
	 *______________________________________________________
	 */
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
	// ints,string,float,chars here.. dame ich ako public do mainu
	
	// srandicky na intro loading a pod. casove hluposti
	public static void intro() throws InterruptedException{
		System.out.printf("Loading shop.");
		TimeUnit.SECONDS.sleep(1);   
	}
	
	
	/* ______________________________________________________
	 * menuShow() 
	 * line();
	 * 1) Products
	 * 2) Buy product
	 * 3) Random Sell //Simulacia kupujuceho
	 * 4) Sell product
	 * 5) Settings
	 * 6) Credits
	 * 7) Exit
	 * ______________________________________________________
	 */
	
	
	/*______________________________________________________ 
	 * line()
	 * vypise medzeru
	 * vypise odelovaciu ciaru
	 * HASH to int money !!!! o to sa postara rikarox.. 
	 * companyName zo suboru compname, money zo suboru compmoney
	 * dalsia odelovacia ciara
	 *______________________________________________________
	 */
	
	
	/*______________________________________________________ 
	 * nameSet()
	 * scanner na string nameSet
	 * companyName = nameSet
	 * vytvorenie suboru compname.txt
	 * zapisanie mena do suboru 
	 * vytvorenie suboru compmoney.txt
	 * 5000 convert to HASH  !!!! O to sa postara rikarox..
	 * zapisanie hashu do compmoney.txt
	 * nameOn = 1
	 * productSetUp();
	 *______________________________________________________
	 */
	
	
	/*______________________________________________________
	 *list() 
	 *line();
	 * otvorit subor products.txt
	 * vypis
	 *  dorobim pondelok
	 *______________________________________________________
	 */
	
	/*______________________________________________________
	 *buy() 
	 *line();
	 *aj toto necham na pondelok
	 *______________________________________________________
	 */
	
	/*______________________________________________________
	 *sell()
	 *line(); 
	 * sell current product, k tomu sa vyjardim pondelok :D
	 *______________________________________________________
	 */
	
	/*______________________________________________________
	 *randomSell() 
	 *line();
	 *
	 *   toto mozno bude mozno nebude je to optional ci sa nam chce s tym srat
	 *______________________________________________________
	 */
	
	/*______________________________________________________
	 *settings() 
	 *line();
	 *vypis
	 *1)zmena mena
	 *2)odznova
	 * scanner na settingsVyber
	 * case abo if. 
	 * 
	 * nameChange();
	 * restartProgram();
	 *______________________________________________________
	 */
	
	/*______________________________________________________
	 *credits() 
	 *printf kto to vyrobil a preco(skolska uloha)
	 *______________________________________________________
	 */
	
	/*______________________________________________________
	 *exit()
	 *ukoncit program 
	 *______________________________________________________
	 */
	
	/*______________________________________________________
	 *nameChange()
	 *scanner na string nameSet
	 *companyName = nameSet 
	 *zapis mena do compname.txt
	 *menuShow();
	 *______________________________________________________
	 */
	
	/*______________________________________________________
	 *restartProgram()
	 *bud delete suborov alebo len nahradenie prazdnym, asi skor delete
	 *nameOn = 0;
	 *exit();
	 *______________________________________________________
	 */
	
	/*______________________________________________________
	 *productSetUp()
	 *najoblubenejsia uloha
	 *vytvorit products.txt
	 *zapisat ich tam  
	 *______________________________________________________
	 */
	
	public static void main(String[] args) throws InterruptedException {
		//if boolean nameOn = 1 pokracuj, else nameSet();
			
		//intro(); 
		
		//menuShow(); <- vypis moznosti
		// Scanner na int vyberMenu (1,2,3,4,5,6,7, if other do printf prazdnu medzeru)
		// case abo if, na vyber moznosti
		/*
		 * list();
		 * buy();
		 * sell();
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
