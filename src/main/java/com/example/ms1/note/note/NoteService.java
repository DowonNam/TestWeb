package com.example.ms1.note.note;

import com.example.ms1.Notebook.NotebookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class NoteService {
    private final NoteRepository noteRepository;

    public Note saveDefault(){
        Note note = new Note();
        note.setTitle("새로운 노트");
        note.setContent("빈 내용");
        note.setCreateDate(LocalDateTime.now());

        return noteRepository.save(note);
    }
}
