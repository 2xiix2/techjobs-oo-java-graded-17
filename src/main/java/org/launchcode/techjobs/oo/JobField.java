import java.util.Objects;

public class JobField {
        private int id;
        private static int nextId = 1;
        private String value;

        public JobField() {
            id = nextId;
            nextId++;
        }

        public JobField(String value) {
            this(); //This calling calling the empty constructor, to set the ID field of Employer obj. being created (by this contructor)
            this.value = value;
        }

        // Custom toString, equals, and hashCode methods:

        @Override //overriding inital toString
        public String toString() {
            return value;
        }

        @Override
        public boolean equals(Object o) {  // Two objects are equal if they have the same id.
            if (this == o) return true;
            if (!(o instanceof org.launchcode.techjobs.oo.Employer)) return false;
            org.launchcode.techjobs.oo.Employer employer = (org.launchcode.techjobs.oo.Employer) o;
            return getId() == employer.getId();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId());
        }

        // Getters and Setters:

        public int getId() {
            return id;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

    }



