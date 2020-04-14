package main.java.com.agendize.android.blackjack.game;

public void shuffleCards() {
        Collections.shuffle(cards, new Random());
        currentCard = 0; // Prochaine carte à prendre sera la première du tas
        }
public Card getNextCard() {
        Card card = cards.get(currentCard);
        currentCard++;  // 1 carte a été prise prendre la suivante la prochaine fois
        return card;
        }
public Deck() {
        cards = new ArrayList<>(52);
        for (Card..Rank rank : Card.Rank.values()) {
        for (Card.Suit suit : Card.Suit.values()) {
        cards.add(new Card(rank, suit));
        }
        }
        shuffleCards();
        }
