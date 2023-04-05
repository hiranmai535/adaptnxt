package adaptnxt_assessment;

import java.io.File;
import java.io.PrintWriter;

public class creating_csv {
	public static void main(String[] args) {
		
		try {
			
			PrintWriter pw= new PrintWriter(new File("C:\\Users\\raji\\Desktop\\adaptnxt.csv"));
			StringBuilder sb= new StringBuilder();
			
			sb.append("Product Name ");
			sb.append(" , ");
			sb.append("Product price ");
			sb.append(" , ");
			sb.append("Item Number ");
			sb.append(" , ");
			sb.append("Model Number ");
			sb.append(" , ");
			sb.append("Product Category ");
			sb.append(" , ");
			sb.append("Product Description ");
			sb.append(" \r\n ");
			
			
			sb.append("Union & Scale™ MidMod 60\" Computer and Writing Storage Desk ");
			sb.append(" , ");
			sb.append("$219.99 ");
			sb.append(" , ");
			sb.append("24398973 ");
			sb.append(" , ");
			sb.append("UN59685-CC ");
			sb.append(" , ");
			sb.append("Computer Office Desks ");
			sb.append(" , ");
			sb.append("Harness vintage style in your office with this Union & Scale™ MidMod storage desk. ");
			sb.append(" \r\n ");
			
			sb.append("Whalen Asherton 60\" W L-Shaped Computer Desk ");
			sb.append(" , ");
			sb.append("$249.99");
			sb.append(" , ");
			sb.append("2736559");
			sb.append(" , ");
			sb.append("SPUS-ASHD");
			sb.append(" , ");
			sb.append("Computer Office Desks ");
			sb.append(" , ");
			sb.append("Improve your workspace with the sleek form and ample storage of this Whalen Asherton L desk. ");
			sb.append(" \r\n ");
			
			sb.append("Staples Kendall Park L-Desk ");
			sb.append(" , ");
			sb.append("$279.99");
			sb.append(" , ");
			sb.append("24290427");
			sb.append(" , ");
			sb.append("ST52493-CC");
			sb.append(" , ");
			sb.append("Computer Office Desks ");
			sb.append(" , ");
			sb.append("Complete your home or small office with the Kendall Park Cherry L-Shaped desk in a traditional cherry laminate finish. ");
			sb.append(" \r\n ");
			
			sb.append("Pendaflex SureHook Reinforced Hanging File Folders Extra Capacity Letter Size  Standard Green ");
			sb.append(" , ");
			sb.append("$38.99");
			sb.append(" , ");
			sb.append("901-784623");
			sb.append(" , ");
			sb.append("6152X2 ");
			sb.append(" , ");
			sb.append("Hanging File Folders ");
			sb.append(" , ");
			sb.append("Archive documents securely with these Pendaflex SureHook reinforced standard green extra-capacity 1/5-cut tab letter-size hanging folders. ");
			sb.append(" \r\n ");
			
			sb.append("Quill Brand® 100% Recycled Hanging File Folders 1/5-Cut Legal Size Green ");
			sb.append(" , ");
			sb.append("$40.99");
			sb.append(" , ");
			sb.append("901-745315");
			sb.append(" , ");
			sb.append("745315 ");
			sb.append(" , ");
			sb.append("Hanging File Folders ");
			sb.append(" , ");
			sb.append("Quill Brand Green Hanging File Folders Protect Company Files. ");
			sb.append(" \r\n ");
			
			sb.append("Hanging File Folders Standard Green Letter 5-Tab 250/Box Full Case ");
			sb.append(" , ");
			sb.append("$77.99");
			sb.append(" , ");
			sb.append("901-179494");
			sb.append(" , ");
			sb.append("57751 ");
			sb.append(" , ");
			sb.append("Hanging File Folders ");
			sb.append(" , ");
			sb.append("Create an efficient filing system with this 250-count carton of TRU RED letter-size green hanging file folders. ");
			sb.append(" \r\n ");
			
			sb.append("Dell G15");
			sb.append(" , ");
			sb.append("$859.99");
			sb.append(" , ");
			sb.append("G15RE-A975GRY-N");
			sb.append(" , ");
			sb.append("G15RE-A975GRY-N ");
			sb.append(" , ");
			sb.append("Dell Gaming Laptops in Gaming Desktops & Laptops");
			sb.append(" , ");
			sb.append("The powerful AMD Ryzen 7 processor features machine intelligence that anticipates your needs Graphics Backed by 4GB GDDR6 dedicated video memory for a fast advanced GPU to fuel your games Backlit keyboard The streamlined design embeds a fingerprint reader in the power button and a new keyboard.");
			sb.append(" \r\n ");
			
			sb.append("Dell G3");
			sb.append(" , ");
			sb.append("$1774.20");
			sb.append(" , ");
			sb.append("G3579-5965BLK-PUS");
			sb.append(" , ");
			sb.append("G3579-5965BLK-PUS");
			sb.append(" , ");
			sb.append("Dell Gaming Laptops in Gaming Desktops & Laptops");
			sb.append(" , ");
			sb.append("Go where the game takes you Powerful graphics in a thin 15\" gaming notebook Includes the NVIDIA® GeForce™ 1050 graphics card.");
			sb.append(" \r\n ");
			
			sb.append("WorkPro® Oceanic Mesh/Fabric Ergonomic High-Back Executive Chair ");
			sb.append(" , ");
			sb.append("$229.99");
			sb.append(" , ");
			sb.append("2724332");
			sb.append(" , ");
			sb.append("CHR-6411-0101");
			sb.append(" , ");
			sb.append("Ergonomic Office Chairs");
			sb.append(" , ");
			sb.append("Each Oceanic chair is manufactured using 1.45 lbs of recycled ocean plastic helping to keep oceans clean. ");
			sb.append(" \r\n ");
			     
			sb.append("WorkPro® 12000 Series Ergonomic Mesh/Fabric Mid-Back Chair ");
			sb.append(" , ");
			sb.append("$429.99");
			sb.append(" , ");
			sb.append("9702132");
			sb.append(" , ");
			sb.append("EHB-WB-LBM-F");
			sb.append(" , ");
			sb.append("Ergonomic Office Chairs");
			sb.append(" , ");
			sb.append("A swivel base and casters allow easy movement while the nylon and aluminum frame pairs strength with durability. ");
			sb.append(" \r\n ");
			
			pw.write(sb.toString());
			pw.close();
			System.out.println("finished");
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		  
	}

}
