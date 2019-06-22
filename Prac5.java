package practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Prac5 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Prac5 sol = new Prac5();
		List<List<Integer>> FinalSolution = new LinkedList<List<Integer>>();
		FinalSolution = sol.getIdPairsForOptimal(Arrays.asList(Arrays.asList(1, 2000), Arrays.asList(2, 4000), Arrays.asList(3, 6000))
				,Arrays.asList(Arrays.asList(1, 2000)),7000);
			System.out.println(FinalSolution);
	}

	public static List<List<Integer>> getIdPairsForOptimal(List<List<Integer>> forwardList,
			List<List<Integer>> backwardList, int maxDistance) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		forwardList = forwardList.stream().sorted((x1, x2) -> Integer.compare(x2.get(1), x1.get(1)))
				.collect(Collectors.toList());
		backwardList = backwardList.stream().sorted((x1, x2) -> Integer.compare(x1.get(1), x2.get(1)))
				.collect(Collectors.toList());
		int maxDist = maxDistance;
		while (true) {
			for (List<Integer> l : forwardList) {
				for (List<Integer> b : backwardList) {
					int forward = l.get(1);
					int backward = b.get(1);
					int tot = (forward + backward);
					if (tot > maxDist) {
						break;
					}
					if (tot == maxDist) {
						// print the pair of Id and optimum distance
						result.add(Arrays.asList(l.get(0), b.get(0)));
						break;
					}

				}
			}
			if (result.size() > 0) {
				break;
			}
			maxDist--;
		}
		return result;
	}

}
