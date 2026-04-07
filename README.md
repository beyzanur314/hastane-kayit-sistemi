# 🏥 Hastane Kayıt Sistemi (HKS) - Spring Boot & MSSQL

Bu proje, hastaların online olarak randevu alabilmesini sağlayan, Full-Stack bir web uygulamasıdır. Katmanlı mimari (Layered Architecture) kullanılarak geliştirilmiştir.

## 🚀 Özellikler
- **Kullanıcı Yönetimi:** TC Kimlik No ve Şifre ile güvenli giriş ve yeni hasta kaydı.
- **Dinamik Randevu Sistemi:** Şehir -> İlçe -> Hastane hiyerarşisine göre filtreleme.
- **Canlı Veri:** Backend'den (Spring Boot) Fetch API ile çekilen güncel doktor listesi.
- **Randevu Takibi:** Alınan randevuların listelenmesi ve istenildiğinde iptal edilebilmesi.

## 🛠 Kullanılan Teknolojiler
- **Backend:** Java 17, Spring Boot 3.x, Spring Data JPA
- **Frontend:** HTML5, CSS3 (Bootstrap 5), JavaScript (Vanilla ES6+)
- **Veritabanı:** Microsoft SQL Server (MSSQL)
- **Araçlar:** IntelliJ IDEA, Maven, Git/GitHub

## 📁 Proje Yapısı
- `controller/`: API uç noktalarının (endpoint) yönetildiği katman.
- `service/`: İş mantığının (Business Logic) yürütüldüğü katman.
- `entity/`: Veritabanı tablolarının Java sınıfları (Patient, Doctor, Appointment).
- `repository/`: Veritabanı sorgularının (Spring Data JPA) yönetildiği katman.
- `static/`: Frontend dosyaları (index.html).

## 🔧 Kurulum
1. SQL Server üzerinde `HospitalDB` adında bir veritabanı oluşturun.
2. `application.properties` içindeki veritabanı kullanıcı adı ve şifresini güncelleyin.
3. Projeyi çalıştırın ve tarayıcıda `http://localhost:8080` adresine gidin.

  <img width="536" height="526" alt="image" src="https://github.com/user-attachments/assets/581de2bf-5cd0-4d1a-bd98-7b881414b558" />
https://github.com/user-attachments/assets/460b27fb-7358-4057-9c82-92b76c14fb2a
https://github.com/user-attachments/assets/69c946d0-e15d-4a64-ba07-f7eb749310ff
