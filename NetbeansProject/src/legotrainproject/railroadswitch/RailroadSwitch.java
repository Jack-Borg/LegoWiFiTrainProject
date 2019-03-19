/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legotrainproject.railroadswitch;

import java.io.IOException;
import remotedevices.RemoteDevice;

/**
 *
 * @author Tobias
 */
public interface RailroadSwitch extends RemoteDevice
{
    public long getDeviceId();
    //0 -> unknown, 1 -> left, 2 -> right
    public int getSwitchDirection();
    public boolean isConnected();
    //1 -> left, 2 -> right
    public boolean switchTo(int position) throws IOException;
    
    //0 -> Unknown position
    //1 -> Train goes left
    //2 -> Train goes right
    //3 -> Moving to the left position
    //4 -> Moving to the right position
    public int getSwitchState();
    public void addListener(RailroadSwitchListener listener);
    public void removeListener(RailroadSwitchListener listener);
}
