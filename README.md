# FUNiX_ReadBook_JavaIntro
#cungnhaudocsach Introduction to Java programming - Robert Sedgewick

## 1. Cấu trúc thư mục

Mỗi thư mục có tên "Chapter_X" với X là số chương sách sẽ là thư mục chứa source code của từng bạn. Trong "Chapter_X", các bạn tự tạo thư mục mang tên mình "Dev_Name", trong đó chứa source code của bài tập bạn làm trong chương.
## 2. Các bước share code

### 2.0. Bắt đầu

2.0.1. Mở cửa sổ terminal hoặc Git bash:</br>
<pre>
git clone https://github.com/tieugiang91/FUNiX_ReadBook_JavaIntro.git
</pre>
2.0.2. Tạo 1 branch mới có tên của mình và checkout:</br>
<pre>
git checkout -b NameOMG_ChapterX
</pre>
2.0.3. Thực hiện thay đổi file, code và commit:</br>
<pre>
git add .
git commit -m "My message"
git push
</pre>

### 2.1. Pull request

Sau khi đã hài lòng với code và hoàn thành đầy đủ bài tập của chương X, bạn có thể tạo pull request với yêu cầu review. Chuyển sang tab Pull requests chọn New Pull Request. Để base là master và from là tên branch của bạn. Trong phần message, viết danh sách những bài bạn đã làm trong chương và tên file tương ứng để bạn review code có thể dễ review.
Sau mỗi chương, các branch của chương trước đó sẽ bị xóa. Đồng nghĩa với việc, khi bắt đầu code chương mới, bạn cần
<pre>
git checkout master
git pull
</pre>
Sau đó mới quay lại bước 2.0.2.

### 2.2. Đóng góp về quy trình

Rất mong mọi người đóng góp về quy trình và guideline bằng cách sửa file README này.
Để sREADME file, ở bước 2.0.2, bạn tạo/checkout branch có tên là README_Update, thực hiện sửa đổi, push code và tạo pull request như các bài tập khác. Sau khi thay đổi được cập nhật, branch README_Update không bị xóa. 
