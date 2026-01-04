//Without using lambda expressions, making it easier.

//Method Reference 

List<String> students = Array.asList("Ram", "Vaibhavi");
students.forEach(x -> System.out.println(x));          //This is what we usually write

students.forEach(System.out::println);                 //Here method reference is used by directly calling println method without using lambda expression

//Constructor Reference

class MobilePhone
{
    String name;

    public MobilePhone(String name)
    {
        this.name = name;
    }

    @Override
    public toString()
    {
        return name;
    }
}

List<String> names = Arrays.asList("A", "B", "C");
List<String> MobilePhoneList = names.stream()
                                    .map(x -> new MobilePhone(x))
                                    .collect(Collectors.toList());  //Here we are referring to each object in MobilePhone

List<MobilePhone> MobilePhoneList = names.stream()
                                    .map(MobilePhone::new)
                                    .collect(Collectors.toList());  //Here we are referencing constructor. new always points to constructor.

System.out.println(MobilePhoneList);  //[A, B, C]
