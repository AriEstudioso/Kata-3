package tasks;

import model.Song;
import viewmodel.Histogram;

import java.util.List;
import java.util.function.Function;

public class HistogramBuilder {
    public <T> Histogram<T> build(List<Song> songs, Function<Song, T> classifier){
        Histogram<T> histogram = new Histogram<>();
        for (Song song : songs) histogram.put(classifier.apply(song));
        return histogram;
    }
}
