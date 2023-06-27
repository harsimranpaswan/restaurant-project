
# Introduction

This software project is developed to automate the functionalities of the Restaurant. The purpose of the software project is to develop the Management Information System (MIS) to automate the record keeping of employs, customers, salaries and bookings and receive the decision making of functionaries.

A MIS mainly consists of a computerized database, a collection of interrelated tables for particular subject or purpose , capable to produce different reports relevant to the user. An application program is tied with the database for easy access and interface to the database. Using Application program or front- end , we can store, retrieve and manage all information in proper way.

This software, being simple in design and working, does not require much of training to users, and can be used as powerful tool for automating a Restaurant .

During coding and design of the software project, Java NetBeans IDE, a powerful front end tool is used for getting Graphical User Interface(GUI) based integrated platform and coding simplicity .

As backend is a powerful, open source RDBMS, My SQL is used as per requirement of the CBSE curriculum of Informatics Practices Course.

# Objective and Scope of the Project

The objective of the software project is to develop a computerized MIS to automate the functions of a Restaurant. This software is also aimed to enhance the current record keeping system, which will help managers to retrieve the up-to-date information at right time in right shape.

The proposed software system is expected to do the following functionalities-

- To provide a user friendly, Graphical User Interface(GUI) based integrated and centralized environment for MIS activities.
- The proposed system should maintain all the records and transactions, and should generate the required reports and information when required .
- To provide graphical and user friendly interface to interact with centralized database based on client server architecture.
- To identify the critical operation procedure and possibilities of simplifications using modern IT tools and practices.

In its current scope, the software enables user to retrieve and update the information from centralized database designed with MySQL. This software does not require much training time of users due to limited functionality and simplicity. During the development of restaurant information system project, Java NetBeans IDE, a powerful, open source event-driver form based development environment is used for modular design and future expandibility of the system.

# Theoretical Background

## **1.Database**

**Introduction and Concept**** :**

A database is a collection of information related to a particular subject or purpose, such as tracking customer orders or maintaining a music collection. Using any RDBMS application software like MySQL server, my SQL oracle, Sybase etc. you can manage all your information from a single database file. Within the file, divide your data into separate storage containers called tables. You may and retrieve the data using queries.

A table is a collection of data about a specific topic such as products and suppliers. Using a separate table for each topic means you can store that data only once. Which makes your database more efficient and reduces data entry errors. Table organizes data into column ( called fields) and rows ( called records).

A primary key is one or more fields whose value or values uniquely identifies each record in a table. In a relationship, a primary key is used to refer to a specific record in one table from another table. A primary key is called foreign key when it is refer to from another table.

To find and retrieve just the data that meets conditions you specify, including data from multiple tables, create a query. A query can also update or delete multiple records at the same time, and perform built in or custom calculations on your data.

**Role of RDBMS application program:**

A computer database works as an electronic filing system which has a large number of ways of cross referencing and this allows the user, many different ways in which they reorganize and retrieve data. Any database can handle business inventory accounting and filing and use the information in its files to prepare summaries to estimate the other reports. The management of data in the database system is done by means of general purpose software package called database management system. Some commercially available DBMS are My SQL server, MS Access , Ingries, Oracle and Sybase.A database management system therefore is a combination of hardware and software that can be used to setup and monitor a database and can manage the updating and retrieval of database that has been stored in it. Most of the database management systems have the following

 of a table addition addition deletion modification of records

- Capability of retreating that are collectively and selectively  and direction
- Various reports can be produced from the system .This may be either standardized report or that may be specifically generated according to specific user definition
- Mathematical functions can be performed and the data stored in the database can be manipulated with these functions to perform the desired calculations.
- To maintain Data integrity and database use.

The DBMS integrates and processes users request to retrieve information from database. In most cases, a query request will have to penetrate several layers of software in DBMS and operating system before the physical database can be accessed. The database response to a query by invoking the appropriate subprograms each of which performs its special function to interpret the query, or to locate the desired data in the database and present it in the desired order.

![Shape1](RackMultipart20230627-1-k9rnkx_html_35e7e6efe79c6172.gif)

**Basic Database Transaction**

![Shape2](RackMultipart20230627-1-k9rnkx_html_221204490000ab42.gif) ![Shape3](RackMultipart20230627-1-k9rnkx_html_9204388ee386e3f6.gif)

**FRONT**

**END**

**BACK**

**END**

![Shape4](RackMultipart20230627-1-k9rnkx_html_9f94c545a6305b51.gif)

## **2.MySQL**

The management of data in a database system is done by means of general purpose software package called a database management system( DBMS) . Some commercially available RDBMS are MS SQL server MS Access , Ingries, Oracle and Sybase. My SQL, the most popular open source SQL database management system is developed, distributed, and supported by Oracle Corporation. My SQL is named after a co-founder Monty Widenius's daughter My.The name of MySQL Dolphin( our Logo) is "Shakila" .

