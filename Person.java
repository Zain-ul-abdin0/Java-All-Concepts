 class Person<T> {
    private T value;
    private Integer age;

    public static void print(){
        System.out.println("Static Function");
    }
    public T getName() {
        return value;
    }

    public void setName(T name) {
        this.value = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
