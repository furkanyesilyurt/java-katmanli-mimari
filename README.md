# Java Katmanlı Mimari Demosu

-------------------------------------------------------------

Katmanlı mimari projelerimizi belirli bir standart ve düzene göre geliştirmemizi sağlayan, kodun okunabilirliğini arttıran, projelerimizin daha derli toplu olmasını sağlayan ve hata yönetimini daha kolay hale getiren bir yapıdır.



## Data Access Katmanı 

---------------------------------------------------------------------------

Bu katmanda Hibernate ile JDBC işlemleri yapıldı. MySQL içerisindeki hazır veritabanı ve tablolar kullanıldı. Hibernate Java geliştiriciler için geliştirilmiş bir ORM kütüphanesidir. Nesne yönelimli modellere göre veritabanı ile olan ilişkiyi sağlayarak, veritabanı üzerinde yapılan işlemleri kolaylaştırmakla birlikte kurulan yapıyı da sağlamlaştırmaktadır.



## Business(İş kuralları) Katmanı

----------------------------------------------------------------------------

Bu katmanda Spring ile iş fonksiyonları yazıldı. Manager isimli class iş katmanına aittir. Genel akış işlemlerinin yapıldığı katmandır. Spring , JAVA ile kurumsal tabanlı uygulama geliştirmede kullanılan, geliştiricilerin yani bizlerin işlerini hızlandıran ve kolaylaştıran bir framework olarak tanımlayabiliriz.



## RestApi Katmanı

-----------------------------------------------------------------------------

Client-server arasında yani kullanıcı ile sunucu arasında daha hızlı ve daha pratik bir şekilde iletişim gerçekleştirilmesi için kullanılan bir servis yapısıdır. Kullanımı ilk defa 2000 yılında Roy Thomas Fielding tarafından gerçekleştirilen ve doktora tezi bağlamında tanıtımı yapılarak geliştirilen bu sistem, bugüne kadar kullanıma devam edilmiştir ve halen önemli bir yere sahiptir.

REST bir mimari yapı oluşturmak ile birlikte bu mimari yapı kendine ait bir prensibe sahiptir ve belirlenen özellikleri ile kullanım gerçekleştirildiğinde, bu kullanım sonucunda da RESTful servis ortaya çıkar. Yani net bir tanım açısından RESTful için REST mimari kullanımı gerçekleştiren web servisleridir denilebilir.
