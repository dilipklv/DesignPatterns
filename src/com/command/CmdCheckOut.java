package com.command;
 /**
  * @author Dilip Vishwakarma
  *
  */
 public class CmdCheckOut implements ICommand {
      private Document m_doc;
      public CmdCheckOut(Document doc) {
           m_doc = doc;
      }
      /* (non-Javadoc)
       * @see command.ICommand#execute()
       */
      @Override
      public void execute() {
           try {
                m_doc.checkOut();
           } catch (Exception e) {                
                e.printStackTrace();
           }
      }
      /* (non-Javadoc)
       * @see command.ICommand#isEnabled()
       */
      @Override
      public boolean isEnabled() {
           return !m_doc.isAlreadyCheckedOut();          
      }
 }