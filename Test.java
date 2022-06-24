package empManagement;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		MyEmp e[];
		
		System.out.print("\n Enter Employee: ");
        int n = Integer.parseInt(sc.nextLine());
        e = new MyEmp[n];
        
        while(true) {
        System.out.print("\n  :: Function ::\n\n");
		System.out.println("\t1. | Add Data");
		System.out.println("\t2. | Display All Data");
		System.out.println("\t3. | Search By ID");
		System.out.println("\t4. | Update Data");
		System.out.println("\t5. | Delete Data");
		System.out.println("\t0. | Exit ");
		System.out.println("-------------------------------------------------------------");
		System.out.print("\n Enter your choice: ");
		int ch = Integer.parseInt(sc.nextLine());
		
		switch (ch) {
		case 1:
			if(Operation.add(e))
			{
				System.out.println("Data Successfully Inserted ! ");
			}else
			{
				System.out.println("Data Not Inserted ! ");
			}
			break;
		case 2:
			Operation.display(e);
			break;
		case 3:
			Operation.search(e);
			break;
		case 4:
			Operation.update(e);
			break;
		case 5:
			Operation.deleteData(e);			
			break;
		case 0:
			System.exit(0);
			break;
			
		}
		
		
		sc.close();
        }
	}

}
