package demo.models;


import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
@NonNull
public class Books {
    private int id;
    public String Name;
    public String Author;
    public String Genre;
    public String Publisher;
    public int Year;
}
