package app;

import io.CSVSongParser;
import io.CSVSongReader;
import model.Song;
import tasks.HistogramBuilder;
import viewmodel.Histogram;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Song> songs = new CSVSongReader(CSVSongParser::parse).readAll();
        Histogram<String> artistsHistogram = new HistogramBuilder().build(songs, Song::artist);
        for(String bin: artistsHistogram) System.out.println(bin + ": " + artistsHistogram.count(bin));
    }
}
