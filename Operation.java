package empManagement;

import java.util.Scanner;

public class Operation {

	static boolean add(MyEmp e[])
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<e.length ; i++)
		{
			e[i] = new MyEmp();
			System.out.println("Employee " + (i+1));
			System.out.print("Enter Emp Id : ");
			e[i].setId(Integer.parseInt(sc.nextLine()));
			System.out.print("Enter Emp Name : ");
			e[i].setName(sc.nextLine());
			System.out.print("Enter Profit : ");
			e[i].setJobProfile(sc.nextLine());
			System.out.print("Enter Emp Salary : ");
			e[i].setSalary(Double.parseDouble(sc.nextLine()));			
		}
		sc.close();
		return true;
	}
	
	static void display(MyEmp e[])
	{
		System.out.print("\n\t All Data \t\n");
		System.out.print("================================================================================================");
		System.out.print("\nEmp ID \t|\t Name \t|\t Salary \t|\t Profile \t|\t Loss \t\n");
		System.out.print("================================================================================================");
        for (int i = 0; i < e.length; i++)
        {
            if (e[i].id != 0)
            {
            	System.out.print("\n " + e[i].getId() + " \t|\t " + e[i].getName() + " \t|\t " + e[i].getSalary() + " \t|\t " + e[i].getJobProfile() + " \t\n");
            }
        }
	}
	static void search(MyEmp e[])
    {
		Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.print("\nEnter Emp ID : ");
        int id1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < e.length ; i++)
        {
            if (id1 == e[i].id)
            {
            	System.out.print("\nEmp ID \t|\t  Name \t\t|\t Profile \t|\t Salary \t\n");
            	System.out.print("\n " + e[i].id + " \t|\t " + e[i].name + " \t|\t " + e[i].jobProfile+ " \t|\t " + e[i].salary + " \t\n");
            }
            else
            {
                a++;
            }
        }
        if (a == e.length)
        {
            System.out.print("\n\n This ID Not Exist. Please Check!!\n");
            a = 0;
        }
        sc.close();
    }
	
	static void deleteData(MyEmp e[])
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Emp ID : ");
        int key_id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < e.length; i++)
        {
            if (key_id == e[i].id)
            {
                e[i].id = 0;
            }
            System.out.println("Delete Data");
        }
        sc.close();
    }
	
	  static void update(MyEmp e[])
	  {
		  Scanner sc = new Scanner(System.in);
	        System.out.println("\nEnter Emp Id : ");
	        int empID = Integer.parseInt(sc.nextLine());
	        for (int i = 0; i < e.length; i++)
	        {
	            if (e[i].id == empID)
	            {
	            	 System.out.print("\n  :: Function ::\n\n");
	         		System.out.println("\t1. | Name");
	         		System.out.println("\t2. | Job Profile");
	         		System.out.println("\t3. | Salary");
	         		System.out.println("\t0. | Exit ");
	         		System.out.println("-------------------------------------------------------------");
	         		System.out.print("\n Enter your choice: ");
	         		int ch = Integer.parseInt(sc.nextLine());

	                switch (ch)
	                {
	                case 1:
	                	System.out.print("\nDo you really want to Change Name ?\n");
	                	System.out.print("1. Yes\n2. No\n Choice : ");
	                    int ch1 = Integer.parseInt(sc.nextLine());
	                    switch (ch1)
	                    {
	                    case 1:
	                    	System.out.print("\nYour Old Name is " + e[i].name);
	                    	System.out.print("\nPlease Enter Correct Name ?\n");
	                        String newName = sc.nextLine();
	                    	System.out.print("\nNow, Your New Name is " + newName);

	                    	System.out.print("\nDo you really want to Update ?\n");
	                    	System.out.print("1. Yes\n2. No\n Choice : ");
	                    	int ch2 = Integer.parseInt(sc.nextLine());
	                        switch (ch2)
	                        {
	                        case 1:
	                            e[i].name = newName;
	                            System.out.print("\nData Updated Succesfully...\n");
	                            break;
	                        case 2:
	                        	System.out.print("Okay");
	                            break;
	                        default:
	                        	System.out.print("\nSorry Invalid....\n");
	                            break;
	                        }
	                        break;
	                    case 2:
	                    	System.out.print("Okay..No Problem\n");
	                        break;
	                    default:
	                    	System.out.println("Invalid");
	                        break;
	                    }
	                    break;
	                case 2:
	                	System.out.print("\nDo you really want to Change Profile ?\n");
	                	System.out.print("1. Yes\n2. No\n Choice : ");
	                    int choice = Integer.parseInt(sc.nextLine());
	                    switch (choice)
	                    {
	                    case 1:
	                    	System.out.print("\nYour Old Profile is " + e[i].jobProfile);
	                    	System.out.print("\nPlease Enter Correct Profile ?\n");
	                        String newProfile = sc.nextLine();
	                    	System.out.print("\nNow, Your New Profile is " + newProfile);

	                    	System.out.print("\nDo you really want to Update ?\n");
	                    	System.out.print("1. Yes\n2. No\n Choice : ");
	                    	int ch2 = Integer.parseInt(sc.nextLine());
	                        switch (ch2)
	                        {
	                        case 1:
	                            e[i].jobProfile = newProfile;
	                            System.out.print("\nData Updated Succesfully...\n");
	                            break;
	                        case 2:
	                        	System.out.print("Okay");
	                            break;
	                        default:
	                        	System.out.print("\nSorry Invalid....\n");
	                            break;
	                        }
	                        break;
	                    case 2:
	                    	System.out.print("Okay..No Problem\n");
	                        break;
	                    default:
	                    	System.out.println("Invalid");
	                        break;
	                    }
	                    break;
	                case 3:
	                	System.out.print("\nDo you really want to Change Salary ?\n");
	                	System.out.print("1. Yes\n2. No\n Choice : ");
	                    int ch3 = Integer.parseInt(sc.nextLine());
	                    switch (ch3)
	                    {
	                    case 1:
	                    	System.out.print("\nYour Old Salary is " + e[i].salary);
	                    	System.out.print("\nPlease Enter Correct Salary ?\n");
	                    	double newSalary = Double.parseDouble(sc.nextLine());
	                    	System.out.print("\nNow, Your New Salary is " + newSalary);

	                    	System.out.print("\nDo you really want to Update ?\n");
	                    	System.out.print("1. Yes\n2. No\n Choice : ");
	                    	int ch2 = Integer.parseInt(sc.nextLine());
	                        switch (ch2)
	                        {
	                        case 1:
	                            e[i].salary = newSalary;
	                            System.out.print("\nData Updated Succesfully...\n");
	                            break;
	                        case 2:
	                        	System.out.print("Okay");
	                            break;
	                        default:
	                        	System.out.print("\nSorry Invalid....\n");
	                            break;
	                        }
	                        break;
	                    case 2:
	                    	System.out.print("Okay..No Problem\n");
	                        break;
	                    default:
	                    	System.out.println("Invalid");
	                        break;
	                    }
	                    break;
	                case 0:
	                	System.exit(0);
	                	break;
	                }
	            }
	        }
	        sc.close();
	  }
}
