import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Party {

    private List<Character> members = new ArrayList<>();

    public void addMember(Character character) {
        members.add(character);
    }

    public List<Character> getAliveMembers() {
        return members.stream()
                .filter(Character::isAlive)
                .collect(Collectors.toList());
    }

    public void removeDeadMembers() {
        Iterator<Character> iterator = members.iterator();

        while (iterator.hasNext()) {
            Character character = iterator.next();

            if (!character.isAlive()) {
                iterator.remove();
            }
        }
    }

    public int size() {
        return members.size();
    }
}