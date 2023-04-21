-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2019 at 04:05 AM
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
  `uername` varchar(20) NOT NULL,
  `event_name` varchar(30) NOT NULL,
  `artists` varchar(50) NOT NULL,
  `venue` varchar(30) NOT NULL,
  `date` varchar(15) NOT NULL,
  `tickets` varchar(10) NOT NULL,
  `total` varchar(10) NOT NULL,
  `description` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `customer_id` int(11) NOT NULL,
  `full_name` varchar(30) NOT NULL,
  `username` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `post_code` varchar(20) NOT NULL,
  `contact` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(30) NOT NULL,
  `type` varchar(20) NOT NULL,
  `account_no` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`customer_id`, `full_name`, `username`, `address`, `post_code`, `contact`, `email`, `password`, `type`, `account_no`) VALUES
(1, ' ', ' Santosh', ' ', ' ', ' ', ' ', ' Magar', 'Admin', ' '),
(2, ' Santosh Magar', ' @isantosh', ' Ramechhap', ' 11', ' 9844234327', ' aadarshamag@gmail.com', 'magar', ' Individual', ' 4541552415'),
(4, 'sdfg ', ' sdfg', ' sdfg', ' 155', '5456', ' dfg', ' sdfg', 'Organization', ' 5151'),
(11, ' School', ' @ischool', ' ktm', ' 1123', '01245 ', 'aadarshamag@gmail.com', '1234 ', 'Individual', '154451514');

-- --------------------------------------------------------

--
-- Table structure for table `events`
--

CREATE TABLE `events` (
  `event_id` int(11) NOT NULL,
  `event_name` varchar(30) NOT NULL,
  `artists` varchar(30) NOT NULL,
  `agent` varchar(20) NOT NULL,
  `venue` varchar(50) NOT NULL,
  `price` varchar(10) NOT NULL,
  `tickets` varchar(10) NOT NULL,
  `date` varchar(15) NOT NULL,
  `description` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `events`
--

INSERT INTO `events` (`event_id`, `event_name`, `artists`, `agent`, `venue`, `price`, `tickets`, `date`, `description`) VALUES
(4, 'Dabaang Tour ', ' Salman Khan and team', 'gopal verma  and ram', ' ktm,Nepal', '3000 ', '50000 ', ' 2019', 'salman khan will perform'),
(6, ' Hari_om', ' neetesh jung kunwar', ' ram gopal', 'lainchour,ktm ', ' 500', ' 10000', ' 2019', 'neetesh jung will perform his songs');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`booking_id`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`customer_id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `events`
--
ALTER TABLE `events`
  ADD PRIMARY KEY (`event_id`),
  ADD UNIQUE KEY `event_name` (`event_name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `booking_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `customer_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `events`
--
ALTER TABLE `events`
  MODIFY `event_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
