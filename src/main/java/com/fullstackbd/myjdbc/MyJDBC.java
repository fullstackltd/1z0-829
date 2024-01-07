package com.fullstackbd.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


class Department {
  private long id;
  private String name;
  private String location;

  public Department(long id, String name, String location) {
    this.id = id;
    this.name = name;
    this.location = location;
  }

  @Override
  public String toString() {
    return "Department{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", location='" + location + '\'' +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}

public class MyJDBC {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    System.out.println("Hello, World!");
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/vendor_exam", 
      "root", "root");

    Statement stmt = conn.createStatement();
    Statement stmt2 = conn.prepareStatement("SELECT * FROM department");
    // ResultSet rs2 = stmt2.executeQuery(stmt2.toString());
    // stmt.execute("INSERT INTO department (name, location) VALUES ('Accounts', 'Dhaka')");
//    
    ResultSet rs = stmt.executeQuery("SELECT * FROM department");
    
    List<Department> departments = new ArrayList<>();
    while (rs.next()) {
        Department d = new Department(rs.getLong("id"), rs.getString("name"), rs.getString("location"));
        departments.add(d);
    }
    System.out.println("Using for each loop");
    for (Department d : departments) {
      System.out.println(d.getId()+" "+d.getName()+" "+d.getLocation());
    }
    stmt.close();
    conn.close();
  }
}
