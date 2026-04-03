package classicMod.content;

import arc.Core;
import mindustry.content.*;
import mindustry.gen.Icon;
import mindustry.type.SectorPreset;

public class RSectorPresents extends SectorPresets {

    public static SectorPreset
    silverCrags
    ;

    public static void load() {
        silverCrags = new SectorPreset("silverCrags", Planets.serpulo, 25) {{

            captureWave = 15;
            difficulty = 3;
        }};
    }
}
