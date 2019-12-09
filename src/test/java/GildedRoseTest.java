import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void normal_item_decreases_quality_as_day_passes() {
        Item[] items = {new Item("an_item", 10, 10)};
        final GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(10, gildedRose.items[0].sellIn);
        assertEquals(10, gildedRose.items[0].quality);
    }

}