package com.command;
 /**
  * @author Dilip Vishwakarma
  *
  */
 public interface ICommand {
      public void execute();
      public boolean isEnabled();
 }