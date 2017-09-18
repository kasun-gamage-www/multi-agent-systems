/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agents;

import masmt3.agent.MaSMTAbstractAgent;
import masmt3.agent.MaSMTAgent;
import masmt3.message.MaSMTMessage;

/**
 *
 * @author Kasun Gamage
 */
public class PingAgent2 extends MaSMTAgent {
     MaSMTMessage m;

    public PingAgent2(String group, String role, int id) {
        super(group, role, id);
    }

    @Override
    public void active() {

    }

    @Override
    public void live() {
        m = waitForMessage();
        System.out.println("message recieved >>>>>>>>> " + m);
        MaSMTAbstractAgent re = new MaSMTAbstractAgent("test", "ping", 1);

        MaSMTMessage mes = new MaSMTMessage(agent, re, agent, "ping", "This is a ping by " + agent, "test", "local");

        sendMessage(mes);

        wait(1000);
    }

    @Override
    public void end() {

    }

}
