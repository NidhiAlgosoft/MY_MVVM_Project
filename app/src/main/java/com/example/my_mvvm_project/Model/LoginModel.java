package com.example.my_mvvm_project.Model;

public class LoginModel {
   private final String UserName;
   private final String Mobile_No;
   private final String Email;
   private final String Password;
   private final String Confirm_password;


    public LoginModel(String userName, String mobile_no, String email, String password, String confirm_password) {
        UserName = userName;
        Mobile_No = mobile_no;
        Email = email;
        Password = password;
        Confirm_password = confirm_password;
    }


}
