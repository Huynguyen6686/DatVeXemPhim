package com.example.datvexemphim.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "danh_gia_phim")
public class DanhGiaPhim {
    @Id
    @ColumnDefault("newsequentialid()")
    @Column(name = "id", nullable = false)
    private UUID id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "phim_id", nullable = false)
    private com.example.datvexemphim.entity.Phim phim;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "khach_hang_id", nullable = false)
    private com.example.datvexemphim.entity.KhachHang khachHang;

    @NotNull
    @Column(name = "diem_so", nullable = false)
    private Integer diemSo;

    @Size(max = 255)
    @Nationalized
    @Column(name = "binh_luan")
    private String binhLuan;

    @ColumnDefault("getdate()")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

}