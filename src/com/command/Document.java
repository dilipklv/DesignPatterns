package com.command;
 /**
  * @author Dilip Vishwakarma
  *
  */
 public class Document {
      //1. Unique Identity
      //2. Structure
      private String m_name;
      private String m_path;
      private static int NONE = 0;
      private static int CHECKED_OUT = 1;
      private static int CHECKED_IN = 2;
      //3. state
      private int m_status = NONE;
      public String getStatus() {
           String status = null;
           switch( m_status ) {
           case 0: status = "NONE";
                break;
           case 1: status = "CHECKED_OUT";
                break;
           case 2: status = "CHECKED_IN";
                break;                
           }
           if(status == null)
                try {
                     throw new Exception("Status cannot be null");
                } catch (Exception e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                }
           return status;
      }
      private int m_version = 0; //Document does not exists
      public Document(String name, String path) {
           m_name = name;
           m_path = path;
           m_version = 1;
      }
      public String getName() {
           return m_name;
      }
      public void setName(String name) {
           m_name = name;
      }
      public boolean checkOut() throws Exception {
           if(isAlreadyCheckedOut()) {
                throw new Exception(" Cannot Check Out as document is already checked out. ");
           }
           m_status = CHECKED_OUT;
           return true;          
      }
      public boolean checkIn() throws Exception {
           if(!isAlreadyCheckedOut()) {
                throw new Exception(" Cannot Check In as document was not checked out. ");
           }
           m_status = CHECKED_IN;
           m_version++;
           return true;
      }
      public boolean cancelCheckOut() throws Exception {
           if(!isAlreadyCheckedOut()) {
                throw new Exception(" Cannot cancel Check Out as document is not checked out. ");
           }
           m_status = CHECKED_IN;
           return true;
      }
      public boolean isAlreadyCheckedOut() {
           return m_status == CHECKED_OUT;
      }
      public boolean isAlreadyCheckedIn() {
           return m_status == CHECKED_IN;
      }
      public int getVersion() {
           return m_version;
      }
 }