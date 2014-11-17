package com.cpe.jee.beans;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class Credentials {

   private String username;
   private String password;

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }
}