/*
 * Not licensed yet, use at your own risk, no warrenties!
 */
package remotedevices;

/**
 *
 * @author Tobias Grundtvig <tgrundtvig@gmail.com>
 */
public interface RemoteDeviceListener
{
    public void onDeviceConnected(RemoteDeviceView device);
    public void onDeviceDisonnected(RemoteDeviceView device);
}
