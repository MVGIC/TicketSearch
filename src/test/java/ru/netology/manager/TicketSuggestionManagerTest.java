package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.TicketSuggestion;
import ru.netology.repository.TicketSuggestionRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TicketSuggestionManagerTest {

    @Test
    public void shouldSearchOneSuggestion() {
        TicketSuggestionManager manager = new TicketSuggestionManager(new TicketSuggestionRepository());
        TicketSuggestion first = new TicketSuggestion(1, 10000, "KJA", "LED", 300);
        TicketSuggestion second = new TicketSuggestion(2, 10000, "LED", "KJA", 300);
        TicketSuggestion third = new TicketSuggestion(3, 5000, "SVO", "KUF", 120);
        TicketSuggestion fourth = new TicketSuggestion(4, 7000, "SVO", "KZN", 120);
        TicketSuggestion fifth = new TicketSuggestion(5, 6000, "LED", "KGD", 120);
        TicketSuggestion sixth = new TicketSuggestion(6, 6000, "KGD", "LED", 120);
        TicketSuggestion seventh = new TicketSuggestion(7, 12000, "GDX", "PKC", 180);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        manager.getAll("GDX", "SVO");

        TicketSuggestion[] actual = manager.getAll("GDX", "SVO");
        TicketSuggestion[] expected = new TicketSuggestion[]{seventh};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchTwoSuggestions() {
        TicketSuggestionManager manager = new TicketSuggestionManager(new TicketSuggestionRepository());
        TicketSuggestion first = new TicketSuggestion(1, 10000, "KJA", "LED", 300);
        TicketSuggestion second = new TicketSuggestion(2, 10000, "LED", "KJA", 300);
        TicketSuggestion third = new TicketSuggestion(3, 5000, "SVO", "KUF", 120);
        TicketSuggestion fourth = new TicketSuggestion(4, 7000, "SVO", "KZN", 120);
        TicketSuggestion fifth = new TicketSuggestion(5, 6000, "LED", "KGD", 120);
        TicketSuggestion sixth = new TicketSuggestion(6, 6000, "KGD", "LED", 120);
        TicketSuggestion seventh = new TicketSuggestion(7, 12000, "GDX", "PKC", 180);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        manager.getAll("KJA", "LED");

        TicketSuggestion[] actual = manager.getAll("KJA", "LED");
        TicketSuggestion[] expected = new TicketSuggestion[]{sixth, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchThreeSuggestions() {
        TicketSuggestionManager manager = new TicketSuggestionManager(new TicketSuggestionRepository());
        TicketSuggestion first = new TicketSuggestion(1, 10000, "KJA", "LED", 300);
        TicketSuggestion second = new TicketSuggestion(2, 10000, "LED", "KJA", 300);
        TicketSuggestion third = new TicketSuggestion(3, 5000, "SVO", "KUF", 120);
        TicketSuggestion fourth = new TicketSuggestion(4, 7000, "SVO", "KZN", 120);
        TicketSuggestion fifth = new TicketSuggestion(5, 6000, "LED", "KGD", 120);
        TicketSuggestion sixth = new TicketSuggestion(6, 6000, "KGD", "LED", 120);
        TicketSuggestion seventh = new TicketSuggestion(7, 12000, "GDX", "PKC", 180);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        manager.getAll("SVO", "PKC");

        TicketSuggestion[] actual = manager.getAll("SVO", "PKC");
        TicketSuggestion[] expected = new TicketSuggestion[]{third, fourth, seventh};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchZeroSuggestions() {
        TicketSuggestionManager manager = new TicketSuggestionManager(new TicketSuggestionRepository());
        TicketSuggestion first = new TicketSuggestion(1, 10000, "KJA", "LED", 300);
        TicketSuggestion second = new TicketSuggestion(2, 10000, "LED", "KJA", 300);
        TicketSuggestion third = new TicketSuggestion(3, 5000, "SVO", "KUF", 120);
        TicketSuggestion fourth = new TicketSuggestion(4, 7000, "SVO", "KZN", 120);
        TicketSuggestion fifth = new TicketSuggestion(5, 6000, "LED", "KGD", 120);
        TicketSuggestion sixth = new TicketSuggestion(6, 6000, "KGD", "LED", 120);
        TicketSuggestion seventh = new TicketSuggestion(7, 12000, "GDX", "PKC", 180);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        manager.getAll("VKO", "VKO");

        TicketSuggestion[] actual = manager.getAll("VKO", "VKO");
        TicketSuggestion[] expected = new TicketSuggestion[0];

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchFourSuggestions() {
        TicketSuggestionManager manager = new TicketSuggestionManager(new TicketSuggestionRepository());
        TicketSuggestion first = new TicketSuggestion(1, 10000, "KJA", "LED", 300);
        TicketSuggestion second = new TicketSuggestion(2, 10000, "LED", "KJA", 300);
        TicketSuggestion third = new TicketSuggestion(3, 5000, "SVO", "KUF", 120);
        TicketSuggestion fourth = new TicketSuggestion(4, 7000, "SVO", "KZN", 120);
        TicketSuggestion fifth = new TicketSuggestion(5, 6000, "LED", "KGD", 120);
        TicketSuggestion sixth = new TicketSuggestion(6, 6000, "KGD", "LED", 120);
        TicketSuggestion seventh = new TicketSuggestion(7, 12000, "GDX", "PKC", 180);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        manager.getAll("LED", "LED");

        TicketSuggestion[] actual = manager.getAll("LED", "LED");
        TicketSuggestion[] expected = new TicketSuggestion[]{fifth, sixth, first, second};

        assertArrayEquals(expected, actual);
    }
}