package com.kosta.book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.kosta.db.ConnectionProvider;
import com.kosta.exam01.GoodsVO;

public class BookDAO {

    public void create() {}
    public ArrayList<BookVO> read() {
        ArrayList<BookVO> list = new ArrayList<BookVO>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rslt = null;
        try {
            conn = ConnectionProvider.getConnection();
            stmt = conn.createStatement();
            rslt = stmt.executeQuery("SELECT * FROM BOOK");
            while (rslt.next()){
                list.add(new BookVO(
                        rslt.getInt(1),
                        rslt.getString(2),
                        rslt.getInt(3),
                        rslt.getString(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionProvider.closeConnection(conn, stmt, rslt);
        }
        return list;
    }
    public ArrayList<BookVO> read(String publisher) {
        ArrayList<BookVO> list = new ArrayList<BookVO>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rslt = null;
        try {
            conn = ConnectionProvider.getConnection();
            stmt = conn.createStatement();
            rslt = stmt.executeQuery("SELECT * FROM BOOK WHERE PUBLISHER = '"+ publisher +"'");
            while (rslt.next()){
                list.add(new BookVO(
                        rslt.getInt(1),
                        rslt.getString(2),
                        rslt.getInt(3),
                        rslt.getString(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionProvider.closeConnection(conn, stmt, rslt);
        }
        return list;
    }
    public void update() {}
    public void delete() {}

}
