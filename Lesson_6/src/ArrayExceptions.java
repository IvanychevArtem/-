class ArrayException {

    public static void twoDimensionalArray(String[][] twomas) throws MyArrayDataException, MyArraySizeExceptoin {
        for (int i = 0; i < twomas.length; i++) {
                if (twomas.length != 4) {
                    throw new MyArraySizeExceptoin("Массив неправильного размера");
                }
                if (twomas[i].length != 4) {
                    throw new MyArraySizeExceptoin("Массив неправильного размера");
                }

        }
        int sum = 0;
        for (int i = 0; i < twomas.length; i++) {
            for (int j = 0; j < twomas[i].length; j++) {
                try {
                    sum += Integer.parseInt(twomas[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неправильное значение " + "'" + twomas[i][j] + "'" + " в элементе: (" + i + "," + j + ")");
                }
            }
        }
        System.out.println("Array sum is: " + sum);


    }
}


