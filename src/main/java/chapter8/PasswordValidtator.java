package chapter8;

import java.util.Scanner;

public class PasswordValidtator {
    private String currentPassword;
    private String username;
    private boolean valid;
    private String errorMessage;
    private static Scanner sc = new Scanner(System.in);

    public PasswordValidtator(String username, String currentPassword){
        this.username = username;
        this.currentPassword = currentPassword;
    }
    public boolean isValid(){
        return valid;
    }
    public String getErrorMessage(){
        return errorMessage;
    }

    public void closeScanner(){
        sc.close();
    }

    public static PasswordValidtator login(){
        System.out.println("Enter Username: ");
        String username = sc.nextLine();
        System.out.println("Enter your password: ");
        String password = sc.nextLine();

        return new PasswordValidtator(username, password);
    }

    public void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }

    public String getProposedPassword(){
        System.out.println("Enter new Password: ");
        return sc.nextLine();
    }

    public void changePassword(String newPassword){
        valid = true;
        errorMessage = "";
        if(newPassword.length() < 8){
            valid = false;
            errorMessage += "\n Your Password must be atleast 8 characters.";
        }
        if(newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage += "\n Your password must include a uppercase";
        }
        if(newPassword.matches("[a-zA-Z0-9 ]*")){
            valid = false;
            errorMessage += "\n Your password must include a special character (e.g. %,$[:).";
        }
        if(newPassword.toUpperCase().contains(username.toUpperCase())){
            valid = false;
            errorMessage += "\n Your password cannot contain your username.";
        }
        if(newPassword.equals(currentPassword)){
            valid = false;
            errorMessage += "\n Your password must be different from your current password.";
        }
    }

    public static void main(String[] args) {
        var validator = login();
        validator.printPasswordRules();

        do{
            var proposedPassword = validator.getProposedPassword();
            validator.changePassword(proposedPassword);

            if (!validator.isValid()){
                System.out.println(validator.getErrorMessage());
            }
        }
        while (!validator.isValid());
        System.out.println("The proposed password is valid");
        validator.closeScanner();
    }
}
