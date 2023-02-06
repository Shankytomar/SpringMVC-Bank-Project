# SpringMVC-Bank-Project

Frameworks : Spring MVC and  Hibernate
             
Database :   MySql

## This project including features like:

### 1.Opening account/Account creation
   Here user can open/create its account with his name, PAN number and adhaar number, address etc which got stored in database table.[userdata]
   On the basis of adhaar and pan number of a user a unique account number and password got generated which is required for using further features like deposite or withdrawal.
   With generated account number and password, and other deatils like name etc a User object is created which is mapped with table 'userdata'.

### 2.Deposit
  In deposit, first user needs to verify himself then he/she land on deposit page where deposit can be done. And a Transaction object got generated which already mapped with table 'transaction' where Transaction got stored.
  
### 3.Withdrawal
  Likewise deposit feature withdrawal works.
  
### 4.Change PIN
  Change pin feature allow user to change his/her password which are stored in database table 'userdata' 

### 5.Login/verification
  Except account creation, all transaction should go first via this login/verification page where credentials like accunt number and passwords gonna verifies, then user land on appropiate page. 
  
### 6.Balance Inquiry
  
  ## Screenshots of project [view pages]
  [![Home screen](https://github.com/Shankytomar/SpringMVC-Bank-Project/tree/master/Screenshots/homepage.jpg)]
  [![Account Creation](https://github.com/Shankytomar/SpringMVC-Bank-Project/tree/master/Screenshots/openaccount.jpg)]
  [![Login/Verification](https://github.com/Shankytomar/SpringMVC-Bank-Project/tree/master/Screenshots/loginIn.jgp.jpg)]
  [![Depsite page](https://github.com/Shankytomar/SpringMVC-Bank-Project/tree/master/Screenshots/deposite.jpg)]
  [![Withdrawal page](https://github.com/Shankytomar/SpringMVC-Bank-Project/tree/master/Screenshots/withdrawal.jpg)]
  [![Change PIN](https://github.com/Shankytomar/SpringMVC-Bank-Project/tree/master/Screenshots/changepin.jpg)]
  [![Balance Inquiry](https://github.com/Shankytomar/SpringMVC-Bank-Project/tree/master/Screenshots/balance.jpg)]
  ### Database Tables
  [![User table](https://github.com/Shankytomar/SpringMVC-Bank-Project/tree/master/Screenshots/userdata.jpg)]
  [![Transaction table](https://github.com/Shankytomar/SpringMVC-Bank-Project/tree/master/Screenshots/transaction.jpg)]
  
  
