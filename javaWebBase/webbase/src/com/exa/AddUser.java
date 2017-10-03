package com.exa;
import  java.sql.*;
import java.sql.Driver;

public class AddUser {
    private Connection con;
    private UserInfo userInfo;
    public AddUser(){
        String CLASSFORNAME = "com.mysql.jdbc.Driver";
        String SERVANDDB = "jdbc:mysql://127.0.0.1:3306/demo";
        String USER = "root";
        String PWD = "root";

        try {
            Class.forName(CLASSFORNAME);
            con = DriverManager.getConnection(SERVANDDB,USER,PWD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setUserInfo (UserInfo userInfo){
        this.userInfo = userInfo;
    }

    public void regist(){
        String reg = "insert into userinfo VALUES(?,?,?,?,?,?,?)";


        try {
            PreparedStatement pstmt = con.prepareStatement(reg);

            pstmt.setString(1,userInfo.getUsername());
            pstmt.setString(2,userInfo.getPassword());
            pstmt.setString(3,userInfo.getRealname());
            pstmt.setString(4,userInfo.getTel());
            pstmt.setString(5,userInfo.getAddress());
            pstmt.setString(6,userInfo.getZip());
            pstmt.setString(7,userInfo.getEmail());
            pstmt.executeUpdate();//执行sql 语句
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
