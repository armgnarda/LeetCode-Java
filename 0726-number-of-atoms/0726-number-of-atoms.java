class Solution {
    public String countOfAtoms(String formula) {
        Stack<Map<String, Integer>> stack = new Stack<>();
        stack.push(new HashMap<>());
        int i = 0, n = formula.length();
        while (i < n) {
            if (formula.charAt(i) == '(') {
                stack.push(new HashMap<>());
                i++;
            } else if (formula.charAt(i) == ')') {
                Map<String, Integer> top = stack.pop();
                i++;
                int start = i, count = 1;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                if (i > start) count = Integer.parseInt(formula.substring(start, i));
                for (String key : top.keySet()) {
                    int val = top.get(key);
                    stack.peek().put(key, stack.peek().getOrDefault(key, 0) + val * count);
                }
            } else {
                int start = i;
                i++;
                while (i < n && Character.isLowerCase(formula.charAt(i))) i++;
                String name = formula.substring(start, i);
                start = i;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                int count = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;
                stack.peek().put(name, stack.peek().getOrDefault(name, 0) + count);
            }
        }
        Map<String, Integer> map = stack.pop();
        StringBuilder sb = new StringBuilder();
        for (String name : map.keySet().stream().sorted().toArray(String[]::new)) {
            sb.append(name);
            int count = map.get(name);
            if (count > 1) sb.append(count);
        }
        return sb.toString();
    }
}