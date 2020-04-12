//  1410. HTML Entity Parser

class HTMLEntityParser {

    public String entityParser(String text) {
        if (text.contains("&quot")) {
            text = text.replace("&quot;", "\"");
        }
        if (text.contains("&apos;")) {
            text = text.replace("&apos;", "'");
        }
        if (text.contains("&amp;")) {
            text = text.replace("&amp;", "&");
        }
        if (text.contains("&gt;")) {
            text = text.replace("&gt;", ">");
        }
        if (text.contains("&lt;")) {
            text = text.replace("&lt;", "<");
        }
        if (text.contains("&frasl;")) {
            text = text.replace("&frasl;", "/");
        }
        return text;
    }
}