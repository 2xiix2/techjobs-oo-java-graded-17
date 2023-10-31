package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
        private final int id;
        private static int nextId = 1;
        private String value;

        public JobField() {
            id = nextId;
            nextId++;
        }

        public JobField(String value) {
            this(); //This line of code is calling the empty constructor, to set the ID field of Employer obj. being created (by this constructor)
            this.value = value;
        }

        // Custom toString, equals, and hashCode methods:

        @Override //overriding initial toString
        public String toString() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof JobField jobField)) return false;
            return id == jobField.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
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



