package com.example.secondassisgnment;

public class PresidentsInfo {
    private String Name;
    private String Description;
    private int Thumbnail;

    public PresidentsInfo() {

    }
    public PresidentsInfo(String name, String description, int thumbnail) {
        Name = name;
        Description = description;
        Thumbnail = thumbnail;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}