**2.1.My SQL is a database management system .**

A database is a structured collection of data_._ It may be anything from a simple shopping list to a picture gallery of the vast amount of information in a corporate network. To add,access and process data stored in a computer database, you need a database management system such as my SQL server. Since computers are very good at handling large amounts of data, database management systems play a central role in computing, as stand alone utilities, or as parts of other applications.

**2.2.MySQL is based on SQL**.

 A relational database stores data in a separate tables rather than putting all the data in one big store room. This adds speed and flexibility . The SQL part of "My SQL" stands for "Structured Query Language". SQL is the most common standardized language used to access databases and is defined by ANSI / ISO SQLStandard.The SQL standard has been evolving since since 1986 and several versions exists .In this manual " SQL 92" refers to the standard released in 1992 , "SQL 1999" refers to the standard released in 1999 and " SQL 2003"refers to the current version of standard.

**2.3.My SQL software is open source**.

 Open source means that it is possible for anyone to use and modify the software. Anybody can download the MySQL software from the internet and use it without paying anything. If you wish, you may study the source code and change it to suit your needs. The MySQL software uses the GPU(GNU General Public Licence).

**2.4.MySQL database Server is very fast, reliable and easy to use**.

 If that is what you are looking for ,you should give it give it a try. MySQL server has also a particular set of features developed in close cooperation with our users. You can find a performance comparison of MySQL server with other database managers on our benchmark page . MySQL server was originally developed to handle large databases much faster than existing solutions and has been successfully used in highly demanding production environments for several years all the under cost and development, MySQL server today offers a rich and useful set of functions .It's connectivity commerce speed, and security make MySQL server highly suited for accessing databases on the internet.

**2.5.MySQL works in client /server or embedded systems**.

 The MySQL database software is a client server system that consists of a multithreaded SQL server that supports different backends,several different client programs and Libraries, administrative tools and wide range of application programming interfaces(APIs).

**Main features of MySQL**

- Written in C and C++.
-  Works on many different platforms.
-  Uses multilayered server design with independent module.
- Provides transactional and non transactional storage engines.
-  Designs to make it relatively easy to add other storage engines. This is useful if you want to provide SQL an interface for an in- house database.
-  Uses a very fast thread based memory allocation system.
-  Executes very fast, joins using an optimised nested loop join.
- Implement SQL functions using a highly optimised class library that should be as fast as possible. Usually there is no memory allocation at all after query in initialization.
- Provides the server as a separate program for use in a client server network environment and as a library that can be embedded link into standalone applications. Such applications can be used in isolation or in environment where no network is available.
-  Password security by encryption of all password traffic when you connect to a server.
-  Support for large databases. We use my SQL server with databases that contains 50 million records. We also know users who use my SQL server with 200000 tables and about 5 million rows.
-  MySQL client program can be written in many languages. A client library written in C is available for lines written in C++ or any language that provides C binding.
- API for C, C ++, Eiffel, Java , Perl, PHP, Python, Ruby,and TCL are available enabling my SQL clients to be written in many languages.
- The connector/ ODBC (MyODBC) interface provides MySQL support for client programs that use ODBCopen database connectivity connections.
- The connector /J interface provides MySQL support for Java client programs that use JDBC connections. Clients can be run on Windows or Unix. Connector /J source source is available.

## **3.NetBeans IDE**

NetBeans started as a student project (originally called XelFi ) in Czech Republic in 1996. The goal was to write a Xelfi like Java IDE in Java. Xelfi was the first Java ID integrated development environment written in Java ,with its first pre releases in 1997. Xelfi was a fun project to work on, especially since it is space was uncharted territory at that time. The project attracted enough interest that the students, once the graduated decided that they could market it as commercial product .Soliciting resources from friends and relatives for a web space, they formed a company around it .

Soon after ,they were contracted by Roman Stanek, an entrepreneur who had already been involved in several startups in Czech Republic. He was looking for a good idea to invest in and discovered Xelfi. He met with his founders, they hit it off, anda business was born.

 In the spring of 1999, NetBeans DeveloperX2 was released Supporting Swing. The performance improvements that came JDK 1.3 released in the fall of 1999, made NetBeans a viable choice for development tools. By the summer of 1999 ,the team was hard at work re-architecting Developer X2 into the more modular NetBeans that form the basis of software today.

 Something else was afoot in summer of 1999 .Sun Microsystems wanted better Java development tools, and had become interested in NetBeans. It was a dream come true for the NetBeans team. NetBeans would become the flagship tool set of the maker of Java itself! By the Fall , with the next generation of NetBeans developer in beta, a deal was struck. Sun microsystems had also acquired another tools Company.During the acquisition the youngdevelopers who had been involved in open source projects for most of the programming careers, mentioned the idea of open source in NetBeans. Fast forward to less than 6 months later the decision was made that NetBeans would be open source. While Sun had contributed condition considerable amount of code to open source projects over the years, this was Sun's first sponsored open source project ,one in which Sun would be paying for the site and handling the infrastructure.

