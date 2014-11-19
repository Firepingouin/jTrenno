package com.cpe.jee.beans;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named("credentials")
public class Credentials {

   private String username;

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }
}