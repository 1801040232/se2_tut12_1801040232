package tuts.tut10.to_dos.bridge.remotes;

import tuts.tut10.to_dos.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    //TO-DO: Implement the mute() method
    public void mute() {
    	//Display the current volume status is 'mute'
         System.out.println("mute");
        //Set the volume to 0
        this.device.setVolume(0);
    }
}
