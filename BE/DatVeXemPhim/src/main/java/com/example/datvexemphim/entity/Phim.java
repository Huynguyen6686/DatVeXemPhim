package com.example.datvexemphim.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "phim")
public class Phim {
    @Id
    @ColumnDefault("newsequentialid()")
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "phan_loai_do_tuoi_id")
    private PhanLoaiDoTuoi phanLoaiDoTuoi;

    @Size(max = 50)
    @Column(name = "ma", length = 50)
    private String ma;

    @Size(max = 100)
    @NotNull
    @Nationalized
    @Column(name = "ten", nullable = false, length = 100)
    private String ten;

    @Column(name = "thoi_luong")
    private Integer thoiLuong;

    @Column(name = "ngay_cong_chieu")
    private Instant ngayCongChieu;

    @Column(name = "ngay_ket_thuc")
    private Instant ngayKetThuc;

    @Size(max = 500)
    @Column(name = "hinh_anh_poster", length = 500)
    private String hinhAnhPoster;

    @Size(max = 500)
    @Column(name = "hinh_anh_banner", length = 500)
    private String hinhAnhBanner;

    @Size(max = 500)
    @Column(name = "trailer_url", length = 500)
    private String trailerUrl;

    @Nationalized
    @Lob
    @Column(name = "mo_ta")
    private String moTa;

    @Nationalized
    @Lob
    @Column(name = "metadata")
    private String metadata;

    @ColumnDefault("1")
    @Column(name = "trang_thai")
    private Integer trangThai;

    @ColumnDefault("getdate()")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

}