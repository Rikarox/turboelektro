/*wodap how is it going bros my name is w/e 

taze asi takto, shop ide / da sa nakupovat aj predavat / nemalo by to hadzat exceptions ziadne ked hej ta napiste ze kde abo co :D
/ teraz, do suboru zapisujte systemom:     "meno-cena-pocet-"  bez tych "" len aby to bolo jasne  
/inak to nepojde
marza je konstantna = 0.8%   / ak chcete tak to zmente :D / vypisovana cena je s marzou taze ked dade buy zobere to menej jak je napisane

neni tam  to formatovanie este ze vypise pod seba ceny pocet 

next funkcie - reader = nahodi co je v subore do arraylistu text
	       printer = zalova reader a vypise co zisti
		buy = kupis viac ono neni to az take zlozite ked si to pozrete snad pochopite
		sell = opak buy ez 
		writer = neni to dokonale iba raz sa pouzije a to ked deletujes mohlo by to byt aj tak ze sa zavola aj v buy/sell 
			ale potreboval by upravit


++ dakto zrobte ten zoznam productov co budeme predavat 
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Program {
	public static double money = 5000.0f;
	public static double margin = 1.008;
	public static String PATH = "Turboelektro.txt";
	public static String moneyPATH = "money.txt";
	public static File file = new File(PATH);
	public static File fileM = new File(moneyPATH);
	public static ArrayList<String> text = new ArrayList<String>();

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		String optionS = "";
		int option = 0;
		ArrayList<String> setNewPro = new ArrayList<String>();
		String name = "";
		int exit = 0;

		try {
			if (file.createNewFile()) {
				System.out.println("File created.");		
				fileM.createNewFile();
				
				
				
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(moneyPATH))) {
						bw.write("5000.0");
						bw.newLine();
					bw.flush();
					bw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				
				
				
			} else {
				System.out.println("");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ****************
		// Shop starts here
		// ****************

		do {

			option = 0;
			menuShow();
			while (option == 0) {
				optionS = sc.next();
				try {
					option = Integer.parseInt(optionS);
				} catch (NumberFormatException e) {

				}
			}
			switch (option) {
			case 1:
				printer();
				break;
			case 2:
				buy(PATH);
				break;
			case 3:
				sell(PATH);
				break;
			case 4:
				reader(PATH);
				setNewPro.clear();
				String a;
				System.out.println("Set product name:");
				a = sc.next();
				setNewPro.add(a);
				while (setNewPro.size() == 1){
				System.out.println("Set product price:");
				a = sc.next();
				try {
				Integer.parseInt(a);
				setNewPro.add(a);
				}catch(NumberFormatException e){System.out.println("Wrong input.");}	
				
				}
				setNewPro.add("0");
				
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH))) {
					for (int i = 0; i < text.size(); i++) {
						bw.write(text.get(i));
						bw.newLine();
					}
					bw.write(setNewPro.get(0)+"-" +setNewPro.get(1)+"-"+setNewPro.get(2)+"-");
					bw.flush();
					bw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				

				break;
			case 5:
				name = "";
				String conf ;
				
				System.out.println("Which product you want to delete ?");
				printer();
				
				name = sc.next();
				for (int i = 0; i < text.size(); i++) {

					String parts[] = text.get(i).split("-");

					if (parts[0].equals(name)) {
						System.out.println("Do you really wish to delete product: "+'"'+name+'"' + "   Y/N  ?");
						conf = sc.next();
						if (conf.equals("y")|| conf.equals("Y")){
						text.remove(i);	
						writer();
						}
						else{System.out.println("Product was not deletet.");}
					}
				}
			
				break;
			case 6:
				exit++;
				break;
			default:
				System.out.println("Choose from the list below.");
				break;
			}

		} while (exit == 0);

	}
	// ****************
	// End of main
	// ****************

	public static void menuShow() {
		line();

		System.out.println("1. Products info");
		System.out.println("2. Buy products");
		System.out.println("3. Sell products");
		System.out.println("4. Add new product");
		System.out.println("5. Delete a product");
		System.out.println("6. Exit");
	}

	public static void line() {
	    readerMoney(moneyPATH);
		System.out.println("_______________________________________");
		System.out.println("Money: " + (float)money);
		System.out.println();
	}

	public static void reader(String PATH) {
		try {
			String thisLine = "";
			BufferedReader br = new BufferedReader(new FileReader(PATH));
			while ((thisLine = br.readLine()) != null) {
			text.add(thisLine);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void readerMoney(String moneyPATH) {
		try {
			String thisLine = "";
			BufferedReader br = new BufferedReader(new FileReader(moneyPATH));
			while ((thisLine = br.readLine()) != null) {
			text.add(thisLine);
			
			money = Float.parseFloat(thisLine);
			
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void printer (){
		text.clear();
		reader(PATH);
		for(int i =0; i < text.size();i++){
			
		System.out.println(text.get(i).replace("-"," "));

		}
		}
	
	public static void writer(){
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH))) {
			for (int i = 0; i < text.size(); i++) {
				bw.write(text.get(i));
				bw.newLine();
			}
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void moneyWriter(String moneyPATH){
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(moneyPATH))) {
			for (int i = 0; i < text.size(); i++) {
				
				String Line = Float.toString((float) money);
				bw.write(Line);
				bw.newLine();
			}
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void buy(String path) {
		Scanner sce = new Scanner(System.in);
		String bName = "";
		String name = "";
		int amount = 0;
		int addAmount = 0;
		String addAmountS = "";
		double price = 0;
		text.clear();

		System.out.println("Buy product: ");

		printer();
		while (bName.equals("")) {
			bName = sce.nextLine();
		}
		for (int i = 0; i < text.size(); i++) {

			String parts[] = text.get(i).split("-");

			if (parts[0].equals(bName)) {
				name = parts[0];
				price = Float.parseFloat(parts[1]);
				amount = Integer.parseInt(parts[2]);
				text.remove(i);
				break;
			}
		}

		if (name != "") {
			System.out.println("Amount: ");

			addAmountS = sce.next();
			try {
				addAmount = Integer.parseInt(addAmountS);
			} catch (NumberFormatException e) {
				System.out.println("Wrong input.");
			}

			if (price * addAmount <= money) {

				money = money - (price * (2-margin) * (double) addAmount);
				amount = amount + addAmount;
				
				moneyWriter(moneyPATH);

			} else {
				System.out.println("Not enought money.");
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH))) {
				for (int i = 0; i < text.size(); i++) {
					bw.write(text.get(i));
					bw.newLine();
				}
				bw.write(name + "-" + price + "-" + amount + "-");
				bw.flush();
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("There is no product named: " + '"' + bName + '"');
		}

	}

	public static void sell(String path) {
		Scanner sce = new Scanner(System.in);
		String sName = "";
		String name = "";
		int amount = 0;
		int subAmount = 0;
		String subAmountS = "";
		double price = 0;
		text.clear();

		System.out.println("Sell product: ");

		printer();

		while (sName.equals("")) {
			sName = sce.nextLine();
		}
		for (int i = 0; i < text.size(); i++) {

			String parts[] = text.get(i).split("-");

			if (parts[0].equals(sName)) {
				name = parts[0];
				price = Float.parseFloat(parts[1]);
				amount = Integer.parseInt(parts[2]);
				text.remove(i);
				break;
			}
		}

		if (name != "") {
			System.out.println("Amount: ");

			subAmountS = sce.next();
			try {
			} catch (NumberFormatException e) {
				System.out.println("Wrong input.");
			}

			if (amount >= subAmount) {
				money = money + (price * (double) subAmount);
				amount = amount - subAmount;

			} else {
				System.out.println("Not enought products.");
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH))) {
				for (int i = 0; i < text.size(); i++) {
					bw.write(text.get(i));
					bw.newLine();
				}
				bw.write(name + "-" + price + "-" + amount + "-");
				bw.flush();
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("There is no product named: " + '"' + sName + '"');
		}

	}

}