package package15;

import lib.StdAudio;

// Mini music player with 3 favorite songs in 3 octaves
public class MiniPlayer {
  final private static char[] NOTES = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
  final private static double[] HZS = {440.0, 493.88, 523.25, 587.33, 659.26, 698.46, 783.99};
  final private static double BASE_DURATION = 0.4;
  final private static int SAMPLING_RATE = 44100;

  public static void main(String[] args) {
    // Nhin nhung mua thu di, em nghe sau len trong nang
    char[] notes = {'E', 'A', 'C', 'E', 'A', 'A', 'A', 'G', 'A', 'B', 'C'};
    int[] octave = {1, 2, 1, 1, 2, 2, 2, 1, 2, 2, 2};
    int[] length = {1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 4};
    for (int i = 0; i < notes.length; i++) {
      playNote(notes[i], octave[i], length[i]);
    }
    // Va la rung ngoai song, nghe ten minh vao quen lang, nghe thang ngay chet trong thu vang
    char[] notes2 = {'E', 'A', 'C', 'E', 'B', 'B', 'B', 'F', 'B', 'C', 'D', 'B', 'G', 'E', 'A', 'E', 'D', 'C'};
    int[] octave2 = {1, 2, 1, 1, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 2, 1, 1, 1};
    int[] length2 = {1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 4};
    for (int i = 0; i < notes2.length; i++) {
      playNote(notes2[i], octave2[i], length2[i]);
    }
  }
  
  // Helper method to play an exact note
  // baseNote: A-G, octave: 1-3, duration: 1-5: semiquaver to semibreve
  static void playNote(char baseNote, int octave, int length) {
    double hz = 0;
    for (int i = 0; i < NOTES.length; i++) {
      if (baseNote == NOTES[i]) hz = HZS[i]; 
    }
    hz *= octave;
    double duration = BASE_DURATION * length;
    System.out.println(duration + " " + hz);
    // Sampling and play
    int n = (int) (SAMPLING_RATE * duration);
    double[] a = new double[n+1];
    for (int i = 0; i <= n; i++) {
      a[i] = Math.sin(2 * Math.PI * i * hz / SAMPLING_RATE);
      //System.out.print(a[i] + " ");
    }
    StdAudio.play(a);
  }

}
