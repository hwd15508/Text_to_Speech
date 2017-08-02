//Text to Speech Test Program
//8 External Jars Required
//Mbrola Voices too problematic to use: revisit in the future

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class FreeTTS {

	private static final String VOICENAME="kevin";
	private Voice voice;

	public FreeTTS(){
		System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
		VoiceManager voiceManager = VoiceManager.getInstance();
		voice = voiceManager.getVoice(VOICENAME);
		voice.allocate();
	}
	public void speak(String text){
		voice.speak(text);
	}
	public void close(){
		voice.deallocate();
	}
	public void open(){
		voice.allocate();
	}

	public static void main(String[] args){
		FreeTTS tts = new FreeTTS();
		tts.speak("I love you Vah Ron");
	}
}
