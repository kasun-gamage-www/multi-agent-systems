/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masystem;

import agents.MeinAgent;
import agents.PingAgent1;
import agents.PingAgent2;
import agents.PingManager;

/**
 * References : https://budditha.wordpress.com/masmt/
 *
 * @author Kasun Gamage
 *
 */
public class MASystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        MeinAgent meinAgent = new MeinAgent();
//        meinAgent.start();
        PingManager pingManager = new PingManager();
        pingManager.start();

    }

}
