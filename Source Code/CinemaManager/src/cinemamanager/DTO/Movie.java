/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.DTO;

import java.util.Date;

/**
 *
 * @author Totoro
 */
public class Movie {

    private Integer ID;
    private String Name;
    private Date StartDate;
    private String Description;
    private String Style;
    private Integer Time;
    private String Language;
    private String Rating;
    private String Poster;
    private Integer Status;

    public Movie() {

    }

    public Movie(Integer ID, String Name, Date StartDate, String Description, String Style, Integer Time, String Language, String Rating, String Poster, Integer Status) {
        this.ID = ID;
        this.Name = Name;
        this.StartDate = StartDate;
        this.Description = Description;
        this.Style = Style;
        this.Time = Time;
        this.Language = Language;
        this.Rating = Rating;
        this.Poster = Poster;
        this.Status = Status;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String Style) {
        this.Style = Style;
    }

    public Integer getTime() {
        return Time;
    }

    public void setTime(Integer Time) {
        this.Time = Time;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    public String getPoster() {
        return Poster;
    }

    public void setPoster(String Poster) {
        this.Poster = Poster;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }
}
