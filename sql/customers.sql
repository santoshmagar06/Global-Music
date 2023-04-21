-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2019 at 06:46 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `globalmusic`
--

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `customer_id` int(11) NOT NULL,
  `full_name` varchar(30) NOT NULL,
  `username` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `post_code` varchar(10) NOT NULL,
  `contact` varchar(14) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `type` varchar(20) NOT NULL,
  `account_no` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`customer_id`, `full_name`, `username`, `address`, `post_code`, `contact`, `email`, `password`, `type`, `account_no`) VALUES
(3, 'dfg', 'Admin', 'df', '11', '44', 'df', 'admin', 'Admin', '44'),
(4, 'hari', 'hari', 'ad', 'sdf', 'sdf', 'dsf', 'hari', 'Organizer', 'fdsf'),
(5, 'shyam', 'shyam', '', '', '', '', 'shyam', 'Organization', ''),
(11, 'gopal', 'gopal', 'earth', '11', '541', 'asdf', '123', 'Individual', '21'),
(12, 'd', 'dan', 'sdf', 'asdf', 'sdf', 'sdf', '123', 'Organization', '4545'),
(14, 'ghana', 'ghanashyam', 'earth', '2112', '5454', 'sd', 'abc', 'Organization', '4545'),
(15, 'dsaf', 'tiger', 'sad', 'sdf', 'sdf', 'sdf', 'tiger', 'Organizer', 'sdf'),
(16, 'sad', 'rame', 'asdf', 'sadf', '1455', 'sdf', '147', 'Individual', 'sdf'),
(17, 'radha', 'radha', 'earth', '2112', 'sdf', 'sdf', '123', 'Organization', 'sdf');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`customer_id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `customer_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
