package com.iicind.audiomod.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by dinesh_ch on 7/8/2016.
 */

@Entity
public class Player
{
    @Id
    private Integer audioId;
    private String userRecording;
    private String topicName;
    private String trackLength;
    private String reference;
    private String comments;
    private String source;
    private String action;

    public Integer getAudioId() {
        return audioId;
    }

    public void setAudioId(Integer audioId) {
        this.audioId = audioId;
    }

    public String getUserRecording() {
        return userRecording;
    }

    public void setUserRecording(String userRecording) {
        this.userRecording = userRecording;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(String trackLength) {
        this.trackLength = trackLength;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Player() {
    }

    public Player(Integer audioId, String userRecording, String topicName, String trackLength, String reference, String comments, String source, String action) {
        this.audioId = audioId;
        this.userRecording = userRecording;
        this.topicName = topicName;
        this.trackLength = trackLength;
        this.reference = reference;
        this.comments = comments;
        this.source = source;
        this.action = action;
    }

    @Override
    public String toString() {
        return "Player{" +
                "audioId=" + audioId +
                ", userRecording='" + userRecording + '\'' +
                ", topicName='" + topicName + '\'' +
                ", trackLength='" + trackLength + '\'' +
                ", reference='" + reference + '\'' +
                ", comments='" + comments + '\'' +
                ", source='" + source + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
