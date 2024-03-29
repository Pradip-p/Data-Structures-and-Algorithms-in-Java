public class HollowArray {

	public static void main(String[] args) {
		// int[] arr = { 1, 2, 4, 0, 0, 0, 3, 4, 5 };
		// System.out.println(isHollow(arr)); // 1

		// int[] arr2 = { 1, 2, 0, 0, 0, 3, 4, 5 };
		// System.out.println(isHollow(arr2)); // 0

		// int[] arr3 = { 1, 2, 4, 9, 0, 0, 0, 3, 4, 5 };
		// System.out.println(isHollow(arr3)); // 0

		// int[] arr4 = { 1, 2, 0, 0, 3, 4 };
		// System.out.println(isHollow(arr4)); // 0

        int[] arr5 = {1, 2, 0, 0, 0, 3, 4};
        System.out.println(isHollow(arr5)); 
	}

	// O(N) Time | O(1) Space
	static int isHollow(int[] arr) {
		int result = 0;

		int zeroCount = 0;
		int startZeroIndex = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zeroCount++;

				if (startZeroIndex == -1)
					startZeroIndex = i;
                    System.out.println(startZeroIndex);
			}
		}
        // System.out.println(startZeroIndex);

		if (zeroCount < 3)
			return 0;

		int precedingCount = startZeroIndex;
		int followingCount = arr.length - precedingCount - zeroCount;

		// result = precedingCount == zeroCount && zeroCount == followingCount ? 1 : 0;
		result = precedingCount == followingCount ? 1 : 0;

		return result;
	}
}