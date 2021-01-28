package dany.Main;
import java.sql.SQLException;
import java.util.Scanner;

import dany.Bean.DanyBean;
import dany.insert.marketoperations;

public class MarketMain {
	public static void main(String[] args )throws ClassNotFoundException,SQLException{
		 DanyBean sb=new DanyBean();
		 Scanner scan = new Scanner(System.in);
		 while(true) {
		 System.out.print("Interactive database:\n 1.Insert a item\n 2.Display all items\n 3.Display total cost");
		 System.out.print("\nselect any option: ");
		 int num = scan.nextInt();
		switch (num) {
		  case 1:
			  System.out.print("enter item_id: ");
			  int iditem= scan.nextInt();
			  System.out.print("enter item_name: ");
			  String nameitem= scan.next();
			  System.out.print("enter item_cost:");
			  float cost= scan.nextFloat();
			  sb.setIitemid(iditem);
				sb.setItemname(nameitem);
				sb.setCost(cost);
				
				marketoperations si= new marketoperations();
				int i= si.marketInsert(sb);
				if(i>0) {
					System.out.println("insertion successful");
					System.out.println("-----------------------------------------------");
					break;
				}
				else {
					System.out.println("fail");
					System.out.println("-----------------------------------------------");
					break;
				}
		  case 2:
			 
		   
			  marketoperations sdi= new marketoperations();
			int l= sdi.marketDisplay();
			if(l>0) {
				System.out.println("display successful");
				System.out.println("-----------------------------------------------");
				break;
			}
			else {
				System.out.println("fail");
				System.out.println("-----------------------------------------------");
				break;
			}
			
		  case 3:
		 
				 
			   
			  marketoperations sdj= new marketoperations();
			int m= sdj.marketcostDisplay();
			if(m>0) {
				System.out.println("total cost display successful");
				System.out.println("-----------------------------------------------");
				break;
			}
			else {
				System.out.println("fail to display");
				System.out.println("-----------------------------------------------");
				break;
			}
		  
		}
		 }
	}

}
