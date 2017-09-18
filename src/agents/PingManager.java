/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agents;

import masmt3.agent.MaSMTAbstractAgent;
import masmt3.agent.MaSMTManager;
import masmt3.message.MaSMTMessage;

/**
 *
 * @author Kasun Gamage
 */
public class PingManager extends MaSMTManager {

    @Override
    public void active() {
        setNumberofClients(2);

        agents[0] = new PingAgent1("test", "ping", 1);
        agents[1] = new PingAgent2("test", "ping", 2);

        activeAllClients();
        activeMessageParsing();
        activeAgentStatusMonitor();
       
    }

    @Override
    public void live() {
    }

    @Override
    public void end() {
    }

}
