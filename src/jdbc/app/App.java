/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.app;

import jdbc.app.service.AuthService;
import jdbc.app.service.AuthServiceImpl;
import jdbc.app.service.MockMovieServiceImpl;
import jdbc.app.service.MovieService;
import jdbc.app.service.MovieServiceImpl;
import jdbc.dao.MovieDao;
import jdbc.dao.MovieDaoImpl;

/**
 *
 * @author thetkhine
 */
public class App {
    private static App singleton;
    
    MovieService movieService;
    AuthService authService;
    private App()
    {
        this.movieService = new MovieServiceImpl();
        //this.movieService = new MockMovieServiceImpl();
        this.authService = new AuthServiceImpl();
    }
    public static App getApp()
    {
        if(singleton == null)
        {
            singleton = new App();
        }
        return singleton;
    }

    public MovieService getMovieService() {
        return movieService;
    }

   
    
}
