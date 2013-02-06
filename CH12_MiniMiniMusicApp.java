import javax.sound.midi.*;
class CH12_MiniMiniMusicApp{
	public static void main(String[] args){
		System.out.println("hello!");
		CH12_MiniMiniMusicApp mini = new CH12_MiniMiniMusicApp();
		mini.play();	
	}
	public void play(){

		try{
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			Sequence seq = new Sequence(Sequence.PPQ,4);
			Track track = seq.createTrack();

			ShortMessage first = new ShortMessage();
			first.setMessage(192,1,10,0);
			
			MidiEvent noteOn = new MidiEvent(first,1);
			track.add(noteOn);

			ShortMessage a = new ShortMessage();
			a.setMessage(144,1,55,100);


			MidiEvent noteOn2 = new MidiEvent(a,1);
			track.add(noteOn2);
			
			ShortMessage b = new ShortMessage();
			b.setMessage(128,1,55,100);
			MidiEvent noteOff = new MidiEvent(b,10);//越大时间越长表示持续的时间，
			track.add(noteOff);

			player.setSequence(seq);
			player.start();


		}catch(Exception ex){
			ex.printStackTrace();
		}

		
	}
}