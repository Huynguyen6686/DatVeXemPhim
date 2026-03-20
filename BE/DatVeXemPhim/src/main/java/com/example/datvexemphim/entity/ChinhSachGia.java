package com.example.datvexemphim.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "chinh_sach_gia")
public class ChinhSachGia {
    @Id
    @ColumnDefault("newsequentialid()")
    @Column(name = "id", nullable = false)
    private UUID id;

    @Size(max = 50)
    @Column(name = "ma", length = 50)
    private String ma;

    @Size(max = 100)
    @NotNull
    @Nationalized
    @Column(name = "ten_chinh_sach", nullable = false, length = 100)
    private String tenChinhSach;

    @Column(name = "ngay_trong_tuan")
    private Integer ngayTrongTuan;

    @Column(name = "khung_gio_bat_dau")
    private LocalTime khungGioBatDau;

    @Column(name = "khung_gio_ket_thuc")
    private LocalTime khungGioKetThuc;

    @ColumnDefault("1.0")
    @Column(name = "phan_tram_dieu_chinh", precision = 5, scale = 2)
    private BigDecimal phanTramDieuChinh;

    @ColumnDefault("0")
    @Column(name = "phu_thu_co_dinh", precision = 38, scale = 2)
    private BigDecimal phuThuCoDinh;

    @ColumnDefault("0")
    @Column(name = "uu_tien")
    private Integer uuTien;

    @ColumnDefault("1")
    @Column(name = "trang_thai")
    private Integer trangThai;

    @ColumnDefault("getdate()")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

}