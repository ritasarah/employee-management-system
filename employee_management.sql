-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 16, 2015 at 11:26 AM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `employee_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_bulanan`
--

CREATE TABLE IF NOT EXISTS `data_bulanan` (
`id` int(11) NOT NULL,
  `nip_pegawai` int(11) NOT NULL,
  `bulan` varchar(15) NOT NULL,
  `presensi` int(11) NOT NULL,
  `absensi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `jadwal_pegawai`
--

CREATE TABLE IF NOT EXISTS `jadwal_pegawai` (
  `nip_pegawai` int(11) NOT NULL,
  `id_shift` int(11) NOT NULL,
  `minggu_ke` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE IF NOT EXISTS `karyawan` (
`nip` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`nip`) VALUES
(11),
(12),
(13),
(14),
(15),
(16),
(17),
(18),
(19),
(20);

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE IF NOT EXISTS `manager` (
`nip` int(11) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE IF NOT EXISTS `pegawai` (
`nip` int(11) NOT NULL,
  `no_hp` int(11) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `id_rate_gaji` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`nip`, `no_hp`, `nama`, `alamat`, `id_rate_gaji`) VALUES
(11, 899, 'AAA', 'Skagen 21', 21),
(12, 899, 'BBB', 'Bandung', 22),
(13, 899, 'CCC', 'Jakarta', 23),
(14, 899, 'DDD', 'Surabaya', 24),
(15, 899, 'EEE', 'Coblong', 25),
(16, 899, 'FFF', 'Dago', 26),
(17, 899, 'GGG', 'Jl Riau', 27),
(18, 899, 'HHH', 'Jl Merdeka', 28),
(19, 899, 'III', 'Tubagus Ismail', 29),
(20, 899, 'JJJ', 'Kanayakan', 30);

-- --------------------------------------------------------

--
-- Table structure for table `rate_gaji`
--

CREATE TABLE IF NOT EXISTS `rate_gaji` (
`id` int(11) NOT NULL,
  `status` varchar(10) NOT NULL,
  `nominal` int(11) NOT NULL,
  `pekerjaan` varchar(20) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=31 ;

--
-- Dumping data for table `rate_gaji`
--

INSERT INTO `rate_gaji` (`id`, `status`, `nominal`, `pekerjaan`) VALUES
(21, 'trainee', 200, 'cuci'),
(22, 'trainee', 200, 'masak'),
(23, 'trainee', 200, 'bartender'),
(24, 'trainee', 200, 'hall'),
(25, 'trainee', 200, 'kasir'),
(26, 'fulltime', 400, 'cuci'),
(27, 'fulltime', 400, 'masak'),
(28, 'fulltime', 400, 'bartender'),
(29, 'fulltime', 400, 'hall'),
(30, 'fulltime', 400, 'kasir');

-- --------------------------------------------------------

--
-- Table structure for table `shift_available_pegawai`
--

CREATE TABLE IF NOT EXISTS `shift_available_pegawai` (
  `nip_pegawai` int(11) NOT NULL,
  `id_shift` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shift_available_pegawai`
--

INSERT INTO `shift_available_pegawai` (`nip_pegawai`, `id_shift`) VALUES
(11, 1),
(11, 2),
(11, 3),
(12, 4),
(12, 5),
(12, 6),
(13, 7),
(13, 8),
(13, 9),
(14, 10),
(14, 11),
(14, 12),
(15, 13),
(15, 14),
(15, 1),
(16, 2),
(16, 3),
(16, 4),
(17, 5),
(17, 6),
(17, 7),
(18, 8),
(18, 9),
(18, 10),
(19, 11),
(19, 12),
(19, 13),
(20, 14),
(20, 13),
(20, 14);

-- --------------------------------------------------------

--
-- Table structure for table `shift_kerja`
--

CREATE TABLE IF NOT EXISTS `shift_kerja` (
`id` int(11) NOT NULL,
  `hari` varchar(10) NOT NULL,
  `jam` varchar(10) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Dumping data for table `shift_kerja`
--

INSERT INTO `shift_kerja` (`id`, `hari`, `jam`) VALUES
(1, 'senin', 'pagi'),
(2, 'senin', 'malam'),
(3, 'selasa', 'pagi'),
(4, 'selasa', 'malam'),
(5, 'rabu', 'pagi'),
(6, 'rabu', 'malam'),
(7, 'kamis', 'pagi'),
(8, 'kamis', 'malam'),
(9, 'jumat', 'pagi'),
(10, 'jumat', 'malam'),
(11, 'sabtu', 'pagi'),
(12, 'sabtu', 'malam'),
(13, 'minggu', 'pagi'),
(14, 'minggu', 'malam');

-- --------------------------------------------------------

--
-- Table structure for table `system_setting`
--

CREATE TABLE IF NOT EXISTS `system_setting` (
`id` int(11) NOT NULL,
  `min_cuci` int(11) NOT NULL,
  `min_masak` int(11) NOT NULL,
  `min_kasir` int(11) NOT NULL,
  `min_bartender` int(11) NOT NULL,
  `min_hall` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_bulanan`
--
ALTER TABLE `data_bulanan`
 ADD PRIMARY KEY (`id`), ADD KEY `nip_pegawai` (`nip_pegawai`);

--
-- Indexes for table `jadwal_pegawai`
--
ALTER TABLE `jadwal_pegawai`
 ADD KEY `id_shift` (`id_shift`), ADD KEY `nip_pegawai` (`nip_pegawai`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
 ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `manager`
--
ALTER TABLE `manager`
 ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
 ADD PRIMARY KEY (`nip`), ADD KEY `id_rate_gaji` (`id_rate_gaji`);

--
-- Indexes for table `rate_gaji`
--
ALTER TABLE `rate_gaji`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `shift_available_pegawai`
--
ALTER TABLE `shift_available_pegawai`
 ADD KEY `nip_pegawai` (`nip_pegawai`), ADD KEY `id_shift` (`id_shift`);

--
-- Indexes for table `shift_kerja`
--
ALTER TABLE `shift_kerja`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `system_setting`
--
ALTER TABLE `system_setting`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_bulanan`
--
ALTER TABLE `data_bulanan`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `karyawan`
--
ALTER TABLE `karyawan`
MODIFY `nip` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT for table `manager`
--
ALTER TABLE `manager`
MODIFY `nip` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `pegawai`
--
ALTER TABLE `pegawai`
MODIFY `nip` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT for table `rate_gaji`
--
ALTER TABLE `rate_gaji`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=31;
--
-- AUTO_INCREMENT for table `shift_kerja`
--
ALTER TABLE `shift_kerja`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT for table `system_setting`
--
ALTER TABLE `system_setting`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `data_bulanan`
--
ALTER TABLE `data_bulanan`
ADD CONSTRAINT `data_bulanan_ibfk_1` FOREIGN KEY (`nip_pegawai`) REFERENCES `karyawan` (`nip`);

--
-- Constraints for table `jadwal_pegawai`
--
ALTER TABLE `jadwal_pegawai`
ADD CONSTRAINT `jadwal_pegawai_ibfk_1` FOREIGN KEY (`nip_pegawai`) REFERENCES `karyawan` (`nip`),
ADD CONSTRAINT `jadwal_pegawai_ibfk_2` FOREIGN KEY (`id_shift`) REFERENCES `shift_kerja` (`id`),
ADD CONSTRAINT `jadwal_pegawai_ibfk_3` FOREIGN KEY (`nip_pegawai`) REFERENCES `karyawan` (`nip`);

--
-- Constraints for table `karyawan`
--
ALTER TABLE `karyawan`
ADD CONSTRAINT `karyawan_ibfk_1` FOREIGN KEY (`nip`) REFERENCES `pegawai` (`nip`);

--
-- Constraints for table `manager`
--
ALTER TABLE `manager`
ADD CONSTRAINT `manager_ibfk_1` FOREIGN KEY (`nip`) REFERENCES `pegawai` (`nip`);

--
-- Constraints for table `pegawai`
--
ALTER TABLE `pegawai`
ADD CONSTRAINT `pegawai_ibfk_1` FOREIGN KEY (`id_rate_gaji`) REFERENCES `rate_gaji` (`id`);

--
-- Constraints for table `shift_available_pegawai`
--
ALTER TABLE `shift_available_pegawai`
ADD CONSTRAINT `shift_available_pegawai_ibfk_1` FOREIGN KEY (`nip_pegawai`) REFERENCES `karyawan` (`nip`),
ADD CONSTRAINT `shift_available_pegawai_ibfk_2` FOREIGN KEY (`id_shift`) REFERENCES `shift_kerja` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
