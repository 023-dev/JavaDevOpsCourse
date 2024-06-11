package com.kosta.exam01;

import java.sql.*;
import java.util.ArrayList;
import com.kosta.db.ConnectionProvider;

public class GoodsDAO {

    public int CreateGoods(GoodsVO vo) {
        int rslt = -1;
        String query = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = ConnectionProvider.getConnection();
            stmt = conn.createStatement();
            query = "INSERT INTO GOODS VALUES("+vo.getNumber()+",'"+vo.getItem()+"',"+vo.getQty()+","+vo.getPrice()+")";
            rslt = stmt.executeUpdate(query);
            if(rslt > 0){
                System.out.println("inserted");
            } else {
                System.out.println("failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionProvider.closeConnection(conn, stmt);
        }
        return rslt;
    }

    public ArrayList<GoodsVO> ReadGoods() {
        ArrayList<GoodsVO> list = new ArrayList<>();
        ResultSet rslts = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = ConnectionProvider.getConnection();
            stmt = conn.createStatement();
            rslts = stmt.executeQuery("SELECT * FROM GOODS");
            while(rslts.next()){
                list.add(new GoodsVO(rslts.getInt(1),
                                     rslts.getString(2),
                                     rslts.getInt(3),
                                     rslts.getInt(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionProvider.closeConnection(conn, stmt, rslts);
        }
        return list;
    }

    public int UpdateGoods(GoodsVO vo) {
        int rslt = -1;
        String query = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = ConnectionProvider.getConnection();
            stmt = conn.createStatement();
            query = "UPDATE GOODS SET ITEM = '"+vo.getItem()+"', QTY = "+vo.getQty()+", PRICE = "+vo.getPrice()+" WHERE NO = "+vo.getNumber();
            rslt = stmt.executeUpdate(query);
            if (rslt > 0) {
                System.out.println("updated");
            } else {
                System.out.println("failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionProvider.closeConnection(conn, stmt);
        }
        return rslt;
    }

    public int DeleteGoods(int number) {
        int rslt = -1;
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = ConnectionProvider.getConnection();
            stmt = conn.createStatement();
            rslt = stmt.executeUpdate("DELETE GOODS WHERE NO = '"+number+"'");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionProvider.closeConnection(conn, stmt);
        }
        return rslt;
    }
}
