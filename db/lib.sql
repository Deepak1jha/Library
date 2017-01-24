CREATE DATABASE lib;

CREATE TABLE IF NOT EXISTS `book_db` (
  `Serial_No` int(20) NOT NULL,
  `Book_Subject` varchar(200) NOT NULL,
  `Book_Title` varchar(200) NOT NULL,
  `Author_Name` varchar(200) NOT NULL,
  `Publisher` varchar(200) NOT NULL,
  `Copyright` varchar(200) NOT NULL,
  `Edition` int(20) NOT NULL,
  `No_Of_Pages` int(20) NOT NULL,
  `ISBN_No` varchar(200) NOT NULL,
  `Library_Name` varchar(200) NOT NULL,
  `Self_No` varchar(200) NOT NULL,
  PRIMARY KEY (`Serial_No`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book_db`
--

INSERT INTO `book_db` (`Serial_No`, `Book_Subject`, `Book_Title`, `Author_Name`, `Publisher`, `Copyright`, `Edition`, `No_Of_Pages`, `ISBN_No`, `Library_Name`, `Self_No`) VALUES
(1, 'JAVA', 'OCA Java SE 7', 'MALA GUPTA', 'Manning Publications Co.', 'Manning Publications Co.', 1, 562, '9781617291043', 'Central Library', 'cl1'),
(2, 'Data structure', 'Introduction to Algorithms', 'Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein', 'The MIT Press\r\nCambridge, Massachusetts London, England', 'Massachusetts Institute of Technology', 3, 1313, '9780262533058', 'CENTRAL LIBRARY', 'cl3'),
(3, 'Android', 'Head First Android Development', 'Jonathan Simon', 'O’Reilly Media, Inc.,', 'Jonathan Simon', 1, 532, '9781449393304', 'CENTRAL LIBRARY', 'cl6'),
(4, 'Android', 'Java Programming for Android Developers', 'Barry Burd', 'John Wiley & Sons, Inc.', 'john Wiley & Sons, Inc., Hoboken, New Jersey', 1, 458, '9781118612149', 'CENTRAL LIBRARY', 'cl3'),
(5, 'Data structure', 'Data Structures Using C And C++', 'Y. Langsam, M. Augenstein And A. M. Tenenbaum', 'Prentice - Hall Of India Pvt. Ltd.', 'Prentice - Hall Of India Pvt. Ltd.', 2, 992, '983543553559', 'CENTRAL LIBRARY', 'cl3'),
(6, 'Csharp', 'C# 4.0 The Complete Reference', 'Herbert Schildt', 'The McGraw-Hill Companies.', 'The McGraw-Hill Companies.', 4, 976, '9780071741163', 'CENTRAL LIBRARY', 'cl91'),
(7, 'Android', 'introduction to android ', 'vishal poudel', 'John Wiley & Sons, Inc.', 'vishal poudel', 1, 459, '9781118612166', 'CENTRAL LIBRARY', 'c13'),
(8, 'JAVA', 'Introduction to java swing', 'yaswant kanetkar', 'New Tree publication Inc.', 'New Tree publication Inc.', 9, 4786, '585957888', 'central library', 'j6'),
(9, 'Csharp', 'Complete Reference', 'Herbert jr', 'The McGraw-Hill ', 'The McGraw-Hill Companies.', 4, 976, '97800717411600', 'central library', 'cl92'),
(10, 'python', 'base in python ', 'ellie', 'John Wiley & Sons, Inc.', 'ellie', 6, 339, '978111865', 'CENTRAL LIBRARY', 'c11'),
(11, 'Hacking', 'hacking with kali linux', 'deepak jha', 'asjad', 'deepak jha', 7, 878, '9845646546501', 'CENTRAL LIBRARY', 'NO2'),
(12, 'WEB', 'web development', 'anuj', 'pankaj', 'anuj', 2, 881, '9814414', 'CENTRAL LIBRARY', 'CENTRAL LIBRARY'),
(13, 'JAVA', 'OCA Java SE 7', 'MALA GUPTA', 'Manning Publications Co.', 'Manning Publications Co.', 1, 562, '8091617291043', 'Central Library', 'cl1'),
(14, 'Data structure', 'Introduction to Algorithms', 'Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein', 'The MIT Press\r\nCambridge, Massachusetts London, England', 'Massachusetts Institute of Technology', 3, 1313, '233445533058', 'CENTRAL LIBRARY', 'cl3'),
(15, 'Android', 'Head First Android Development', 'Jonathan Simon', 'O’Reilly Media, Inc.,', 'Jonathan Simon', 1, 532, '68981443304', 'CENTRAL LIBRARY', 'cl6'),
(16, 'Android', 'Java Programming for Android Developers', 'Barry Burd', 'John Wiley & Sons, Inc.', 'john Wiley & Sons, Inc., Hoboken, New Jersey', 1, 458, '97118612149', 'CENTRAL LIBRARY', 'cl3'),
(17, 'Data structure', 'Data Structures Using C And C++', 'Y. Langsam, M. Augenstein And A. M. Tenenbaum', 'Prentice - Hall Of India Pvt. Ltd.', 'Prentice - Hall Of India Pvt. Ltd.', 2, 992, '8988543553559', 'CENTRAL LIBRARY', 'cl3'),
(18, 'Csharp', 'C# 4.0 The Complete Reference', 'Herbert Schildt', 'The McGraw-Hill Companies.', 'The McGraw-Hill Companies.', 4, 976, '90991741163', 'CENTRAL LIBRARY', 'cl91'),
(19, 'Android', 'introduction to android ', 'vishal poudel', 'John Wiley & Sons, Inc.', 'vishal poudel', 1, 459, '787668612166', 'CENTRAL LIBRARY', 'c13'),
(20, 'JAVA', 'Introduction to java swing', 'yaswant kanetkar', 'New Tree publication Inc.', 'New Tree publication Inc.', 9, 4786, '990998957888', 'central library', 'j6'),
(21, 'Csharp', 'Complete Reference', 'Herbert jr', 'The McGraw-Hill ', 'The McGraw-Hill Companies.', 4, 976, '890991600', 'central library', 'cl92'),
(22, 'python', 'base in python ', 'ellie', 'John Wiley & Sons, Inc.', 'ellie', 6, 339, '990978111865', 'CENTRAL LIBRARY', 'c11'),
(23, 'python', 'python with cross plateform programming', 'Robin', 'John Wiley & Sons, Inc.', 'Robin', 2, 339, '760978111865', 'CENTRAL LIBRARY', 'c11'),
(24, 'WEB', 'Basic HTML & CSS', 'anuj', 'pankaj', 'anuj', 2, 881, '909914414', 'CENTRAL LIBRARY', 'CENTRAL LIBRARY'),
(25, 'python', '1', '1', '1', '1', 1, 1, '1', '1', '1'),
(26, 'Data structure', '3', '3', '3', '3', 3, 3, '3', '3', '3'),
(27, 'PHP', '3', '3', '3', '3', 3, 3, '3', '3', '3');

-- --------------------------------------------------------

--
-- Table structure for table `issued_books_details`
--

CREATE TABLE IF NOT EXISTS `issued_books_details` (
  `Library_Id` int(50) NOT NULL,
  `Student_Id` int(50) NOT NULL,
  `ISBN_No` varchar(200) NOT NULL,
  `Book_Issue_Date` date NOT NULL,
  `Serial_No` int(20) NOT NULL,
  KEY `Student_Id` (`Student_Id`),
  KEY `Serial_No` (`Serial_No`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `lib_login`
--

CREATE TABLE IF NOT EXISTS `lib_login` (
  `user` varchar(20) NOT NULL,
  `pwd` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lib_login`
--

INSERT INTO `lib_login` (`user`, `pwd`) VALUES
('pankaj', 123),
('vishal', 456),
('faisal', 789),
('salman', 0);

-- --------------------------------------------------------

--
-- Table structure for table `student_details`
--

CREATE TABLE IF NOT EXISTS `student_details` (
  `Student_Id` int(50) NOT NULL,
  `Library_Id` int(50) NOT NULL,
  `Course` varchar(20) NOT NULL,
  `Name` varchar(50) NOT NULL,
  PRIMARY KEY (`Student_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_details`
--

INSERT INTO `student_details` (`Student_Id`, `Library_Id`, `Course`, `Name`) VALUES
(201430150, 2014901, 'BCA', 'pankaj'),
(201430151, 2014902, 'BCA', 'Robin'),
(201430153, 2014903, 'BCA', 'rohit'),
(201430154, 2014904, 'BCA', 'boby'),
(201430155, 2014905, 'BCA', 'deepak');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `issued_books_details`
--
ALTER TABLE `issued_books_details`
  ADD CONSTRAINT `issued_books_details_ibfk_3` FOREIGN KEY (`Serial_No`) REFERENCES `book_db` (`Serial_No`),
  ADD CONSTRAINT `issued_books_details_ibfk_1` FOREIGN KEY (`Student_Id`) REFERENCES `student_details` (`Student_Id`),
  ADD CONSTRAINT `issued_books_details_ibfk_2` FOREIGN KEY (`Serial_No`) REFERENCES `book_db` (`Serial_No`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
