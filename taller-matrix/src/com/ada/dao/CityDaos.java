package com.ada.dao;


 

import com.ada.dto.CityDao;
import java.util.List;
 
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


 
 
public class CityDaos {
 
    private SqlSessionFactory sqlSessionFactory = null;
 
    public CityDaos(SqlSessionFactory sqlSessionFactory){
    	this.sqlSessionFactory = sqlSessionFactory;
    }
 

    @SuppressWarnings("unchecked")
    public  List<CityDao> selectAll(){
    	List<CityDao> list = null;
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            list = session.selectList("City.selectAll");
        } finally {
            session.close();
        }
        System.out.println("selectAll() --> "+list);
        return list;

    }

    
   public CityDao selectById(int id){
       	CityDao City = null;
        SqlSession session = sqlSessionFactory.openSession();
        try {
        	City = session.selectOne("City.selectById", id);
        

        } finally {
            session.close();
        }
        System.out.println("selectById("+id+") --> "+City);
        return City;
    } 

   
   public int insert(CityDao City){
	   int id = -1;
        SqlSession session = sqlSessionFactory.openSession();

        try {
            id = session.insert("City.insert", City);
        } finally {
            session.commit();
            session.close();
        }
        System.out.println("insert("+City+") --> "+City.getId());
        return id;
    }

  	public void update(CityDao City){
	   int id = -1;
      SqlSession session = sqlSessionFactory.openSession();

      try {
          id = session.update("City.update", City);

      } finally {
          session.commit();
          session.close();
      }
      System.out.println("update("+City+") --> updated");
  }
 

    public void delete(int id){
 
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.delete("City.delete", id);
        } finally {
            session.commit();
            session.close();
        }
        System.out.println("delete("+id+")");

    }
}