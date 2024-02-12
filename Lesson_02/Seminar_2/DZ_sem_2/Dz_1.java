package DZ_sem_2;
// Сформируйте часть WHERE этого запроса,используя StringBuilder.Данные(параметры)для фильтрации приведены в виде json-строки в примере ниже.
// Если значение null, то параметр не должен попадать в запрос.
// Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:
// String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами
// Пример: Строка sql-запроса:
// select * from students where 
// Параметры для фильтрации:
//  {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Результат:
// select * from students where name='Ivanov' and country='Russia' and city='Moscow'
class Answer {  
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(QUERY);

        String[] partofQUERY = PARAMS.split(",");
        for(int i = 0; i<partofQUERY.length; i++){
            if(!partofQUERY[i].contains("null")){
                String part = partofQUERY[i];
                part =part.replaceAll("[{\"}]", "");
                String [] partPart = part.split(":");
                stringBuilder.append(partPart[0]);
                stringBuilder.append("=");
                if(!partPart[1].matches("[0-9]*")){
                    stringBuilder.append("'");
                    stringBuilder.append(partPart[1]);
                    stringBuilder.append("'");
                }
                else{
                    stringBuilder.append(partPart[1]);
                }
                stringBuilder.append(" and");
            }
        }
        stringBuilder.delete(stringBuilder.length()-4, stringBuilder.length());

        return stringBuilder;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Dz_1{ 
	public static void main(String[] args) { 
      String QUERY = "";
      String PARAMS = "";
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        QUERY = "select * from students where ";
	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }     
      
      Answer ans = new Answer();      
      System.out.println(ans.answer(QUERY, PARAMS));
	}
}