package classwork_1;

public class Classwork_1 {
	public static void main(String[] args) {
		
		// 1
		 int age = 5;
		 
		 if (age >=18) {
			 System.out.println("Вы вызрослый");
		 } else {
			 System.out.println("Вы ещё ребёнок");
		 }
			 
		
		// 2
		
		 int x = 5;

		 if (x > 0) {
		     System.out.println("Положительное");
		 } else {
		     System.out.println("Отрицательное или ноль");
		 }
		
		// 3
	        int grade = 4;

	        if (grade == 5) {
	            System.out.println("Отлично");
	        } else if (grade == 4) {
	            System.out.println("Хорошо");
	        } else if (grade == 3) {
	            System.out.println("Удовлетворительно");
	        } else {
	            System.out.println("Неудовлетворительно");
	        }

	        // 4
	        int temp = 15;

	        if (temp > 25) {
	            System.out.println("Жарко");
	        } else if (temp >= 10) {
	            System.out.println("Тепло");
	        } else {
	            System.out.println("Холодно");
	        }

	        // 5
	        int day = 3;

	        switch (day) {
	            case 1: {
	                System.out.println("Понедельник");
	                break;
	            }
	            case 2: {
	                System.out.println("Вторник");
	                break;
	            }
	            case 3: {
	                System.out.println("Среда");
	                break;
	            }
	            case 4: {
	                System.out.println("Четверг");
	                break;
	            }
	            case 5: {
	                System.out.println("Пятница");
	                break;
	            }
	            case 6: {
	                System.out.println("Суббота");
	                break;
	            }
	            case 7: {
	                System.out.println("Воскресенье");
	                break;
	            }
	            default: {
	                System.out.println("Неверный номер дня");
	            }
	        }

	        // 7
	        int a = 7;
	        int b = 5;

	        if (a > b) {
	            System.out.println("Первое больше");
	        } else {
	            System.out.println("Второе не меньше");
	        }

	        // 8
	        int hour = 14;

	        if (hour >= 6 && hour <= 11) {
	            System.out.println("Утро");
	        } else if (hour >= 12 && hour <= 17) {
	            System.out.println("День");
	        } else if (hour >= 18 && hour <= 22) {
	            System.out.println("Вечер");
	        } else {
	            System.out.println("Ночь");
	        }

	        // 10
	        int x1 = 7;

	        if (x1 % 2 == 0) {
	            System.out.println("Чётное");
	        } else {
	            System.out.println("Нечётное");
	        }

	        // 12
	        int score = 82;

	        if (score >= 90) {
	            System.out.println("5");
	        } else if (score >= 75) {
	            System.out.println("4");
	        } else if (score >= 50) {
	            System.out.println("3");
	        } else {
	            System.out.println("2");
	        }

	        // 13
	        String color = "зелёный";

	        switch (color) {
	            case "красный": {
	                System.out.println("Стоять! Нельзя переходить");
	                break;
	            }
	            case "жёлтый": {
	                System.out.println("Ждать! Приготовьтесь");
	                break;
	            }
	            case "зелёный": {
	                System.out.println("Можно переходить");
	                break;
	            }
	            default: {
	                System.out.println("Неверный цвет");
	            }
	        }

	        // 14
	        int age1 = 10;

	        if (age1 < 7) {
	            System.out.println("Детский сад");
	        } else if (age1 <= 17) {
	            System.out.println("Школа");
	        } else {
	            System.out.println("Взрослый");
	        }

	        // 15
	        int quarter = 2;

	        switch (quarter) {
	            case 1: {
	                System.out.println("Первая четверть");
	                break;
	            }
	            case 2: {
	                System.out.println("Вторая четверть");
	                break;
	            }
	            case 3: {
	                System.out.println("Третья четверть");
	                break;
	            }
	            case 4: {
	                System.out.println("Четвёртая четверть");
	                break;
	            }
	            default: {
	                System.out.println("Неверный номер четверти");
	            }
	        }

	        // 16
	        int height = 175;

	        if (height < 150) {
	            System.out.println("Низкий");
	        } else if (height <= 180) {
	            System.out.println("Средний");
	        } else {
	            System.out.println("Высокий");
	        }

	        // 17
	        int points = 120;

	        if (points > 100) {
	            System.out.println("Победитель!");
	        } else {
	            System.out.println("Попробуй ещё");
	        }
	    }

	
	//18
	
	//19
	
	//20
	
	int luckyNumber = 7;
	int number1 = 5; 

	if (number == luckyNumber) {
	    System.out.println("Угадал!");
	}else {
	    System.out.println("Не угадал");
	}
	
	//21
	
	int a = 5;
	int b = 5;

	if (a == b) {
	    System.out.println("Равны");
	} else {
	    System.out.println("Разные");
	}
	
	//22
	
	int temp = 50;

	if (temp <= 0) {
	    System.out.println("Лёд");
	} else if (temp < 100) {
	    System.out.println("Вода");
	} else {
	    System.out.println("Пар");
	}
	
	//23
	
	//24
	
	int pets = 2;

	if (pets == 0) {
	    System.out.println("Нет питомцев");
	} else if (pets == 1) {
	    System.out.println("Один питомец");
	} else {
	    System.out.println("Много питомцев");
	}
	
	//25
	
	int mark = 5;

	if (mark < 4) {
	    System.out.println("Поговорим с родителями");
	} else {
	    System.out.println("Молодец");
	}
	
	
	// 26
	
	int wind = 40;

	if (wind > 50) {
	    System.out.println("Ураган");
	} else if (wind >= 30) {
	    System.out.println("Сильный ветер");
	} else {
	    System.out.println("Спокойно");
	}
	
	//27
	
	int wind1 = 40;

	if (wind1 > 50) {
	    System.out.println("Ураган");
	} else if (wind >= 30) {
	    System.out.println("Сильный ветер");
	} else {
	    System.out.println("Спокойно");
	}
	
	//28
	
	int answer = 4;

	if (answer == 4) {
	    System.out.println("Правильно!");
	} else {
	    System.out.println("Неправильно");
	}
	
	//29
	
	int size = 38;

	if (size < 35) {
	    System.out.println("Детский");
	} else if (size <= 42) {
	    System.out.println("Женский");
	} else {
	    System.out.println("Мужской");
	}
	
	//30
	
	//31
	
	int players = 3;

	if (players == 2) {
	    System.out.println("Дуэль");
	} else if (players <= 4) {
	    System.out.println("Малая команда");
	} else {
	    System.out.println("Большая команда");
	}
	
	//32
	
	int battery = 15;

	if (battery < 20) {
	    System.out.println("Заряди телефон!");
	} else {
	    System.out.println("Всё ок");
	}
	
	//33
	
	int floor = 12;

	if (floor > 10) {
	    System.out.println("Высокий этаж");
	} else {
	    System.out.println("Низкий");
	}
	
	
}
}