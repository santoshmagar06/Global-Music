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
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `booking_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `event_id` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `event_name` varchar(30) NOT NULL,
  `artists` varchar(50) NOT NULL,
  `venue` varchar(30) NOT NULL,
  `date` varchar(15) NOT NULL,
  `tickets` varchar(10) NOT NULL,
  `total` varchar(10) NOT NULL,
  `description` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`booking_id`, `customer_id`, `event_id`, `username`, `event_name`, `artists`, `venue`, `date`, `tickets`, `total`, `description`) VALUES
(1, 3, 6, ' Santosh', ' Hari_om', ' neetesh jung kunwar', 'lainchour,ktm ', ' 2019', '4 ', '2000.0', 'neetesh jung will perform his songs'),
(2, 1, 4, 'sita', 'Dabaang Tour ', ' Salman Khan and team', ' ktm,Nepal', ' 2019', ' ', ' ', 'salman khan will perform'),
(3, 1, 4, 'sita', 'Dabaang Tour ', ' Salman Khan and team', ' ktm,Nepal', ' 2019', ' 4', '12000.0', 'salman khan will perform'),
(4, 6, 4, 'sita', 'Dabaang Tour ', ' Salman Khan and team', ' ktm,Nepal', ' 2019', '7 ', '21000.0', 'salman khan will perform'),
(5, 12, 4, 'dan', 'Dabaang Tour ', ' Salman Khan and team', ' ktm,Nepal', ' 2019', ' 4', '12000.0', 'salman khan will perform');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`booking_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `booking_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
