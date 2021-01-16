package com.example.lawnmower;

import android.widget.ImageView;

/**
 * Updates the ui and set imageview on "MeinMaeher" if lawnmower status is channged
 */
public class StatusViewHandler extends Thread {
    public ImageView MowingStatusView;

    public StatusViewHandler(ImageView MowingStatusView) {
        this.MowingStatusView = MowingStatusView;
    }

    /*
     * Set suitable imageResource of the status
     * Updates ui via setVibility
     */
    public void setView(int imgageResource) {
        this.MowingStatusView.setVisibility(MowingStatusView.GONE);
        this.MowingStatusView.setImageResource(imgageResource);
        MowingStatusView.setVisibility(MowingStatusView.VISIBLE);
    }

}