import com.ifsygn.util.array.ArrayUtil;

public class App {
    public static void main(String[] args)
    {
        RandomNumbersGenerator rng = new RandomNumbersGenerator(10, 10, 21);

        System.out.println(rng.toString());

        int [] a = rng.getNumbers();

        for (int i = 0; i < a.length; ++i)
            a[i] *= 2;

        System.out.println(rng.toString());
    }
}

class RandomNumbersGenerator {
    private int [] m_numbers;

    public RandomNumbersGenerator(int n, int min,  int max)
    {
        m_numbers = ArrayUtil.getRandomArray(n, min, max);
    }

    public int getNumber(int index)
    {
        return m_numbers[index];
    }

    public int [] getNumbers() //dizi referansı
    {
        return m_numbers;
    }

    public String toString()
    {
        String result = "[";

        for (int val : m_numbers) {
            if (result.length() != 1)
                result += ", ";

            result += val;
        }

        return result + "]";
    }
}