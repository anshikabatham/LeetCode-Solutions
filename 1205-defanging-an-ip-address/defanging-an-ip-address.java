
class Solution {
    public String defangIPaddr(String address) {
        // Replaces all occurrences of "." with "[.]"
        return address.replace(".", "[.]");
    }
}