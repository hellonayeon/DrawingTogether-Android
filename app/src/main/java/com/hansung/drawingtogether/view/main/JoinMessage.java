package com.hansung.drawingtogether.view.main;

import com.hansung.drawingtogether.data.remote.model.User;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
public class JoinMessage {
    private String name;
    private float drawnCanvasWidth;
    private float drawnCanvasHeight;

    public JoinMessage(String name, float drawnCanvasWidth, float drawnCanvasHeight) {
        this.name = name;

        this.drawnCanvasWidth = drawnCanvasWidth;
        this.drawnCanvasHeight = drawnCanvasHeight;
    }
}