# ProfilApp - Jetpack Compose UI Dasar

> **Tugas Praktikum Bab 2: Konsep Dasar UI Jetpack Compose**  
> Aplikasi Android sederhana yang dibangun untuk mendemonstrasikan implementasi UI Deklaratif menggunakan Jetpack Compose.

---

## Deskripsi Proyek

ProfilApp adalah aplikasi *single-screen* yang menampilkan profil pengguna secara statis beserta elemen interaktif sederhana. Proyek ini bertujuan untuk menguji pemahaman dasar mengenai penyusunan *layout*, penggunaan *modifier*, dan pengelolaan *state* pada Jetpack Compose.

## Fitur Utama

- **Tampilan Profil Statis**: Menampilkan foto profil melingkar, nama lengkap, NIM, dan deskripsi singkat.
- **Tombol Interaktif**: Dilengkapi dengan tombol *Follow/Unfollow* yang memanfaatkan *state management* untuk mengubah warna dan teks secara dinamis (*real-time*).
- **Responsive Layout**: Disusun sedemikian rupa agar komponen tetap berada di tengah layar (*center aligned*).

## Teknologi yang Digunakan

- **Bahasa**: Kotlin
- **UI Toolkit**: Jetpack Compose (Material Design 3)
- **Minimum SDK**: API 24 (Android 7.0)

---

## Penjelasan Singkat Kode

Aplikasi ini sepenuhnya dibangun menggunakan arsitektur antarmuka **UI Deklaratif**. Logika utama berada di dalam fungsi `@Composable fun ProfilScreen()`:

1. **Layouting (`Column`)**: Menggunakan `Column` dengan parameter `horizontalAlignment = Alignment.CenterHorizontally` agar seluruh elemen tersusun vertikal tepat di tengah layar.
2. **Styling (`Modifier`)**:
   - `.background()` untuk mewarnai latar belakang layar.
   - `.padding()` untuk memberi jarak (margin/padding) yang proporsional.
   - `.clip(CircleShape)` pada komponen `Image` untuk memotong gambar menjadi bentuk lingkaran sempurna.
   - `Spacer` digunakan untuk memberikan jarak antar komponen secara presisi.
3. **State Management (`remember` & `mutableStateOf`)**: Menggunakan variabel `isFollowed` untuk melacak status klik tombol. Saat diklik, perubahan nilai dari *state* ini akan secara otomatis memicu proses *recomposition* sehingga UI memperbarui teks dan warna tombol tanpa perlu mengubah komponen secara manual.

---

## Analisis: Jetpack Compose vs XML Tradisional

Berdasarkan hasil praktikum, pendekatan Jetpack Compose menawarkan beberapa keuntungan signifikan dibandingkan XML tradisional:

*   **Efisiensi Kode (Tanpa Boilerplate)**: Pembuatan UI dan logika berjalan dalam satu bahasa (Kotlin). Tidak ada lagi kebutuhan untuk menghubungkan file UI dengan logika menggunakan `findViewById` atau *View Binding*.
*   **Reaktivitas Otomatis**: Melalui pendekatan deklaratif, UI akan otomatis di-*render* ulang menyesuaikan dengan perubahan data (*state*). Pada XML imperatif, kita harus mengelola setiap perubahan properti (seperti `.setText()` atau `.setBackgroundColor()`) secara manual.
*   **Kustomisasi Fleksibel (Chaining)**: Modifikasi tampilan pada Compose menggunakan *Modifier* yang ditumpuk (*chained*). Hal ini terasa jauh lebih intuitif dan rapi dibandingkan dengan menulis puluhan baris atribut pada *tag* XML.
*   **Pemeliharaan (Maintainability)**: Komponen dapat dipecah menjadi fungsi-fungsi `@Composable` kecil yang mudah digunakan kembali (*reusable*), membuat struktur proyek aplikasi besar menjadi jauh lebih bersih.

---

## Screenshot Aplikasi

| Mode Portrait | Mode Landscape |
| :---: | :---: |
| <img width="429" height="953" alt="Screenshot 2026-09-10 231945" src="https://github.com/user-attachments/assets/c4349341-6b8c-4291-b428-1d2cea4d77dd" /> | <img width="1907" height="848" alt="Screenshot 2026 09-10 232005" src="https://github.com/user-attachments/assets/6147e0c4-07c4-4133-bbe0-003fd8a4b5d0" /> |

**Galih Praditya Kurniawan**  
Mahasiswa Teknik Informatika - Universitas Brawijaya  
NIM: [Masukkan NIM Anda di sini]
