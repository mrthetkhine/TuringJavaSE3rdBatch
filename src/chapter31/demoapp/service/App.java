/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter31.demoapp.service;

/**
 *
 * @author thetkhine
 */
public class App {
    private static App app ;
    public AuthService authService;
    public ItemService itemService;
    
    App()
    {
        this.authService = new AuthServiceImpl();
        this.itemService = new ItemServiceImpl();
    }
    public static App getInstance()
    {
        if(app == null)
        {
            app = new App();
        }
        return app;
    }
}
