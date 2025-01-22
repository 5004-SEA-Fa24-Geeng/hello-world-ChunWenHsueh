package student;

/**
 * The greeting class stores the locality ID, locality name, and a string format of the greeting both ascii and unicode.
 */
public class Greeting {
    private int localityID;
    private String localityName;
    private String asciiGreeting;
    private String unicodeGreeting;
    private String formatStr;

    /**
     * Default greeting that creates "Hello, {name}!".
     * @param localityID id of the locality
     * @param localityName name of the locality
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    /**
     * Greeting that creates a greeting with ascii and unicode characters assuming the language is already using ascii letters only. It also assumes the format of the greeting to be "{greeting}, {name}!"
     * @param localityID id of the locality
     * @param localityName name of the locality
     * @param greeting greeting using ascii characters
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    /**
     * Greeting that creates a greeting with ascii and unicode characters. It makes no assumptions and everything needs to be provided.
     * @param localityID id of the locality
     * @param localityName name of the locality
     * @param asciiGreeting greeting using ascii characters
     * @param unicodeGreeting greeting using unicode characters
     * @param formatStr format string for the greeting
     */
    public Greeting(int localityID, String localityName, String asciiGreeting, 
                    String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Returns the locality id number.
     * @return the locality id number
     */
    public int getLocalityID() {
        return localityID;
    }

    /**
     * Returns the locality name.
     * @return the locality name
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * Returns the ascii greeting. Just the greeting, no formatting.
     * @return the ascii greeting
     */
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    /**
     * Returns the unicode greeting. Just the greeting, no formatting.
     * @return the unicode greeting
     */
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    /**
     * Gets the unicode format string. This string will have a %s, so that the name can be inserted into the greeting in the correct location.
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr() {
        return String.format(formatStr, unicodeGreeting);
    }

    /**
     * Returns the format string with the greeting inserted into the format. This string will have a %s, so that the name can be inserted into the greeting in the correct location.
     * @param asciiOnly if true, only ascii characters will be used
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr(boolean asciiOnly) {
        return String.format(formatStr, asciiOnly ? asciiGreeting : unicodeGreeting);
    }

    /**
     * Returns the full greeting details as a string. Primarily for debugging purposes.
     * @return the full greeting details as a string
     */
    @Override
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}", 
            localityID, localityName, asciiGreeting, unicodeGreeting);
    }
}
