package ru.netology.repository;

import ru.netology.domain.TicketSuggestion;

public class TicketSuggestionRepository {

private TicketSuggestion[] suggestions = new TicketSuggestion[0];


    public void save(TicketSuggestion suggestion) {
        int length = suggestions.length + 1;
        TicketSuggestion[] tmp = new TicketSuggestion[length];
        System.arraycopy(suggestions, 0, tmp, 0, suggestions.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = suggestion;
        suggestions = tmp;
    }

    public TicketSuggestion[] findAll() {
        return suggestions;
    }

    public void removeById(int id) {
        int length = suggestions.length - 1;
        TicketSuggestion[] tmp = new TicketSuggestion[length];
        int index = 0;
        for (TicketSuggestion suggestion : suggestions) {
            if (suggestion.getId() != id) {
                tmp[index] = suggestion;
                index++;
            }
        }
        suggestions = tmp;
    }
}
