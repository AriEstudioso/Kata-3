package io;

import model.Song;

import java.util.List;

public interface SongReader {
    List<Song> readAll();
}
