public class Token {

    private String type;
    private String value;

    public Token(String type, String value) {
        this.type = type;
        this.value = value;
    }

    /**
     * public get method which let other class could access private data number type
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * public get method which let other class could access private data number type
     * @return value
     */
    public String getValue() {
        return value;
    }

}
