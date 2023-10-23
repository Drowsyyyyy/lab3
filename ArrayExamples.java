

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int[] keep = new int[arr.length];

    for(int i = 0; i<arr.length; i++) {
      keep[i] = arr[i];
    }

    for(int i = 0; i < arr.length; i += 1) {

      arr[i] = keep[arr.length - i - 1];
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] keep = new int[arr.length];
    
    for(int i = 0; i<arr.length; i++) {
      keep[i] = arr[i];
    }
    for(int i = 0; i < arr.length; i += 1) {
      keep[i] = arr[arr.length - i - 1];
    }
    return keep;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    for(int i = 0; i<arr.length; i++) {
      for(int j = i+1; j<arr.length; j++) {
        double temp = 0.0;
        if(arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    double sum = 0;
    for(double num: arr) {
      sum += num;
    }
    sum -= arr[0];
    return sum / (arr.length - 1);
  }


}

