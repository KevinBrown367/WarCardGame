/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import gui.GUI;
import java.awt.EventQueue;

/**
 *
 * @author 645011
 */
public class AppDriver {
    
    public static void main(String[] args) {
        
        		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
                  
                        new GUI();
    }
}
