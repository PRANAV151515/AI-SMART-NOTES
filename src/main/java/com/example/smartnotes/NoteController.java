package com.example.smartnotes;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    private final NoteRepository repo;
    private final AiService aiService;

    public NoteController(NoteRepository repo, AiService aiService) {
        this.repo = repo;
        this.aiService = aiService;
    }

    @GetMapping
    public List<Note> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Note create(@RequestBody Note note) {
        return repo.save(note);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }

    @PostMapping("/{id}/summarize")
    public Note summarize(@PathVariable Long id) {
        Note note = repo.findById(id).orElseThrow();
        note.setSummary(aiService.summarize(note.getContent()));
        return repo.save(note);
    }
}

