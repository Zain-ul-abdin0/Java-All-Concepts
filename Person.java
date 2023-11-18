class Person<T> {
    private T value;


    public T getName() {
        return value;
    }

    public void setName(T name) {
        this.value = name;
    }


    class Bad {
        private String character;

        public String getCharacter() {
            return character;
        }

        public void setCharacter(String character) {
            this.character = character;
        }
    }

}
