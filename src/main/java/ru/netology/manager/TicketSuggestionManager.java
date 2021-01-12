package ru.netology.manager;

import ru.netology.domain.TicketSuggestion;
import ru.netology.repository.TicketSuggestionRepository;

import java.util.Arrays;

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
        TicketSuggestion[] result = new TicketSuggestion[0];
        for (TicketSuggestion suggestion : repository.findAll()) {
            if (matches(suggestion, from, to)) {
                TicketSuggestion[] tmp = new TicketSuggestion[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = suggestion;
                result = tmp;
                Arrays.sort(result);
            }
        }
        return result;
    }

    public boolean matches(TicketSuggestion suggestion, String from, String to) {

        if (suggestion.getFrom().equalsIgnoreCase(from)) {
            return true;
        }
        if (suggestion.getTo().equalsIgnoreCase(to)) {
            return true;
        }
        return false;
    }
}