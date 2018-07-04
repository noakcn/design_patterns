package com.noak.design.adapter;

import lombok.Setter;

/**
 * @author yeww
 * @since 2018-07-04
 */
public class Caption {

    @Setter
    private RowingBoat rowingBoat;

    public Caption(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }


    public void row(){
        rowingBoat.row();
    }
}
