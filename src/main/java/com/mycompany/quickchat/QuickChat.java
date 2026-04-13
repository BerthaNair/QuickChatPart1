/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quickchat;
import java.util.Scanner;
/**
 *
 * @author Student
 */
class Login {
    String Storeusername;
    String Storepassword;
    String StorecellphoneNumber;
    String RegisterOutput;
    
     boolean checkUsername(String username) {
        if (username.length() ==5 && username.contains("_")){
            System.out.println("Username successfully captured");
            return true;
        }else{
            System.out.println("username is not correctly formatted;please ensure that your username contains an underscore and is no more than five characters in lenght");
            return false;
        }
    }
      boolean checkPassword(String passwordComplexity) {
        if (password.length()>= 8 && passwordComplexity.chars().anyMatch(c -> Character.isUpperCase(c)) && passwordComplexity.matches(".*\\d+.*")&& passwordComplexity.matches(".*[^A-Za-z0-9].*")){
            System.out.println("password successfully captured");
            return true;
        }else{
            System.out.println("password is not correctly formatted; please ensure that the password contains at least eight characters, a capital leter letter, a number, and a special character");
            return false;
        }            
}
       boolean checkCellphoneNumber(String cellphoneNumber){
      if (cellphoneNumber.contains ("+27")&& cellphoneNumber.matches(".*\\d.*")&& cellphoneNumber.length()==12){
          System.out.println("cell phone number successfully added");
          return true;
      }else{
          System.out.println("cell phone number incorrectly formatted or does not contain international code");
          return false;
      }
  }
   String registerUser(){
      
      Scanner input =new Scanner(System.in);
      
      System.out.println("===Register===");
      System.out.println("Enter Name and Surname");
      String name=input.nextLine();
      System.out.println("Enter your username");
      String username=input.nextLine();
      System.out.println("Enter your password");
      String password=input.nextLine();
      System.out.println("Enter cellphone number");
      String cellphoneNumber= input.nextLine();
       Storeusername=username;
      Storepassword=password;
      StorecellphoneNumber=cellphoneNumber;     

     if (checkUsername(username)&& checkPassword(password)&&checkCellphoneNumber(cellphoneNumber)){
          RegisterOutput = "Registration success";
          //System.out.println("Registration success");
      }else{
          RegisterOutput = "Registration failed, try again";
          //System.out.println("Registration failed, try again");
      }   
      
      return RegisterOutput;
      
      
  }
   boolean loginUser(){    
      Scanner input= new Scanner(System.in);
      System.out.println("==Login==");
      System.out.println("Enter your username");
      String username=input .nextLine();
      System.out.println("Enter your password");
      String password=input.nextLine();
      
      if (username.equals(Storeusername)&& password.equals(Storepassword)){
          System.out.println("Welcome"+ Storeusername+"Its great to see you again" );
      }else{
          System.out.println("Username or password incorrect, please try again");
      }
      return false;
  } 
          
  

}
 



public class QuickChat {

    public static void main(String[] args) {
          Scanner enterMenu=new Scanner(System.in);
        Login QuickChat=new Login();
        int userChoice;
        //String Reg;
        do{
            System.out.println("\n====Menu====");
            System.out.println("1:Register");
            System.out.println("2:Login");
            System.out.println("3:exit");
            System.out.println("Enter menu option");
            userChoice=enterMenu.nextInt();
            switch(userChoice){
                case 1:
                    QuickChat.registerUser();
                    //Registeroutput = 
                     System.out.println(QuickChat.RegisterOutput);
                    break;
                case 2:
                    QuickChat.loginUser();
                    break;
                case 3:
                    System.out.println("GOODBYE");
                    break;
                default:System.out.println("Invalid choice");
            }}while(userChoice!=3);
               enterMenu.close();
                
                
            }
            
            
       
    }

