package com.example.datvexemphim.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "giao_dich_thanh_toan")
public class GiaoDichThanhToan {
    @Id
    @ColumnDefault("newsequentialid()")
    @Column(name = "id", nullable = false)
    private UUID id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "hoa_don_id", nullable = false)
    private com.example.datvexemphim.entity.HoaDon hoaDon;

    @Size(max = 50)
    @NotNull
    @Column(name = "phuong_thuc", nullable = false, length = 50)
    private String phuongThuc;

    @Size(max = 255)
    @Column(name = "ma_giao_dich_ben_thu_3")
    private String maGiaoDichBenThu3;

    @NotNull
    @Column(name = "so_tien_giao_dich", nullable = false, precision = 38, scale = 2)
    private BigDecimal soTienGiaoDich;

    @ColumnDefault("getdate()")
    @Column(name = "thoi_gian_giao_dich")
    private Instant thoiGianGiaoDich;

    @NotNull
    @Column(name = "trang_thai", nullable = false)
    private Integer trangThai;

}