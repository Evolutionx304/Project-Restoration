package classicMod.uCoreGraphics;

import arc.graphics.Color;
import arc.graphics.Pixmap;
import arc.graphics.Pixmaps;
import arc.graphics.g2d.PixmapRegion;
import arc.graphics.g2d.TextureRegion;
import arc.util.Tmp;

public class RPixmaps extends Pixmaps {

    public static Pixmap replaceWhite(PixmapRegion source, Color replaceTo){
        Pixmap out = new Pixmap(source.width, source.height);

        Color tmp = new Color();
        for(int y = 0; y < source.height; y++){
            for(int x = 0; x < source.width; x++){
                int c1 = source.getRaw(x, y);
                tmp.set(c1);

                boolean isWhite =
                        tmp.r > 0.95f &&
                                tmp.g > 0.95f &&
                                tmp.b > 0.95f &&
                                tmp.a > 0.95f;

                int val = isWhite ? replaceTo.rgba() : c1;
                out.setRaw(x, y, val);
            }
        }

        return out;
    }

    public static Pixmap copyPixmap(PixmapRegion source){
        Pixmap out = new Pixmap(source.width, source.height);

        for(int y = 0; y < source.height; y++){
            for(int x = 0; x < source.width; x++){
                int c1 = source.getRaw(x, y);

                int val = Tmp.c1.set(c1).rgba();
                out.setRaw(x, y, val);
            }
        }

        return out;
    }
}