**Features of NetBeans**

 A free,open source integrated development environment for software developers . You get all the tools you need to create professional desktop enterprise web and mobile applications with the Java Platform as well as C, C + +, JavaScript and Ruby.NetBeans IDE 6.9 introduces the JavaFX Composer,support for JavaFX SDK1.3,OSGI interoperatibility,support for PHP Zhend framework and Ruby on Rails 3.0,and more.

# System Implementation

## **The Hardware used**

## _ **:** _

While developing the system, the used hardware are:

ACER ASPIRE 5 with Intel i5 8th gen processor, having 4 GB

RAM and 2GB Nvidia GeForce MX150 graphics Processor

## **The software used:**

• Microsoft Windows 10 PRO as Operating system.

• Java NetBeans 8.2 as front–end Development environment

• MySQL as back–end Server with Database for testing.

• Microsoft Office 2016 for documentation.

# **User Manual**

## **1.How to install software:**

**Minimum PC requirement-**

• Intel Pentium/Celeron or similar processor based PC or higher

• 128 MB RAM and 4GB HDD space

• Standard I/O devices like keyboard and mouse etc.

• Printer is needed for hard copy records.

• Windows 2000/XP OS or Newer

• NetBeans version 5.1 or higher should be installed with JDK

• MySQL version 6.1 with library Dtabase must be present at machine.

**Database Installation**

The software project is distributed with a backup copy of adatabase named Restaurant with required tables. Some dummy records are present in the tables for testing purposes, which can be deleted before inserting real data.The project is shipped with RES.SQL file which installs a database and tables in computer system.

**Note:** The PC must have MySQL server with user (root) and password(3767).If root passwords is any other password , it can be changed by running MySQL Server Instance Configure Wizard.

Start Program MySQL MySQL Server My SQL Server instance config wizard

Provide current password of root and new password as "XYZ", this will change the root passworg\d.

**Working with Software Project:**

The Restaurant Management Program consists of the following logically organized Menu-structure for the easy functionality. User choose the Menu options for corresponding works.

![](RackMultipart20230627-1-k9rnkx_html_32bde813e88bfc58.jpg)

**Items management:**

This menu item gives options to insert, update and access the items.

**Employees management** :

This menu gives options to insert, delete ,modify, and delete the employee's record.Also the salaries of the employees are managed by this menu.

**Bill calculator :**

This menu calculate the total amount to be paid by the customer.It may or may not include extra charges as per the requirements.

**Table booking /cancellation:**

This menu keeps the record of booked tables divided into different sections as per the choice of the customer.

# I/O Forms Design

![](RackMultipart20230627-1-k9rnkx_html_68879384ff4a212a.jpg)
## Login Window

Coding

**private void loginActionPerformed(java.awt.event.ActionEvent evt) {**

String user=username.getText();

String pass=new String(password.getPassword());

Main\_Window m= new Main\_Window();

if (user.equals("niharika")) {

if(pass.equals("password")) {

this.setVisible(false);

m.setVisible(true);

}

else JOptionPane.showMessageDialog(null,"Incorrect Password");

}

else JOptionPane.showMessageDialog(null,"Incorrect ID");

}

## Main Window

![](RackMultipart20230627-1-k9rnkx_html_32bde813e88bfc58.jpg)

Coding

**private void employeeActionPerformed(java.awt.event.ActionEvent evt) {**

this.setVisible(false);

Employee\_Window e=new Employee\_Window();

e.setVisible(true);

}

**private void itemActionPerformed(java.awt.event.ActionEvent evt) {**

this.setVisible(false);

Item\_Window i=new Item\_Window();

i.setVisible(true);

}

**private void billActionPerformed(java.awt.event.ActionEvent evt) {**

this.setVisible(false);

Bill\_Window b=new Bill\_Window();

b.setVisible(true);

}

**private void bookingActionPerformed(java.awt.event.ActionEvent evt)** {

this.setVisible(false);

Booking\_Window b=new Booking\_Window();

b.setVisible(true); }

## Items Management

![](RackMultipart20230627-1-k9rnkx_html_687c01f4b1202b2c.jpg)

Coding

