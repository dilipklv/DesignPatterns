package com.command;
 /**
  * @author Dilip Vishwakarma
  *
  */
 public class CmdCancelCheckOut implements ICommand {
      private Document m_doc;
      public CmdCancelCheckOut(Document doc) {
           m_doc = doc;
      }
      /* (non-Javadoc)
       * @see command.ICommand#execute()
       */
      @Override
      public void execute() {
           try {
                m_doc.cancelCheckOut();
           } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
           }
      }
      /* (non-Javadoc)
       * @see command.ICommand#isEnabled()
       */
      @Override
      public boolean isEnabled() {          
           return m_doc.isAlreadyCheckedOut();
      }
 }