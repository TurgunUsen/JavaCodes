package week5.assignment;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}
