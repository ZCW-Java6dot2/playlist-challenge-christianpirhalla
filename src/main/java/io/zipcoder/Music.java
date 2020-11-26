package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        //count forward
        int stepsForward = 0;
        int i = startIndex;
        while (true){ // we can do this bc the song is guaranteed to be in the playlist
            if (playList[i].equals(selection)) {break;}
            stepsForward++;
            if (i == playList.length - 1){ i = 0; } // loop back to the beginning if we're at the end
            else { i++; }
        }

        //count backward
        int stepsBackward = 0;
        i = startIndex;
        while (true){
            if (playList[i].equals(selection)) {break;}
            stepsBackward++;
            if (i == 0){ i = playList.length - 1; } // loop back to the end if we're at the beginning
            else { i--; }
        }

        return Math.min(stepsBackward, stepsForward);
    }
}
