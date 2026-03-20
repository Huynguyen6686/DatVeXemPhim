package com.example.datvexemphim.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "hoa_don")
public class HoaDon {
    @Id
    @ColumnDefault("newsequentialid()")
    @Column(name = "id", nullable = false)
    private UUID id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "khach_hang_id", nullable = false)
    private com.example.datvexemphim.entity.KhachHang khachHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nhan_vien_id")
    private com.example.datvexemphim.entity.NhanVien nhanVien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "khuyen_mai_id")
    private com.example.datvexemphim.entity.KhuyenMai khuyenMai;

    @Size(max = 100)
    @NotNull
    @Column(name = "ma_hoa_don", nullable = false, length = 100)
    private String maHoaDon;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "tong_tien_ban_dau", nullable = false, precision = 38, scale = 2)
    private BigDecimal tongTienBanDau;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "so_tien_giam", nullable = false, precision = 38, scale = 2)
    private BigDecimal soTienGiam;

    @NotNull
    @Column(name = "tong_tien_thanh_toan", nullable = false, precision = 38, scale = 2)
    private BigDecimal tongTienThanhToan;

    @ColumnDefault("0")
    @Column(name = "diem_thuong_su_dung")
    private Integer diemThuongSuDung;

    @ColumnDefault("0")
    @Column(name = "diem_thuong_nhan_duoc")
    private Integer diemThuongNhanDuoc;

    @ColumnDefault("getdate()")
    @Column(name = "thoi_gian_tao")
    private Instant thoiGianTao;

    @Column(name = "thoi_gian_het_han_giu_ghe")
    private Instant thoiGianHetHanGiuGhe;

    @ColumnDefault("0")
    @Column(name = "trang_thai")
    private Integer trangThai;

}