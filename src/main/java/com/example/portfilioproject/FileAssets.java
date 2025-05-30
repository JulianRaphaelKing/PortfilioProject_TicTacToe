package com.example.portfilioproject;

import javafx.scene.image.Image;

import java.util.Objects;


public class FileAssets  {

    //Logo Image
    public static Image LOGO;

    //Title Bar Buttons
    public static Image CLOSE;
    public static Image CLOSE_HOVER;
    public static Image MINIMIZE;
    public static Image MINIMIZE_HOVER;
    public static Image MUTE;
    public static Image MUTE_HOVER;

    //Menu
    public static Image MENU_BKG;
    public static Image MENU;
    public static Image MENU_HOVER;
    public static Image MENU_CLOSE;
    public static Image MENU_CLOSE_HOVER;
    public static Image RESET_SCORES;
    public static Image RESET_SCORES_HOVER;
    public static Image EXPORT_SCORES;
    public static Image EXPORT_SCORES_HOVER;
    public static Image VERSUS_COMPUTER;
    public static Image PLAYER_VERSUS_PLAYER;

    //Play Buttons
    public static Image START;
    public static Image START_HOVER;
    public static Image RESTART;
    public static Image RESTART_HOVER;

    //Grid Buttons
    public static Image X;
    public static Image O;

    //Background Images
    public static Image BACKGROUND_CLOUDS;
    public static Image BACKGROUND_CLOUDS_HOVER;
    public static Image BACKGROUND;
    public static Image BKG_CLOUDS_BLURRED;
    public static Image GRID;
    public static Image BKG_DAY;
    public static Image BKG_NIGHT;
    public static Image BKG_DRAW;

    //Text Images
    public static Image PLR_O_MSG;
    public static Image PLR_X_MSG;
    public static Image DRAW_MSG;


    /**
     * Loads all the required image assets into their respective static fields.
     * This method initializes images for buttons and backgrounds used across the application.
     *
     * The assets include:
     * - Title bar buttons: close, minimize, and mute buttons with their hover state images.
     * - Grid buttons: X and O buttons for gameplay.
     * - Background images: various background images for different states and layouts.
     *
     * The images are loaded using the relative file paths specified within the application's resource directory.
     * Each static field is assigned an Image instance corresponding to the loaded asset.
     *
     * Note: Ensure the file paths are valid and the resources exist in the specified locations.
     */

    public static void loadFiles() {
        //Title Bar Buttons
        CLOSE = loadImages("images/buttons/btnClose.png");
        CLOSE_HOVER = loadImages("images/buttons/btnCloseHover.png");
        MINIMIZE = loadImages("images/buttons/btnMin.png");
        MINIMIZE_HOVER = loadImages("images/buttons/btnMinHover.png");
        MUTE = loadImages("images/buttons/btnMute.png");
        MUTE_HOVER = loadImages("images/buttons/btnMuted.png");

        //Menu
        MENU_BKG = loadImages("images/backgrounds/MenuStageBkg.png");
        MENU = loadImages("images/buttons/btnMenu.png");
        MENU_HOVER = loadImages("images/buttons/btnMenuHover.png");
        MENU_CLOSE = loadImages("images/buttons/btnMenuClose.png");
        MENU_CLOSE_HOVER = loadImages("images/buttons/btnMenuClose_Hovered.png");
        RESET_SCORES = loadImages("images/buttons/btnResetScores.png");
        RESET_SCORES_HOVER = loadImages("images/buttons/btnResetScores_Hovered.png");
        EXPORT_SCORES = loadImages("images/buttons/btnExportScores.png");
        EXPORT_SCORES_HOVER = loadImages("images/buttons/btnExportScores_Hovered.png");
        VERSUS_COMPUTER = loadImages("images/buttons/btnVSComputer.png");
        PLAYER_VERSUS_PLAYER = loadImages("images/buttons/btnPlayerVSPlayer.png");


        //Play Buttons
        START = loadImages("images/buttons/btnStart.png");
        START_HOVER = loadImages("images/buttons/btnStartHover.png");
        RESTART = loadImages("images/buttons/btnRestart.png");
        RESTART_HOVER = loadImages("images/buttons/btnRestartHover.png");

        //Grid Buttons
        X = loadImages("images/buttons/btnX.png");
        O = loadImages("images/buttons/btnO.png");

        //Background Images
        BACKGROUND_CLOUDS = loadImages("images/backgrounds/bkgClouds.gif");
        BACKGROUND_CLOUDS_HOVER = loadImages("images/backgrounds/bkgCloudsHover.gif");
        BACKGROUND = loadImages("images/backgrounds/bkgImage675x800.png");
        BKG_CLOUDS_BLURRED = loadImages("images/backgrounds/cloudsBlurred.png");
        GRID = loadImages("images/backgrounds/Grid.png");
        BKG_DAY = loadImages("images/backgrounds/bkgDay.png");
        BKG_NIGHT = loadImages("images/backgrounds/bkgNight.png");
        BKG_DRAW = loadImages("images/backgrounds/bkgDraw.png");

        //Text Images
        PLR_O_MSG = loadImages("images/texts/plrOMsg.png");
        PLR_X_MSG = loadImages("images/texts/plrXMsg.png");
        DRAW_MSG = loadImages("images/texts/drawMsg.png");

        //Logo Image
        LOGO = loadImages("images/logo.png");
    }

    /**
     * Loads an image from the specified file path within the application's resources.
     *
     * @param path the relative path to the image file within the resources directory
     * @return the loaded Image object
     * @throws NullPointerException if the resource stream for the specified path is not found
     */
    public static Image loadImages(String path) {
        return new Image(Objects.requireNonNull(FileAssets.class.getResourceAsStream("/" + path)));
    }
}
