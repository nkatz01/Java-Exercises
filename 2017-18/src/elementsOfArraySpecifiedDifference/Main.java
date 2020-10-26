package elementsOfArraySpecifiedDifference;

class Main {
    public static void main(String[] args) {
        int[] array = { -15,5};
        boolean found = false;
        int results = 0;
        int multiplied = 0;
        for (int i = 0; i < (array.length - 1); i++) {

            if ((array[i] < 0) && (array[i + 1] < 0) || (array[i] >= 0) && (array[i + 1] >= 0)) {
                if (array[i] < 0 && array[i + 1] < 0)

                {
                    if ((array[i] * -1) < (array[i + 1] * -1))
                        results = ((array[i + 1]) * -1) - ((array[i]) * -1);
                    else
                        results = ((array[i]) * -1) - ((array[i + 1]) * -1);
                }

                else if ((array[i] >= 0) && (array[i + 1] >= 0)) {
                    if (array[i] < array[i + 1])
                        results = ((array[i + 1])) - ((array[i]));
                    else
                        results = ((array[i])) - ((array[i + 1]));
                }

            }

            else {
                if (array[i] < 0 && array[i + 1] >= 0)

                    results = ((array[i]) * -1) +(array[i+1]);
                else
                    results = ((array[i])) + ((array[i + 1]) * -1);
            }
            System.out.println(results);
            if (results ==20) {
                found = true;
                System.out.println("found");
                break;
            }
        }

        if (!found)
            System.out.println("not found");

    }

}