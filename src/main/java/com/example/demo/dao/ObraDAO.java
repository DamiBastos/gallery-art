package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.db.ConnectorDB;
import com.example.demo.model.Obra;

public class ObraDAO {
    public List<Obra> listar() {
        try {

            Statement st = ConnectorDB.getSt();
            ResultSet rs = st.executeQuery("Select * from obra");

            // recorro todas las peliculas
            // creo un objeto Pelicula x cada peli o fila
            List<Obra> listObra = new ArrayList<Obra>();
            while (rs.next()) {
                // orm: mapeo relacional objeto, lo hacen framework hibernate, jpa
                Obra obra = new Obra(rs.getInt("id"), rs.getString("titulo"), rs.getDate("anio"),
                        rs.getString("descripcion"), rs.getString("img"));
                listObra.add(obra);
            }

            return listObra;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    public Boolean add(Obra obra) {
        try {
            Statement st = ConnectorDB.getSt();
            Integer cantInsert = st.executeUpdate("INSERT INTO obra (titulo, descripcion, img) VALUES ('"
                    + obra.getTitulo() + "', " + obra.getDescripcion() + ", '" + obra.getImg() + "')");

            Boolean insertOk = (cantInsert == 1);

            return insertOk;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public Boolean del(Obra obra) {
        try {
            Statement st = ConnectorDB.getSt();
            Integer cantDel = st.executeUpdate("DELETE FROM obra WHERE id=" + obra.getId());

            Boolean delOk = (cantDel == 1);

            return delOk;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
