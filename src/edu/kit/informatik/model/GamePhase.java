package edu.kit.informatik.model;

/**
 * GamePhase
 * 
 * @author uwhlp
 * @version 1.0.0
 * 
 */

public interface GamePhase {

    /**
     * Startet die Phase
     */
    void start() throws QuitException;

}