<b>Salary Calculator</b> <br> <br>

Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf. 
Bu sınıf 4 nitelik ve 5 metoda sahip. <br>

Sınıfın Nitelikleri <br>
- name : Çalışanın adı ve soyadı <br>
- salary : Çalışanın maaşı <br>
- workHours : Haftalık çalışma saati <br>
- hireYear : İşe başlangıç yılı <br>
 
Sınıfın Metotları <br>
- Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alır. <br>
- tax() : Maaşa uygulanan vergiyi hesaplar. <br>
- Çalışanın maaşı 1000 TL'den az ise vergi uygular. <br>
- Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygular. <br>
- bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus
ücretleri hesaplar. <br>
- raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplar. Şuan ki yıl 2021 olarak alınır. <br>
- Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılır. <br>
- Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılır. <br>
- Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılır. <br>
- toString() : Çalışana ait bilgileri ekrana bastırır. <br>
Notlar <br>
- raiseSalary() hesaplanırken vergi ve bonuslar da dahil edilir. <br>
- tax() fonksiyonu ile sadece salary’i uygulanan vergi hesaplanır. <br>
- Toplam maaş: çalışanın kendi maaşı + bonus şeklinde hesaplanır. <br>
- Vergi ve bonuslarla birlikte maaş için: vergi, bonus ve çalışanın kendi maaşı ile bulunur. <br> <br>

Örnek çıktı: <br>

![SalaryCalculator](https://user-images.githubusercontent.com/69324129/202780893-352fef6e-353f-4f3d-8e2c-9b3efa009e08.png)
