/*
 *  TURBOSHOP ULTRA BEAST ELECTRO SHOP @miko @bundy @roxor
 */

import java.util.*;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main {
	// ints,string,float,chars here.. dame ich ako public do mainu
	
	// srandicky na intro loading a pod. casove hluposti
	public static void intro() throws InterruptedException{
		System.out.printf("Loading shop.");
		TimeUnit.SECONDS.sleep(1);
		System.out.printf(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.printf(".");
	}
	
	
	/* ______________________________________________________
	 * menuShow(){
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
	 * line(){
	 * vypise medzeru 2x
	 * vypise odelovaciu ciaru
	 * decodeRX5();
	 * money = fo;
	 * companyName zo suboru compname, money zo suboru compmoney
	 * dalsia odelovacia ciara
	 * 
	 * cize nejak takto:
	 * 
	 * 
	 * _______________________________________
	 * Money: 2500 €     Name: Turboelektro
	 * 
	 *______________________________________________________
	 */
	
	
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
	
	/*______________________________________________________
	 *exit(){
	 *System.exit(0)
	 *______________________________________________________
	 */
	
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
	
	
	/*______________________________________________________
	 * 
	 * decodeRX5(){
	 * ziskat zo suboru money.txt do jedneho stringu
	 * 
	 *  tu workin on moj kod na konvertovanie
	 * String a = "abb";
		
		
		//a.replace('a','c');
		a = a.replace('a', '5');
		a = a.replace('b', '0');
		

		System.out.println(a);
		int foo = Integer.parseInt(a);
		foo++;
		
		System.out.println(foo);
	 * ______________________________________________________
	 */
	
	/*______________________________________________________
	 * 
	 * encodeRX5(){
	 * money do stringu en
	 * en sa prekonvertuje mojim kodom na znaky
	 * zapisat do suboru money.txt
	 * ______________________________________________________
	 */
	
	
	public static void main(String[] args) throws InterruptedException {
		//checkOut();
		//intro(); 
		

		//menuShow(); <- vypis moznosti
		// Scanner na int vyberMenu (1,2,3,4,5 if other do printf prazdnu medzeru)
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
