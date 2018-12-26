package com.command;
 import utils.MyLogger;
 /**
  * @author Dilip Vishwakarma
  *
  */
 public class CommandPatternDemo {
      /**
       * @param args
       */
      public static void main(String[] args) {
           Document doc1 = new Document("doc1", "/path/doc1");
                try {
                     for(int i = 0; i < 100 ; i++ ) {
                     MyLogger.logItLn("Document " + doc1.getName() + " version " + doc1.getVersion() + " status " + doc1.getStatus());      
                     MyLogger.logItLn("Checking out document ");
                     doc1.checkOut();  
                     
                     MyLogger.logItLn("Document " + doc1.getName() + " version " + doc1.getVersion() + " status " + doc1.getStatus());
                     MyLogger.logItLn("Check in out document ");
                     doc1.checkIn();                                        
                     }
                } catch (Exception e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                }          
           }
      }