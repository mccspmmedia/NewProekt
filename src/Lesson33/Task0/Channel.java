package Lesson33.Task0;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Channel {
    private int number;
    private List<String> shows;

    public Channel(int number) {
        this.number = number;
        this.shows = new ArrayList<>();
    }

    public void addShow(String show) {
        shows.add(show);
    }

    public int getNumber() {
        return number;
    }

    public String playRandomShow() {
        if (shows.isEmpty()) {
            return "No shows available on this channel.";
        }

        Random random = new Random();
        int randomIndex = random.nextInt(shows.size());
        return shows.get(randomIndex);
    }
}

class TV {
    private List<Channel> channels;
    private Channel currentChannel;

    public TV() {
        channels = new ArrayList<>();
    }

    public void addChannel(Channel channel) {
        channels.add(channel);
    }

    public Channel getChannel(int number) {
        for (Channel channel : channels) {
            if (channel.getNumber() == number) {
                currentChannel = channel;
                return channel;
            }
        }
        return null;
    }

    public String playCurrentChannel() {
        if (currentChannel != null) {
            return currentChannel.playRandomShow();
        }
        return "No channel selected.";
    }
}

class RemoteControl {
    private TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public void on(int channelNumber) {
        Channel channel = tv.getChannel(channelNumber);
        if (channel != null) {
            String show = tv.playCurrentChannel();
            System.out.println("Watching channel " + channelNumber + ": " + show);
        } else {
            System.out.println("Channel not found.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Channel channel1 = new Channel(1);
        Channel channel2 = new Channel(2);
        channel1.addShow("Show 1A");
        channel1.addShow("Show 1B");
        channel2.addShow("Show 2A");
        tv.addChannel(channel1);
        tv.addChannel(channel2);

        RemoteControl remoteControl = new RemoteControl(tv);
        remoteControl.on(1);
        remoteControl.on(2);
    }
}

