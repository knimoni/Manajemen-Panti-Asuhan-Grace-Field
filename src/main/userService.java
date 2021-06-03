/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author naura
 */
public class userService {
    private String[][] data = new String [6][2];
    private String user, pass;
    
    //constructor
    public userService(String users, String passwords)
    {
        user = users;
        pass = passwords;
        String[][] data =
        {
            {"gracefield", "123",},
            {"anak", "456",},
            {"tamu", "789"}
        };
        this.data = data;
    }
    
    public boolean checkCredential() //cek data const
    {
        for(int i = 0; i < data.length; i++)
        {
            if(data[i][0].equals(user))
            {
                if(data[i][1].equals(pass))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
