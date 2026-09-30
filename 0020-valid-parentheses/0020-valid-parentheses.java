class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char openingBracket = stack.pop();

                if (current == ')' && openingBracket != '(') {
                    return false;
                }

                if (current == ']' && openingBracket != '[') {
                    return false;
                }

                if (current == '}' && openingBracket != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
