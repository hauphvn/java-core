# Jack's Block
This is a my research about Java language.
###Ke thua nang cao

- Trong Java có 3 loại hằng  
Lớp hằng là lớp không cho phép thừa kế  
Phương thức hằng là phương thức không cho phép
ghi đè  
Biến hằng là biến không cho phép thay đổi giá trị
Sử dụng từ khóa final để định nghĩa hằng  

###------Bien---------
- Trong java co 2 kieu tham so:
Tham bien: array, class, interface  
Tham tri: cac kieu nguyen thuy  
###-----Package-----------
- private: chi trong cung class moi truy cap dc
- default: chi trong cung class va package
- protected: dc het, ngoai tru khac package thi ko dc
- public: duoc het.
###---interface---------
- Interface co the tao dc mot class dai dien
myinterface obj2 = new myclass();
###-------Throws----------
- Từ khóa throws
- Từ khóa throws được sử dụng trong method dùng để
đề xuất các ngoại lệ có thể xảy ra trong method đó.

- Tất cả các ngoại lệ được khai báo bởi throws đều phải
được xử lý, nếu không có đủ sẽ bị thông báo lỗi.

```java
        public void myMethod() throwIOException{
            bal bal
        }
```

```java
        public static void main(String[] args) throws IOException{
            co su dung myMethod() thi phai xu ly exception cua myMethod throw ra.
        }
```

- Su dung ben trong code cua method
```java
        public void myMethod(){
            if blabla {
                try {
                    throw new NullPointerException("demo")
                } catch(NullPointerException e){
//xu ly exception nay.
                    co the throw ra tiep de ham khac khi thuc thi se xu li tiep bang lenh ben duoi
                    throw e
                }
            }
        }
```

###--------Stream----------
- Luong byte va luong character
- Byte: du lieu dang nhi phan, Kiểu int, float, double,String, boolean...,   
- Kiểu object
- 2 class abstract:  
• InputStream  
• OutputStream  
- Ngoai ra con co: class
File Input Stream,
File Output Stream

- Character: du lieu dang Unicode
- 2 class abstract:  
• Reader  
• Writer

###--------Overload----------
- Cac method trong cung 1 class, cung ten, khac tham so
- Co the thua ke tu class cha, va ta viet lai method do giong ten, nhung ta dat them param
###-------Override---------
- Khai bao method trong class Cha  giong cach khai bao phuong thuc trong class Con
- OVERRIDING: cach dung cho phuong thuc o class Con
- OVERRIDDEN: cach dung cho phuong thuc o class Cha
- Lien quan de quan he Is-A
- Static, Final: khong duoc override

###------Override va Overload----------Giong nhau
- Ten phuong thuc truc nhau
- The hien tinh da hinh cua lap trinh huong doi tuong
- Cung ten nhung thuc hien cac thao tac khac nhau

###------Override va Overload----------Khac nhau
- Overloading: khong quan tam den gia tri tra ve, loai gia tri tra ve, exception, access modifiers.
- NHUNG danh sach tham so phai khac nhau, vi neu giong se tro ve Override
- Ve Location:  
Overloading: co the nam trong cung class hoac trong cung cac class co quan he thua ke  
Overriding: Chi nam 2 class KHAC NHAU va co quan he thua ke

###---------Serializable---------
- Khi luu mot doi tuong xuong file thi object se duoc convert thanh String
- Khi do se can mot versionId de khi convert nguoc lai tu string thanh object thi phai tuong ung voi nhau

###------Thread-----------
- cac trang thai cua 1 thread: new, start, running, sleep, waiting, blocked,dead.
- Co 2 cach goi thread: ke thua class Thread, thuc thi interface Runnable

###--Su khac nhau giua thuc thi interface Runnable va class Thread
- to do
### File trong Java IO  
- Qua trinh Encoding:  
Khi ta nhap ki tu 'A' vao mot trinh soan van ban bat ki, thi se chuyen thanh ma ASCII la so 65
va tiep theo se duoc chuyen thanh ma nhi phan 010000001.  
- Qua trinh Decoding:  
Nguoc lai.  
- Tuy nhien ma ASCII chi dung 1 byte de bieu dien mot ki tu nen chi thich hop luu ki tu tieng Anh.  
Vi vay de luu duoc ki tu co dau ta phai su dung bang ma Unicode.  
- UTF-8:  
Su dung 1-4 byte de bieu dien 1 ki tu  
Tuong thich hoan toan voi bang ma ASCII  

Đọc ghi file cấp thấp 
--
1. FileInputStream, FileOutputStream : xu ly file byte, ko dấu 
2. FileReader, FileWrite : xu li dữ liệu có dấu

Đọc ghi file cấp cao
--
1. DataInputStream, DataOutputStream: nhận vào tham số là **kiểu đọc, ghi file cấp thấp**. ``Không`` thể đọc ``1 dòng``.
2. BufferedReader, PrintWriter: nhận vào tham số là **kiểu đọc, ghi file cấp thấp**. ``Có`` thể đọc ghi ``1 dòng``.  
 