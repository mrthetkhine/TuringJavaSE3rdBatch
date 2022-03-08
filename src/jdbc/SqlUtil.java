/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdbc.SqlUtil.dbResultToModel;
import jdbc.model.Actor;
import jdbc.model.Movie;

/**
 *
 * @author thetkhine
 */
public class SqlUtil {
    
    public static String dateToString(Date date)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
    public static Date strToDate(String dateStr)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(dateStr);
        } catch (ParseException ex) {
            Logger.getLogger(SqlUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static<T> HashMap<String,Field> getFieldNameType(T model)
    {
        HashMap<String,Field> fieldType = new HashMap<String,Field>();
        Class<?> modelClass = model.getClass();
        Field[] fields = modelClass.getDeclaredFields();
        for(Field field : fields)
        {
            //System.out.println("Name "+field.getName() + " Type "+ field.getType());
            fieldType.put(field.getName(), field);
        }
        
        return fieldType;
    }
    public static <T> List<T> dbResultToModel(ResultSet resultSet,T model)
    {
        List<T> models = new ArrayList<T>();
        Class<?> modelClass = model.getClass();
        System.out.println("ModelClass Name "+ modelClass.getName());
        HashMap<String,Field> fieldTypes = getFieldNameType(model);
        try {
            while(resultSet.next())
            {
               T modelInstance = (T)modelClass.newInstance();
               for(HashMap.Entry<String,Field> field : fieldTypes.entrySet())
               {
                   String fieldName = field.getKey();
                   Class<?>fieldType = field.getValue().getType();
                   
                   String fieldTypeName = fieldType.getSimpleName();
                   Field objField = field.getValue();
                   objField.setAccessible(true);
                   if(null != fieldTypeName)
                   {
                       switch (fieldTypeName) {
                       case "Long":{
                            Long value = resultSet.getLong(fieldName);
                            objField.set(modelInstance, value);
                            break;
                           }
                       case "Double":{
                           Double value = resultSet.getDouble(fieldName);
                           objField.set(modelInstance, value);
                               break;
                           }
                       case "String":{
                           String value = resultSet.getString(fieldName);
                           objField.set(modelInstance, value);
                               break;
                           }
                       case "Date":{
                           Date value = resultSet.getDate(fieldName);
                           objField.set(modelInstance, value);
                               break;
                           }
                       default:
                           break;
                   }
                   }
                   
               }
               models.add(modelInstance);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return models;
    }
    
    public static void main(String[] args) {
        try {
            Connection con = DAO.getDAO().getConnection();
            Statement sqlStatement = con.createStatement();
            
            /*
            String sql = "SELECT * FROM Actor";
            ResultSet result = sqlStatement.executeQuery(sql);
            Actor actor = new Actor();
            List<Actor> actors = dbResultToModel(result,  actor);
            
            for(Actor act : actors)
            {
                System.out.println(act);
            }
*/
            /*
            String sql = "SELECT * FROM movie";
            ResultSet result = sqlStatement.executeQuery(sql);
            Movie movie = new Movie();
            List<Movie> movies = dbResultToModel(result,  movie);
            
            for(Movie mov : movies)
            {
                System.out.println(mov);
            }
            */
            //String dateStr = dateToString(new Date());
            System.out.println(strToDate("2021-4-25"));
        } catch (Exception ex) {
            Logger.getLogger(SqlUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
