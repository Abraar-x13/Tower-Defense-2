import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Save {
    public void loadSave(File loadPath){
        try {
            Scanner loadScanner = new Scanner(loadPath);

            boolean flag = true;
            while(loadScanner.hasNext()){
                Screen.killsToWin = loadScanner.nextInt();

                int f = Screen.killsToWin;

                if (flag) {
                    if (f == 10) {
                        Mob.setSpeed(30);
                    } else if (f == 20) {
                        Mob.setSpeed(15);
                    } else if (f == 30) {
                        Mob.setSpeed(3);
                    }
                    flag = false;
                }


                for(int y = 0; y < Screen.room.block.length; y++) {
                    for(int x = 0; x< Screen.room.block[0].length; x++){
                        Screen.room.block[y][x].groundID= loadScanner.nextInt();
                    }
                }

                for(int y=0; y<Screen.room.block.length; y++) {
                    for(int x = 0; x < Screen.room.block[0].length; x++){
                        Screen.room.block[y][x].airID= loadScanner.nextInt();
                    }
                }
            }

            loadScanner.close();
        } catch (Exception ignored) {}
    }
}
