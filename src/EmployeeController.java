import javax.naming.Name;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeController {
    private ArrayList<whiteCollor> list = new ArrayList<whiteCollor>();


    public void employeeController() {
        this.list = new ArrayList<whiteCollor>();
    }

    public void addWhiteCollor(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Anställningsnr :");
        int id=0;
        int i = 0;
            do {
                try {
                    id = scan.nextInt();
                    i++;
                } catch (InputMismatchException e) {
                    System.out.println("Du har inte skrivit in ett nr, starta om");
                    return;
                }
            }while (i<1);
        System.out.println("Skriv in namn: ");
        String Namn = scan.next();
        System.out.println("vad ska " + Namn + " ha i lön?");
        int salary = scan.nextInt();
        System.out.println(Namn +"s personnr");
        String personalnr = scan.next();
        boolean collectum = true;
        boolean car = true;
        whiteCollor employee = new whiteCollor(id,Namn,salary,personalnr,collectum,car);
        list.add(employee);
    }

    public void addblueCollor(){
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        String Namn = scan.nextLine();
        int salary = scan.nextInt();
        int personalnr = scan.nextInt();
        boolean fora = true;


    }

    public void editEmployee() {
        System.out.println("Vem vill du uppdatera?");
        Scanner scan = new Scanner(System.in);
        String quaryName = scan.nextLine();

        for(int i = 0; i<list.size();i++){
            String name = list.get(i).getName();

            if (quaryName.equals(name)){
                System.out.println("Hittade " + name + ", Vad vill du uppdatera?");
                System.out.println("1. Namn");
                System.out.println("2. Anställningsnr");
                System.out.println("3. lön");
                System.out.println("4. Personnr");
                System.out.println("5. Tillbaka");

                int choice = scan.nextInt();

                switch (choice){

                    case 1:
                        System.out.println("Vilket namn vill du uppdatera till?");
                        String newName = scan.next();
                        int n = ittarateName(newName);
                        if (n == -1) {
                            list.get(i).setName(newName);
                            System.out.println("Namnet har uppdaterats till: " + newName);
                        }
                        else {
                            System.out.println("Namnet finns redan i systemet");
                        }
                        break;
                    case 2:
                        System.out.println("Vilket Id vill du uppdatera till?");
                        int newId = scan.nextInt();
                        int m = ittarateId(newId);
                        if (m == -1) {
                            list.get(i).setId(newId);
                            System.out.println("Id har uppdaterats till: " + newId);
                        }
                        else {
                            System.out.println("Idt finns redan i systemet");
                        }
                        break;

                    case 3:
                        System.out.println("Vilken lön vill du uppdatera till?");
                        int newSalary = scan.nextInt();
                        this.list.get(i).setSalary(newSalary);
                        System.out.println("Lönen har uppdaterats till: " + newSalary + "kr");
                        break;
                    case 4:
                        System.out.println("Vilket personnr vill du uppdatera till?");
                        String newPersonnr = scan.next();
                        int p = ittaratePrsnr(newPersonnr);
                        if (p == -1) {
                            list.get(i).setPersonalnr(newPersonnr);
                            System.out.println("Personnummret har uppdaterats till: " + newPersonnr);
                        }
                        else {
                            System.out.println("Personnummret finns redan i systemet");
                        }
                        break;

                    case 5:
                        break;
                    default:


                }


            }
            else{

                System.out.println("personen fanns inte i systemet");
            }


        }


    }
    public void removeEmployee(){
        showAllEmployee();
        System.out.println("Skriv in ID på personen du vill ta bort");
        Scanner scan = new Scanner(System.in);
        int Id = scan.nextInt();

         int i = ittarateId(Id);

         if (i!=-1) {
             list.remove(i);
         }
         else  {
             System.out.println("Id dose not exist");
         }

    }
    public void showAllEmployee(){

        System.out.println("Alla anställda: ");
        System.out.format("%-5s%-15s%-15s%-15s%-15s%-15s\n", "ID","Namn","Personnr","Lön","Kollektivavtal","Företagsbil");
        for(int i=0; i<this.list.size();i++){

            System.out.format("%-5s%-15s%-15s%-15s%-15s%-15s\n", list.get(i).getId(),list.get(i).getName(),list.get(i).getPersonalnr(),list.get(i).getSalary() + "kr",list.get(i).getCollectum(),list.get(i).getCompanyCar());


        }

    }

    public int ittarateName(String name) {
        for (int i=0;i<this.list.size();i++){

            if (this.list.get(i).getName().equals(name)){
                return i;
            }

        }
        return -1;
    }

    public int ittarateId(int Id) {
        for (int i=0;i<this.list.size();i++){

            if (Id==this.list.get(i).getId()){
                return i;
            }

        }
        return -1;
    }

    public int ittaratePrsnr(String prsnr) {
        for (int i=0;i<this.list.size();i++){

            if (this.list.get(i).getPersonalnr().equals(prsnr)){
                return i;
            }

        }
        return -1;
    }




}
