import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

  /**
   * Get IP address from text.
   * @param text text to parse
   * @return String with IP address
   */
  public static String getIpAddress(String text) {
    String result = "";
    String findIpAddress = "(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.(25[0-5]|1[0-9][0-9]|2[0-4][0-9]|[0-9]|[1-9][0-9]))";
    Pattern pattern = Pattern.compile(findIpAddress);
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      result = matcher.group();
    }

    return result;
  }
}