**private void retrieveActionPerformed(java.awt.event.ActionEvent evt) {**

DefaultTableModel model=(DefaultTableModel) item.getModel();

int rows=model.getRowCount();

if(rows\>0)

for(int i=0;i\<rows;i++)

model.removeRow(0);

try{

Class.forName("java.sql.Driver");

con=DriverManager.getConnection

("jdbc:mysql://localhost/resturant","root","3767");

stmt=con.createStatement();

String query="SELECT\*FROM ITEM;";

rs=stmt.executeQuery(query);

while(rs.next()) {

String n=rs.getString("no");

String i=rs.getString("item");

String c=rs.getString("category");

String p=rs.getString("price");

model.addRow(new Object[] {n,i,c,p});

}

}

catch(Exception e){

JOptionPane.showMessageDialog(null,"Can't connect to the Database");

}

}

**private void addActionPerformed(java.awt.event.ActionEvent evt) {**

try{

stmt=con.createStatement();

String n=no\_a.getText();

String i=item\_a.getText();

String c=(String)cate\_a.getSelectedItem();

String p=price\_a.getText();

String query="INSERT INTO ITEM VALUES('"+n+"','"+i+"','"+c+"','"+p+"');";

stmt.executeUpdate(query);

JOptionPane.showMessageDialog(null,"Item Added Successfully");

}

catch(Exception e) {

JOptionPane.showMessageDialog(null,"Please check if all fields are

correct");

}

![](RackMultipart20230627-1-k9rnkx_html_b13cc879c2b5276b.jpg)}

![](RackMultipart20230627-1-k9rnkx_html_d2900afed882b462.jpg)

**private void removeActionPerformed(java.awt.event.ActionEvent evt) {**

try{

stmt=con.createStatement();

String n=no\_r.getText();

String query="DELETE FROM ITEM WHERE NO="+n+";";

stmt.executeUpdate(query);

JOptionPane.showMessageDialog(null,"Item Removed Successfully");

}

catch(Exception e) {

JOptionPane.showMessageDialog(null,"Invalid item no.");

} }

**private void updateActionPerformed(java.awt.event.ActionEvent evt) {**

try{

stmt=con.createStatement();

String u=no\_.getText();

String n=no\_u.getText();

String i=item\_u.getText();

String c=(String)cate\_u.getSelectedItem();

String p=price\_u.getText();

String query="UPDATE ITEM SET NO='"+n+"',ITEM='"+i+"',CATEGORY='"+c+"',

PRICE='"+p+"'"+" WHERE NO='"+u+"';";

stmt.executeUpdate(query);

JOptionPane.showMessageDialog(null,"Item Updated Successfully");

}

catch(Exception e) {

JOptionPane.showMessageDialog(null,"Please check if all fields are

correct");

} }

**private void backActionPerformed(java.awt.event.ActionEvent evt)** {

this.setVisible(false);

Main\_Window m=new Main\_Window();

m.setVisible(true); }

**private void log\_outActionPerformed(java.awt.event.ActionEvent evt)** {

this.setVisible(false);

Login\_Window l=new Login\_Window();

l.setVisible(true); }

**private void exitActionPerformed(java.awt.event.ActionEvent evt) {**

System.exit(0); }

## Employees Management

![](RackMultipart20230627-1-k9rnkx_html_af95f8fca4422e0c.jpg)

Coding

**private void retrieveActionPerformed(java.awt.event.ActionEvent evt) {**

DefaultTableModel model=(DefaultTableModel) employee.getModel();

int rows=model.getRowCount();

if(rows\>0)

for(int i=0;i\<rows;i++)

model.removeRow(0);

try{

Class.forName("java.sql.Driver");

con=DriverManager.getConnection

("jdbc:mysql://localhost/resturant","root","3767");

stmt=con.createStatement();

String query="SELECT\*FROM EMPLOYEE;";

rs=stmt.executeQuery(query);

while(rs.next()) {

String i=rs.getString("id");

String n=rs.getString("name");

String d=rs.getString("designation");

String h=rs.getString("hire\_date");

String s=rs.getString("salary");

model.addRow(new Object[] {i,n,d,h,s});

} }

catch(Exception e){

JOptionPane.showMessageDialog(null,"Can't connect to the Database");

} }

**private void addActionPerformed(java.awt.event.ActionEvent evt) {**

try{

stmt=con.createStatement();

String i=id\_a.getText();

String n=name\_a.getText();

String d=(String)desig\_a.getSelectedItem();

String da=(String)date.getValue();

String mo=(String)month.getValue();

int ye=(Integer)year.getValue();

String h=""+ye+"-"+mo+"-"+da;

String s=salary\_a.getText();

String query="INSERT INTO EMPLOYEE VALUES

('"+i+"','"+n+"','"+d+"','"+h+"','"+s+"');";

stmt.executeUpdate(query);

JOptionPane.showMessageDialog(null,"Emplyee Added Successfully");

}

catch(Exception e) {

JOptionPane.showMessageDialog(null,"Please check if all fields are

correct"); } }

![](RackMultipart20230627-1-k9rnkx_html_c012a54ce6c652e.jpg) ![](RackMultipart20230627-1-k9rnkx_html_acf9122af19a8630.jpg)

**private void removeActionPerformed(java.awt.event.ActionEvent evt) {**

try{

stmt=con.createStatement();

String i=id\_r.getText();

String query="DELETE FROM EMPLOYEE WHERE ID="+i+";";

stmt.executeUpdate(query);

JOptionPane.showMessageDialog(null,"Employee Removed Successfully");

}

catch(Exception e) {

JOptionPane.showMessageDialog(null,"Invalid employee ID"); } }

**private void updateActionPerformed(java.awt.event.ActionEvent evt) {**

try{

stmt=con.createStatement();

String u=id\_.getText();

String i=id\_u.getText();

String n=name\_u.getText();

String d=(String)desig\_u.getSelectedItem();

String da=(String)date\_u.getValue();

String mo=(String)month\_u.getValue();

int ye=(Integer)year\_u.getValue();

String h=ye+"-"+mo+"-"+da;

String s=salary\_u.getText();

String query="UPDATE EMPLOYEE SET ID='"+i+"',NAME='"+n+"',DESIGNATION=

'"+d+"',HIRE\_DATE='"+h+"',SALARY='"+s+"'"+" WHERE ID='"+u+"';";

stmt.executeUpdate(query);

JOptionPane.showMessageDialog(null,"Employee Updated Successfully"); }

catch(Exception e) {

JOptionPane.showMessageDialog(null,"Please check if all fields are correct"); } }

**private void backActionPerformed(java.awt.event.ActionEvent evt) {**

this.setVisible(false);

Main\_Window m=new Main\_Window();

m.setVisible(true); }

**private void log\_outActionPerformed(java.awt.event.ActionEvent evt)** {

this.setVisible(false);

Login\_Window l=new Login\_Window();

l.setVisible(true); }

**private void exitActionPerformed(java.awt.event.ActionEvent evt) {**

System.exit(0); }

![](RackMultipart20230627-1-k9rnkx_html_d56be071844223ca.jpg)
## Calculate Bill

Coding

**private void retrieveActionPerformed(java.awt.event.ActionEvent evt) {** DefaultTableModel model=(DefaultTableModel) item.getModel();

int rows=model.getRowCount();

if(rows\>0)

for(int i=0;i\<rows;i++)

model.removeRow(0);

try{

Class.forName("java.sql.Driver");

con=DriverManager.getConnection

("jdbc:mysql://localhost/resturant","root","3767");

stmt=con.createStatement();

String categ=(String)cate.getSelectedItem();

String query="SELECT\*FROM ITEM WHERE CATEGORY='"+categ+"';";

rs=stmt.executeQuery(query);

while(rs.next()) {

String n=rs.getString("no");

String i=rs.getString("item");

String c=rs.getString("category");

String p=rs.getString("price");

model.addRow(new Object[] {n,i,c,p});

} }

catch(Exception e){

JOptionPane.showMessageDialog(null,"Can't connect to the database");

} }

**private void addActionPerformed(java.awt.event.ActionEvent evt) {**

DefaultTableModel model=(DefaultTableModel) cart.getModel();

try{

stmt=con.createStatement();

String n=item\_a.getText();

int q=Integer.parseInt(qty.getText());

String query="SELECT\*FROM ITEM WHERE NO='"+n+"';";

rs=stmt.executeQuery(query);

while(rs.next()){

int r=rs.getInt("price");

String i=rs.getString("item");

int p=q\*r;

model.addRow(new Object[] {i,r,q,p});

} }

catch(Exception e){

JOptionPane.showMessageDialog(null,"Invalid Item");

} }

**private void removeActionPerformed(java.awt.event.ActionEvent evt) {**

DefaultTableModel model=(DefaultTableModel) cart.getModel();

model.removeRow(cart.getSelectedRow()); }

**private void calculateActionPerformed(java.awt.event.ActionEvent evt) {**

int sum=0,row=cart.getRowCount();

for(int i=0;i\<row;i++) {

sum=sum+

Integer.parseInt(cart.getValueAt(i,3).toString()); }

price.setText(""+sum);

double t=sum\*0.18;

double p=sum+t;

tax.setText(""+t);

total.setText(""+p);

}

**private void clearActionPerformed(java.awt.event.ActionEvent evt) {**

name.setText("");

table.setText("");

DefaultTableModel model=(DefaultTableModel) cart.getModel();

int rows=model.getRowCount();

if(rows\>0)

for(int i=0;i\<rows;i++)

model.removeRow(0);

price.setText("");

tax.setText("");

total.setText("");

}

**private void backActionPerformed(java.awt.event.ActionEvent evt) {**

this.setVisible(false);

Main\_Window m=new Main\_Window();

m.setVisible(true);

}

**private void log\_outActionPerformed(java.awt.event.ActionEvent evt)** {

this.setVisible(false);

Login\_Window l=new Login\_Window();

l.setVisible(true);

}

**private void exitActionPerformed(java.awt.event.ActionEvent evt) {**

System.exit(0);

}

## Table Booking / Cancellation

![](RackMultipart20230627-1-k9rnkx_html_23f6c710429f4c95.jpg)

Coding

**private void checkActionPerformed(java.awt.event.ActionEvent evt) {**

DefaultTableModel model=(DefaultTableModel) status.getModel();

int rows=model.getRowCount();

if(rows\>0)

for(int i=0;i\<rows;i++)

model.removeRow(0);

try{

Class.forName("java.sql.Driver");

con=DriverManager.getConnection

("jdbc:mysql://localhost/resturant","root","3767");

stmt=con.createStatement();

String query="SELECT\*FROM STATUS;";

rs=stmt.executeQuery(query);

while(rs.next()) {

String t=rs.getString("t\_no");

String ty=rs.getString("type");

String s=rs.getString("seats");

String st=rs.getString("status");

String d=rs.getString("date");

String f=rs.getString("fr");

String t\_=rs.getString("t");

String p=rs.getString("price");

model.addRow(new Object[] {t,ty,s,st,d,f,t\_,p});

} }

catch(Exception e){

JOptionPane.showMessageDialog(null,"Can't connect to the database");

} }

**private void retrieveActionPerformed(java.awt.event.ActionEvent evt) {**

DefaultTableModel model=(DefaultTableModel) bookings.getModel();

int rows=model.getRowCount();

if(rows\>0)

for(int i=0;i\<rows;i++)

model.removeRow(0);

try{

stmt=con.createStatement();

String query="SELECT\*FROM BOOKINGS;";

rs=stmt.executeQuery(query);

while(rs.next()) {

String b=rs.getString("b\_no");

String n=rs.getString("name");

String p\_no=rs.getString("p\_no");

String t=rs.getString("t\_no");

String d=rs.getString("date");

String f=rs.getString("from");

String t\_=rs.getString("to");

String p=rs.getString("payment");

model.addRow(new Object[] {b,n,p\_no,t,d,f,t\_,p});

} }

catch(Exception e){

JOptionPane.showMessageDialog(null,"Can't connect to the database");

} }

**private void bookActionPerformed(java.awt.event.ActionEvent evt) {**

try{

stmt=con.createStatement();

String na=name.getText();

String ph=phone\_no.getText();

String ty=(String)table\_type.getSelectedItem();

int da=(Integer)date.getValue();

String mo=(String)month.getValue();

int ye=(Integer)year.getValue();

String d=mo+" "+da+","+ye;

String f=from.getText();

String t=to.getText();

String ta=table\_no.getText();

String bo=booking\_no.getText();

String pa; {

if (cash.isSelected())

pa="CASH";

else if (card.isSelected())

pa="CARD";

else

pa="CHEQUE"; }

String query="INSERT INTO BOOKINGS VALUES ('"+bo+"','"+na+"','"+ph+"',

'"+ta+"','"+d+"','"+f+"','"+t+"','"+pa+"');";

String q="UPDATE STATUS SET STATUS='"+bo+"',DATE='"+d+"',FR='"+f+"',

T='"+t+"'"+" WHERE t\_no='"+ta+"';";

stmt.executeUpdate(query);

stmt.executeUpdate(q);

JOptionPane.showMessageDialog(null,"Table Booked Successfully"); }

catch(Exception e) {

JOptionPane.showMessageDialog(null,"Please check if all fields are

correct"); } }

**private void table\_typeActionPerformed(java.awt.event.ActionEvent evt)** {

int p=1000;

String m=""; {

if(ty.equals("DATE")){

p=2000;

m="2";}

if(ty.equals("BUSINESS"))

p=3000;

if(ty.equals("EXECUTIVE"))

p=5000;

if(ty.equals("PERSONAL HALL"))

p=12000;

price.setText(""+p);

members.setText(""+m); }

![](RackMultipart20230627-1-k9rnkx_html_d3e45a76ce23d62.jpg)

**private void okActionPerformed(java.awt.event.ActionEvent evt)** {

try{

stmt=con.createStatement();

String c=cb.getText();

String q="DELETE FROM BOOKINGS WHERE B\_NO="+c+";";

String r="UPDATE STATUS SET STATUS='AVAILABLE',DATE='------------',FR='---

---------',T='------------'"+" WHERE status='"+c+"';";

stmt.executeUpdate(r);

stmt.executeUpdate(q);

JOptionPane.showMessageDialog(null,"Booking Cancelled Successfully");

}

catch(Exception e) {

JOptionPane.showMessageDialog(null,"Invalid Booking No.");

} }

**private void backActionPerformed(java.awt.event.ActionEvent evt) {**

this.setVisible(false);

Main\_Window m=new Main\_Window();

m.setVisible(true);

}

**private void log\_outActionPerformed(java.awt.event.ActionEvent evt) {**

this.setVisible(false);

Login\_Window l=new Login\_Window();

l.setVisible(true);

}

**private void exitActionPerformed(java.awt.event.ActionEvent evt)** {

System.exit(0);

}

**//end of the programme**

# Tables used in the Back-end

## Employee

+-----+--------------+-----------------+------------+--------+

| id | name | designation | hire\_date | salary |

+-----+--------------+-----------------+------------+--------+

| 101 | DIVAKAR | MANAGER | 2013-12-15 | 85000 |

| 102 | JHANVI | HOST | 2012-05-23 | 25000 |

| 103 | CHANDU LAL | WAITER | 2014-02-02 | 15000 |

| 104 | AMRISH SINGH | BUSPERSON | 2000-03-01 | 15000 |

| 105 | ARHAAN | ACCOUNTANT | 2000-01-11 | 50000 |

| 106 | HUNAR | ASST. MANAGER | 2019-10-17 | 35000 |

| 107 | INDERJEET | CHEF | 2011-05-12 | 55000 |

| 108 | HUNAR | DISHWASHER | 2013-12-15 | 15000 |

| 109 | ISHAAN | CASHIER | 2013-12-03 | 35000 |

| 110 | PURAV | KITCHEN MANAGER | 2009-02-08 | 60000 |

| 111 | NAKUL | COOK | 2009-03-25 | 30000 |

| 112 | RAUNAK | DISHWASHER | 2018-02-15 | 15000 |

| 113 | TAIMUR | WAITER | 2017-02-18 | 15000 |

| 114 | TEJAS | BUSPERSON | 2019-11-19 | 15000 |

| 115 | TARAN | BARISTA | 2013-06-27 | 25000 |

| 116 | JAYANT | WAITER | 2016-03-23 | 15000 |

| 117 | KIAAN | BARTENDER | 2019-05-04 | 30000 |

| 118 | KABIR | CHEF | 2019-09-18 | 55000 |

| 119 | AYESHA | RECEPTIONIST | 2018-12-16 | 25000 |

| 120 | MADHAV | SOMMELIER | 2012-06-21 | 35000 |

| 121 | MISHTI | SWEEPER | 2016-06-15 | 15000 |

| 122 | KARTIK | COOK | 2017-12-20 | 30000 |

+-----+--------------+-----------------+------------+--------+

## Status

+------+---------------+-------+-----------+------------------+--------------+--------------+-------+

| t\_no | type | seats | status | date | fr | t | price |

+------+---------------+-------+-----------+------------------+--------------+--------------+-------+

| 1 | BUSINESS | 6 | AVAILABLE | ------------ | ------------ | ------------ | 3000 |

| 2 | BUSINESS | 5 | 120091 | DECEMBER 21,2019 | 7:00 PM | 9:00 PM | 3000 |

| 3 | ORDINARY | 4 | AVAILABLE | ------------ | ------------ | ------------ | 1000 |

| 4 | EXECUTIVE | 8 | 120089 | JANUARY 1,2020 | 4:00 PM | 6:00 PM | 5000 |

| 5 | DATE | 2 | 120090 | DECEMBER 12,2019 | 7:30 PM | 8:30 PM | 2000 |

| 6 | DATE | 2 | AVAILABLE | ------------ | ------------ | ------------ | 2000 |

| 7 | DATE | 2 | 120095 | DECEMBER 19,2019 | 10:00 AM | 12:00 PM | 2000 |

| 8 | EXECUTIVE | 8 | AVAILABLE | ------------ | ------------ | ------------ | 5000 |

| 9 | EXECUTIVE | 10 | AVAILABLE | ------------ | ------------ | ------------ | 5000 |

| 10 | PERSONAL HALL | 25 | 120092 | DECEMBER 15,2019 | 8:30 PM | 10:00 PM | 12000 |

| 11 | PERSONAL HALL | 25 | AVAILABLE | ------------ | ------------ | ------------ | 12000 |

| 12 | BUSINESS | 5 | 120093 | DECEMBER 22,2019 | 11:00 AM | 1:30 PM | 3000 |

| 13 | BUSINESS | 6 | 120094 | JANUARY 15, 2020 | 12:30 PM | 2:00 PM | 3000 |

| 14 | ORDINARY | 4 | AVAILABLE | ------------ | ------------ | ------------ | 1000 |

| 15 | EXECUTIVE | 10 | AVAILABLE | ------------ | ------------ | ------------ | 5000 |

+------+---------------+-------+-----------+------------------+--------------+--------------+-------+

## Items

+----+------------------------------------+---------------+-------+

| no | item | category | price |

+----+------------------------------------+---------------+-------+

| 1 | HOT AND SOUR VEG SOUP | SOUPS | 350 |

| 2 | CHETTINAD PANEER TIKKA | APPETISERS | 425 |

| 3 | HOT TEAPOT HOLUD SOUP | SOUPS | 350 |

| 4 | ROAST CHICKEN AND MUSHROOM SOUP | SOUPS | 350 |

| 5 | GO GREEN SALAD | SALADS | 375 |

| 6 | CORN SEEKH KEBAB | APPETISERS | 375 |

| 7 | SPEGHATTI WITH SMOKED CHICKEN | PASTA | 550 |

| 8 | LASAGNA OF TOASTED LAMB BOLOGNAISE | PASTA | 575 |

| 9 | SUBZ BIRYANI | MAIN COURSE | 475 |

| 10 | CANNELONI AND RATATOULLI BAKE | INTERNATIONAL | 495 |

| 11 | MATTAR PANEER | MAIN COURSE | 525 |

| 12 | ASSORTED ICE CREAM OR SORBETS | DESSERTS | 325 |

| 13 | FISH AND CHIPS WITH TARTAR SAUCE | INTERNATIONAL | 625 |

| 14 | KAKORI KEBABS | STARTERS | 425 |

| 15 | SEA SCALLOPS | STARTERS | 650 |

| 16 | CRISP CHICKEN LOLLIPOPS | APPETISERS | 525 |

| 17 | LINGUINI WITH FRESH HERBS | PASTA | 495 |

| 18 | MASSALA TOMATO SOUP | SOUPS | 350 |

| 19 | PANEER TIKKA | STARTERS | 525 |

| 20 | PANCHRATAN KAJU KORMA | MAIN COURSE | 525 |

| 21 | TANDOORI CHICKEN | MAIN COURSE | 625 |

| 22 | SUBZ PHALLI KI TIKKI | APPETISERS | 350 |

| 23 | MURGH DHANIWAL KORMA | MAIN COURSE | 625 |

| 24 | HOME STYLE FISH CURRY | MAIN COURSE | 625 |

| 25 | LAAL MIRCH KA GOSHT | MAIN COURSE | 675 |

| 26 | SRI LANKAN PRAWN CURRY | MAIN COURSE | 950 |

| 27 | AMERICAN CORN CREPES | INTERNATIONAL | 495 |

| 28 | GRILLED PRAWNS WITH CHILLI | INTERNATIONAL | 975 |

| 29 | SOUTH INDIAN COFFEE KALAKAND | DESSERTS | 350 |

| 30 | CHUTNEY PANEER KE PAKODE | APPETISERS | 350 |

+----+------------------------------------+---------------+-------+

## Bookings

+--------+-----------------+------------+------+-------------------+----------+----------+---------+

| b\_no | name | p\_no | t\_no | date | from | to | payment |

+--------+-----------------+------------+------+-------------------+----------+----------+---------+

| 120089 | TUSHAR JAIN | 9988456278 | 4 | JANUARY1, 2020 | 4:00 PM | 6:00 PM | CASH |

| 120090 | ARHAAN SINGH | 7562458955 | 5 | DECEMBER 12, 2019 | 7:30 PM | 8:30 PM | CARD |

| 120091 | SIDDARTH JAY | 8894562584 | 2 | DECEMBER 21, 2019 | 7:00 PM | 9:00 PM | CARD |

| 120092 | DIVYA SINGHANIA | 9457894565 | 10 | DECEMBER 15, 2019 | 8:30 PM | 10:00 PM | CHEQUE |

| 120093 | ANSH VOHRA | 9975638214 | 12 | DECEMBER 22, 2019 | 11:00 AM | 1:30 PM | CARD |

| 120094 | AVIKA SHETTY | 7295387625 | 13 | JANUARY 15, 2020 | 12:30 PM | 2:00 PM | CASH |

| 120095 | PAARAV JAIN | 9546825845 | 7 | DECEMBER 19,2019 | 10:00 AM | 12:00 PM | CARD |

+--------+-----------------+------------+------+-------------------+----------+----------+---------+

# References

In order to work on thid project titled Restaurant management system, the following books and literature are refered by me during the various phases of development of the project.

- [http://www.mysql.org/](http://www.mysql.org/)
- [http://www.netbeans.org/](http://www.netbeans.org/)
- [http://www.w3schools.org/](http://www.w3schools.org/)
- Informatics Practices for class XII-by Sumita Arora
- Informatics Practices for class XI-by Sumita Arora
- Various websites of discussion forum and software development activities.

Other than the above mentioned books ,the suggestions and supervision of my teacher and my class experience also helped me to develop this software project.
