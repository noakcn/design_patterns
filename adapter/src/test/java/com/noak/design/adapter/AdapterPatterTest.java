package com.noak.design.adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * @author yeww
 * @since 2018-07-04
 */
public class AdapterPatterTest  {
    private Map<String,Object> beans;

    private static final String FISHING_BEAN = "fisher";

    private static final String ROWING_BEAN = "captain";

    @BeforeEach
    public void setup(){
        beans = new HashMap<>();

        FishingBoatAdapter fishingBoatAdapter = spy(new FishingBoatAdapter());
        beans.put(FISHING_BEAN ,fishingBoatAdapter);

        Caption caption = new Caption((FishingBoatAdapter) beans.get(FISHING_BEAN));
        beans.put(ROWING_BEAN, caption);
    }

    @Test
    public void testAdapter(){
        Caption caption = (Caption) beans.get(ROWING_BEAN);
        caption.row();

        RowingBoat adapter = (RowingBoat) beans.get(FISHING_BEAN);
        verify(adapter).row();
    }
}
