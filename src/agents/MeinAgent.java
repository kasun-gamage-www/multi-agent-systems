/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agents;

import masmt3.agent.MaSMTAgent;

/**
 *
 * @author Kasun Gamage
 */
public class MeinAgent extends MaSMTAgent {

    @Override
    public void active() {
        System.out.println("activated");
    }

    @Override
    public void live() {
        System.out.println(this.getClass().getName() + " living");

        for (int i = 10; i > 0; i--) {
            wait(1000);

            System.out.println("living for " + i + "seconds");
        }
        setLive(false);
    }

    @Override
    public void end() {
        System.out.println("ended");
    }

}
