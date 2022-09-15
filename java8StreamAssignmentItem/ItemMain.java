package java8StreamAssignmentItem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

public class ItemMain {
	public static void main(String[] args) {

		List<ItemStream> l = new ArrayList<>();
		l.add(new ItemStream(101, "kitkat", LocalDateTime.of(2022, 4, 23, 4, 30), LocalDateTime.of(2023, 4, 23, 4, 30),
				2000));
		l.add(new ItemStream(102, "marigold", LocalDateTime.of(2020, 5, 20, 8, 00),
				LocalDateTime.of(2021, 5, 20, 8, 00), 4000));
		l.add(new ItemStream(103, "pearl", LocalDateTime.of(2021, 7, 21, 7, 20), LocalDateTime.of(2022, 7, 21, 7, 20),
				8000));
		l.add(new ItemStream(104, "Bourbun", LocalDateTime.of(2019, 9, 12, 6, 37), LocalDateTime.of(2020, 9, 12, 6, 37),
				3000));
		l.add(new ItemStream(105, "DairyMilk", LocalDateTime.of(2019, 9, 12, 6, 37),
				LocalDateTime.of(2020, 9, 12, 6, 37), 3000));
		l.add(new ItemStream(106, "laptop", LocalDateTime.of(2019, 9, 12, 6, 37), null, 10000));

		System.out.println("Find average of the given price of item");

		float price = (float) l.stream().mapToDouble(ItemStream::getPrice).average().orElse(Double.NaN);
		System.out.println(price);

		System.out.println("Find the highest price of the given item");

		ItemStream max = l.stream().map(v -> v).max(Comparator.comparing(ItemStream::getPrice))
				.orElseThrow(NoSuchElementException::new);
		System.out.println(max);

		System.out.println("Find the lowest price of the given item");

		ItemStream min = l.stream().map(v -> v).min(Comparator.comparing(ItemStream::getPrice))
				.orElseThrow(NoSuchElementException::new);
		System.out.println(min);

		System.out.println("Find the item thoes have not Expiry date");

		List<ItemStream> list = l.stream().filter(v -> v.getDoe() == null).collect(Collectors.toList());
		System.out.println(list);

		System.out.println("store the name and price from list to set");

		Set<ItemStream> value = l.stream().map(a -> new ItemStream(a.getIname(), a.getPrice()))
				.collect(Collectors.toSet());
		for (ItemStream i : value) {
			System.out.println(i.getIname() + " " + i.getPrice());
		}

		System.out.println("remove duplicate price from list of item");

		l.stream().map(s -> s.getPrice()).distinct().forEach(System.out::println);
	}

}
