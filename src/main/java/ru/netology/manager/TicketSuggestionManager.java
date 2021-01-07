package ru.netology.manager;

import ru.netology.domain.TicketSuggestion;
import ru.netology.repository.TicketSuggestionRepository;

public class TicketSuggestionManager {
    private TicketSuggestionRepository repository;

    public TicketSuggestionManager(TicketSuggestionRepository repository) {
        this.repository = repository;
    }

    public void add(TicketSuggestion suggestion) {
        repository.save(suggestion);

    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public TicketSuggestion[] getAll(String from, String to) {
        TicketSuggestion[] suggestions = repository.findAll();
        TicketSuggestion[] result = new TicketSuggestion[suggestions.length];
        for (int i = 0; i < result.length; i++) {
            int index = suggestions.length - i - 1;
            result[i] = suggestions[index];
        }
        return result;
    }
}
