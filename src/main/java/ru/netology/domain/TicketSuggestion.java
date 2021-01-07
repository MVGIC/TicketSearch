package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TicketSuggestion implements Comparable<TicketSuggestion> {
    private int id;
    private int cost;
    private String from;
    private String to;
    private int time;

    @Override
    public int compareTo(TicketSuggestion o) {
        return cost - o.cost;
    }
}
