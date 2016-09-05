package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
    private static final String PREFIX_ADD = "+";
    private static final String PREFIX_DELETE = "-";

    private Person person;
    private boolean status;
    private Tag tag;

    public Tagging(Person person, Tag tag, boolean status) {
        this.person = person;
        this.tag = tag;
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder
            .append(status ? PREFIX_ADD : PREFIX_DELETE)
            .append(person.getName())
            .append(tag.tagName);
        return builder.toString();
    }
}
