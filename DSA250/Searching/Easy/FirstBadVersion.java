package DSA250.Searching.Easy;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(firstBadVersion(n));
    }

    private static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid = (start + end) / 2;
        int minVersion = n;

        while (start <= end) {
            System.out.println("mid:- " + mid);
            mid = (start + end) / 2;
            if (isBadVersion(mid)) {
                System.out.println("in if");
                minVersion = Math.min(minVersion, mid);
                System.out.println("minVersion:-" + minVersion);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return minVersion;

    }

    private static boolean isBadVersion(int version) {
        if (version == 1) {
            return true;
        }
        return false;
    }

}
