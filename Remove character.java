        // Code to remove characters from string1 that are present in string2
        boolean[] shouldRemove = new boolean[26]; // Assuming lowercase characters only

        // Mark characters from string2 to be removed
        for (char ch : string2.toCharArray()) {
            shouldRemove[ch - 'a'] = true;
        }

        StringBuilder result = new StringBuilder();

        // Append characters from string1 that are not marked for removal
        for (char ch : string1.toCharArray()) {
            if (!shouldRemove[ch - 'a']) {
                result.append(ch);
            }
        }

        return result.toString();
