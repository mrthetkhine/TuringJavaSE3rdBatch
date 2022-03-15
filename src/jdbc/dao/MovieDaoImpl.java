/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DAO;
import static jdbc.SqlUtil.dbResultToModel;
import jdbc.model.Movie;

/**
 *
 * @author thetkhine
 */
public class MovieDaoImpl implements MovieDao{
    @Override
    public Optional<Movie> getMovieById(Long id) {
       
        try {
           
            Connection con = DAO.getDAO().getConnection();
            
            String sql = "SELECT * FROM Movie WHERE ID=? ";
            PreparedStatement stat = con.prepareStatement(sql);
            stat.setLong(1, id);
            
            ResultSet result = stat.executeQuery();
            Optional<Movie> resultMovie = singleResultToMovie(result) ;
            
            result.close();
            stat.close();
            
            return resultMovie; 
           
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return Optional.empty();
    }
    
     @Override
    public Optional<Movie> getMovieByTitleYear(String title, Long year) {
        try {
            
            Connection con = DAO.getDAO().getConnection();
            
            String sql = "SELECT * FROM Movie WHERE title=? AND year=?";
            PreparedStatement stat = con.prepareStatement(sql);
            stat.setString(1, title);
            stat.setLong(2, year);
            
            ResultSet result = stat.executeQuery();
            Optional<Movie> resultMovie = singleResultToMovie(result) ;
            
            result.close();
            stat.close();
            
            return resultMovie;
            
           
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return Optional.empty();
    }

    private Optional<Movie> singleResultToMovie(ResultSet result) throws SQLException {
        Optional<Movie> resultMovie ;
        if(result.next())
        {
            Movie movie = new Movie();
            movie.setId(result.getLong("Id"));
            movie.setTitle(result.getString("Title"));
            movie.setYear(result.getLong("year"));
            
            
            resultMovie = Optional.of(movie);
        }
        else
        {
            resultMovie = Optional.empty();
        }
        return resultMovie;
    }

    @Override
    public List<Movie> getAllMovie() {
        List<Movie> movies = new ArrayList<Movie>();
        try {
            String sql = "SELECT * FROM Movie ";
            Connection con = DAO.getDAO().getConnection();
            //Statement sqlStatement = con.createStatement();
            PreparedStatement stat = con.prepareStatement(sql);
            
            ResultSet result = stat.executeQuery();
            movies = dbResultToModel(result,new Movie());
            
            stat.close();
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return movies;
    }
    //title = Titanic
    List<String> getAlConditionForSearch(Movie movie)
    {
        List<String> predicates = new ArrayList<>();
        if(movie.getTitle() != null)
        {
            predicates.add("title LIKE \"%"+ movie.getTitle()+"%\"");
        }
        if(movie.getYear() != null)
        {
             predicates.add("year="+ movie.getYear()+"");
        }
        return predicates;
    }
    String getWhereCaluseForSearch(Movie movie)
    {
        String whereClause = "";
        List<String> predicates = this.getAlConditionForSearch(movie);
        if(predicates.size() >0)
        {
            whereClause = " WHERE ";
            whereClause += String.join(" AND ", predicates);
            
        }
        return whereClause;
    }
    
    @Override
    public List<Movie> searchMovie(Movie movie) {
        List<Movie> movies = new ArrayList<Movie>();
        String title = movie.getTitle();
        Long year = movie.getYear();
        try {
            String whereCaluse = getWhereCaluseForSearch(movie);
            String sql = "SELECT * FROM Movie "+whereCaluse;
            Connection con = DAO.getDAO().getConnection();
            //Statement sqlStatement = con.createStatement();
            PreparedStatement stat = con.prepareStatement(sql);
            
            ResultSet result = stat.executeQuery();
            movies = dbResultToModel(result,new Movie());
            
            stat.close();
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return movies;
    }
    @Override
    public boolean insertMovie(Movie movie) {
        boolean inserted = false;
        try {
            String sql = "INSERT INTO Movie(title,year) VALUES(?,?)";
            Connection con = DAO.getDAO().getConnection();
            //Statement sqlStatement = con.createStatement();
            PreparedStatement stat = con.prepareStatement(sql);
            
            stat.setString(1, movie.getTitle());
            stat.setLong(2, movie.getYear());
            
            int rows = stat.executeUpdate();
            
            inserted = rows >0;
            stat.close();
            
            stat = con.prepareStatement("SELECT LAST_INSERT_ID();");
            ResultSet resultSet = stat.executeQuery();
            if(resultSet.next())
            {
                Long id = resultSet.getLong(1);
                movie.setId(id);
            }
            resultSet.close();
            stat.close();
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return inserted;
    }
    @Override
    public boolean updateMovie(Movie movie) {
        boolean updated = false;
        try {
            String sql = "UPDATE Movie SET title=?, year=? WHERE ID=?";
            Connection con = DAO.getDAO().getConnection();
            //Statement sqlStatement = con.createStatement();
            PreparedStatement stat = con.prepareStatement(sql);
            
            stat.setString(1, movie.getTitle());
            stat.setLong(2, movie.getYear());
            stat.setLong(3, movie.getId());
            
            int rows = stat.executeUpdate();
            
            updated = rows >0;
            stat.close();
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return updated;
    }
    @Override
    public boolean deleteMovie(Long movieId) {
        boolean deleted = false;
        try {
            String sql = "DELETE FROM MOVIE WHERE ID=?";
            Connection con = DAO.getDAO().getConnection();
            //Statement sqlStatement = con.createStatement();
            PreparedStatement stat = con.prepareStatement(sql);
            
            stat.setLong(1,movieId);
           
            int rows = stat.executeUpdate();
            
            deleted = rows >0;
            stat.close();
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return deleted;
    }
    public static void main(String[] args) {
        MovieDaoImpl dao = new MovieDaoImpl();
        
        //Optional<Movie> movie = dao.getMovieById(1L);
        //System.out.println(movie.get());
        /*
        //movie.setId(5L);
        movie.setTitle("The Batman");
        movie.setYear(2022L);
        
        dao.insertMovie(movie);
        */
        //dao.deleteMovie(6L);
        /*
        List<Movie> movies = dao.getAllMovie();
        for(Movie movie : movies)
        {
            System.out.println(movie);
        }
        */
        /*
        Movie movie = new Movie();
        movie.setTitle("The Godfather");
        movie.setYear(1972L);
        dao.insertMovie(movie);
        */
        /*
        Optional<Movie> movie = dao.getMovieByTitleYear("The Godfather", 1972L);
        
        System.out.println("Movie "+movie.get());
        */
        
        Movie movie = new Movie();
        movie.setTitle("Titanic");
        //movie.setYear(2009L);
        String whereCaluse = dao.getWhereCaluseForSearch(movie);
        
        System.out.println("=> "+ whereCaluse);
    }
        
}
