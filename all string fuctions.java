public class StringFunctionsDemo {
    public static void main(String[] args) {
        String str = " Hello World ";
        String str2 = "Java";
        String str3 = "hello world";

        System.out.println("Original String: \"" + str + "\"");

        // 1. length()
        System.out.println("1. length(): " + str.length());

        // 2. charAt()
        System.out.println("2. charAt(1): " + str.charAt(1));

        // 3. substring()
        System.out.println("3. substring(1, 6): " + str.substring(1, 6));

        // 4. equals()
        System.out.println("4. equals(\" Hello World \"): " + str.equals(" Hello World "));

        // 5. equalsIgnoreCase()
        System.out.println("5. equalsIgnoreCase(str3): " + str.trim().equalsIgnoreCase(str3));

        // 6. compareTo()
        System.out.println("6. compareTo(str2): " + str.trim().compareTo(str2));

        // 7. compareToIgnoreCase()
        System.out.println("7. compareToIgnoreCase(str3): " + str.trim().compareToIgnoreCase(str3));

        // 8. concat()
        System.out.println("8. concat(): " + str.concat(str2));

        // 9. contains()
        System.out.println("9. contains(\"World\"): " + str.contains("World"));

        // 10. startsWith()
        System.out.println("10. startsWith(\" He\"): " + str.startsWith(" He"));

        // 11. endsWith()
        System.out.println("11. endsWith(\"ld \"): " + str.endsWith("ld "));

        // 12. indexOf()
        System.out.println("12. indexOf(\"o\"): " + str.indexOf("o"));

        // 13. lastIndexOf()
        System.out.println("13. lastIndexOf(\"o\"): " + str.lastIndexOf("o"));

        // 14. isEmpty()
        System.out.println("14. isEmpty(): " + str.isEmpty());

        // 15. trim()
        System.out.println("15. trim(): \"" + str.trim() + "\"");

        // 16. toUpperCase()
        System.out.println("16. toUpperCase(): " + str.toUpperCase());

        // 17. toLowerCase()
        System.out.println("17. toLowerCase(): " + str.toLowerCase());

        // 18. replace()
        System.out.println("18. replace('l','x'): " + str.replace('l', 'x'));

        // 19. replaceAll() (uses regex)
        System.out.println("19. replaceAll(\"\\\\s+\", \"-\"): " + str.replaceAll("\\s+", "-"));

        // 20. replaceFirst()
        System.out.println("20. replaceFirst(\"o\", \"0\"): " + str.replaceFirst("o", "0"));

        // 21. matches() (regex)
        System.out.println("21. matches(\".*World.*\"): " + str.matches(".*World.*"));

        // 22. split()
        String[] parts = str.trim().split(" ");
        System.out.print("22. split(\" \"): ");
        for (String p : parts) {
            System.out.print(p + " ");
        }
        System.out.println();

        // 23. toCharArray()
        char[] chars = str.toCharArray();
        System.out.print("23. toCharArray(): ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 24. format()
        String formatted = String.format("24. format(): Name: %s, Age: %d", "Manav", 17);
        System.out.println(formatted);

        // 25. valueOf()
        int num = 100;
        System.out.println("25. valueOf(100): " + String.valueOf(num));

        // 26. join()
        String joined = String.join("-", "Java", "Python", "C++");
        System.out.println("26. join(): " + joined);

        // 27. repeat() (Java 11+)
        System.out.println("27. repeat(3): " + str2.repeat(3));

        // 28. strip(), stripLeading(), stripTrailing() (Java 11+)
        System.out.println("28. strip(): \"" + str.strip() + "\"");
        System.out.println("28. stripLeading(): \"" + str.stripLeading() + "\"");
        System.out.println("28. stripTrailing(): \"" + str.stripTrailing() + "\"");

        // 29. intern()
        String s1 = new String("Java");
        String s2 = "Java";
        System.out.println("29. intern(): " + (s1.intern() == s2));

        // 30. compareTo() with lexicographical order example
        System.out.println("30. compareTo(\"Apple\"): " + str2.compareTo("Apple"));

        // 31. subSequence()
        System.out.println("31. subSequence(0,4): " + str2.subSequence(0, 4));

        // 32. codePointAt()
        System.out.println("32. codePointAt(0): " + str2.codePointAt(0));

        // 33. codePointCount()
        System.out.println("33. codePointCount(0, str2.length()): " + str2.codePointCount(0, str2.length()));

        // 34. offsetByCodePoints()
        int index = str2.offsetByCodePoints(0, 2);
        System.out.println("34. offsetByCodePoints(0,2): Index = " + index);

        // 35. getBytes()
        byte[] bytes = str2.getBytes();
        System.out.print("35. getBytes(): ");
        for (byte b : bytes) System.out.print(b + " ");
        System.out.println();

        // 36. getChars()
        char[] charArray = new char[4];
        str2.getChars(0, 4, charArray, 0);
        System.out.print("36. getChars(): ");
        for (char c : charArray) System.out.print(c + " ");
        System.out.println();

        // 37. compareToIgnoreCase()
        System.out.println("37. compareToIgnoreCase(\"java\"): " + str2.compareToIgnoreCase("java"));

        // 38. startsWith() at offset
        System.out.println("38. startsWith(\"ava\",1): " + str2.startsWith("ava", 1));
    }
}
