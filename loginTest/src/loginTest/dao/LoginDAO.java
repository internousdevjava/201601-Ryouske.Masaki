package loginTest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import loginTest.util.DBConnector;

public class LoginDAO {


        private boolean res;
        private Connection con;
        private String sql;
        private PreparedStatement ps;
        private ResultSet rs;

        public boolean select(String id, String password){
            res = false;

            try{
                con = (Connection)DBConnector.getConnection();
                sql = "SELECT * FROM admin WHERE";
                sql+= " admin_id = ? AND admin_password = ? ";
                ps = con.prepareStatement(sql);
                ps.setString(1, id);
                ps.setString(2, password);
                rs = ps.executeQuery();

                if(rs.next()){
                    res = true;
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            return res;
        }


    }

