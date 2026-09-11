// Interface 1
interface WiFiEnabled {
    void connectWiFi();
}

// Interface 2
interface VoiceControlled {
    void voiceControl();
}

// Interface 3
interface MusicPlayer {
    void playMusic();
}

// Interface 4
interface VideoStreaming {
    void playVideo();
}

// Interface 5
interface TemperatureMonitor {
    void checkTemperature();
}


// Smart Phone
class SmartPhone implements WiFiEnabled, VoiceControlled, MusicPlayer {

    public void connectWiFi() {
        System.out.println("Phone connected to WiFi");
    }

    public void voiceControl() {
        System.out.println("Phone voice control working");
    }

    public void playMusic() {
        System.out.println("Phone playing music");
    }
}


// Smart TV
class SmartTV implements WiFiEnabled, MusicPlayer, VideoStreaming {

    public void connectWiFi() {
        System.out.println("TV connected to WiFi");
    }

    public void playMusic() {
        System.out.println("TV playing music");
    }

    public void playVideo() {
        System.out.println("TV playing video");
    }
}


// Smart AC
class SmartAC implements WiFiEnabled, VoiceControlled, TemperatureMonitor {

    public void connectWiFi() {
        System.out.println("AC connected to WiFi");
    }

    public void voiceControl() {
        System.out.println("AC voice control working");
    }

    public void checkTemperature() {
        System.out.println("Temperature is 24 degree Celsius");
    }
}


// Smart Speaker
class SmartSpeaker implements WiFiEnabled, VoiceControlled, MusicPlayer {

    public void connectWiFi() {
        System.out.println("Speaker connected to WiFi");
    }

    public void voiceControl() {
        System.out.println("Speaker voice control working");
    }

    public void playMusic() {
        System.out.println("Speaker playing music");
    }
}


// Smart Car
class SmartCar implements WiFiEnabled, VoiceControlled,
                            MusicPlayer, VideoStreaming {

    public void connectWiFi() {
        System.out.println("Car connected to WiFi");
    }

    public void voiceControl() {
        System.out.println("Car voice control working");
    }

    public void playMusic() {
        System.out.println("Car playing music");
    }

    public void playVideo() {
        System.out.println("Car playing video");
    }
}


// Main class
public class Device {

    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone();

        System.out.println("----- SMART PHONE -----");
        phone.connectWiFi();
        phone.voiceControl();
        phone.playMusic();


        SmartTV tv = new SmartTV();

        System.out.println("\n----- SMART TV -----");
        tv.connectWiFi();
        tv.playMusic();
        tv.playVideo();


        SmartAC ac = new SmartAC();

        System.out.println("\n----- SMART AC -----");
        ac.connectWiFi();
        ac.voiceControl();
        ac.checkTemperature();


        SmartSpeaker speaker = new SmartSpeaker();

        System.out.println("\n----- SMART SPEAKER -----");
        speaker.connectWiFi();
        speaker.voiceControl();
        speaker.playMusic();


        SmartCar car = new SmartCar();

        System.out.println("\n----- SMART CAR -----");
        car.connectWiFi();
        car.voiceControl();
        car.playMusic();
        car.playVideo();
    }
}