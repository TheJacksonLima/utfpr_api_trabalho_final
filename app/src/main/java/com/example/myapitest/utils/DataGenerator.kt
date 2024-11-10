package com.example.myapitest.utils

import com.example.myapitest.model.Car
import com.example.myapitest.model.Location


fun getCars(): List<Car> {
return listOf(
    Car(
        id = "006",
        imageUrl = "https://www.example.com/chevrolet_chevette.jpg",
        year = "1980",
        name = "Chevrolet Chevette",
        licence = "PQR-2345",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "007",
        imageUrl = "https://www.example.com/fiat_147.jpg",
        year = "1982",
        name = "Fiat 147",
        licence = "STU-6789",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "008",
        imageUrl = "https://www.example.com/volkswagen_fusca.jpg",
        year = "1970",
        name = "Volkswagen Fusca",
        licence = "VWX-3456",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "009",
        imageUrl = "https://www.example.com/fiat_palio.jpg",
        year = "1997",
        name = "Fiat Palio",
        licence = "XYZ-1234",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "010",
        imageUrl = "https://www.example.com/chevrolet_omega.jpg",
        year = "1995",
        name = "Chevrolet Omega",
        licence = "ABC-5678",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "011",
        imageUrl = "https://www.example.com/ford_fusion.jpg",
        year = "2007",
        name = "Ford Fusion",
        licence = "DEF-1234",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "012",
        imageUrl = "https://www.example.com/volkswagen_amarok.jpg",
        year = "2010",
        name = "Volkswagen Amarok",
        licence = "GHI-5678",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "013",
        imageUrl = "https://www.example.com/renault_sandero.jpg",
        year = "2012",
        name = "Renault Sandero",
        licence = "JKL-2345",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "014",
        imageUrl = "https://www.example.com/honda_civic.jpg",
        year = "2006",
        name = "Honda Civic",
        licence = "MNO-6789",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "015",
        imageUrl = "https://www.example.com/toyota_corolla.jpg",
        year = "2005",
        name = "Toyota Corolla",
        licence = "PQR-3456",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "016",
        imageUrl = "https://www.example.com/honda_fit.jpg",
        year = "2008",
        name = "Honda Fit",
        licence = "STU-1234",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "017",
        imageUrl = "https://www.example.com/fiat_strada.jpg",
        year = "2015",
        name = "Fiat Strada",
        licence = "VWX-6789",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "018",
        imageUrl = "https://www.example.com/chevrolet_s10.jpg",
        year = "2014",
        name = "Chevrolet S10",
        licence = "XYZ-2345",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "019",
        imageUrl = "https://www.example.com/fiat_uno_2000.jpg",
        year = "2000",
        name = "Fiat Uno 2000",
        licence = "ABC-4321",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "020",
        imageUrl = "https://www.example.com/renault_duster.jpg",
        year = "2016",
        name = "Renault Duster",
        licence = "DEF-1234",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "021",
        imageUrl = "https://www.example.com/volkswagen_brasilia.jpg",
        year = "1973",
        name = "Volkswagen Brasília",
        licence = "GHI-2345",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "022",
        imageUrl = "https://www.example.com/chevrolet_montana.jpg",
        year = "2011",
        name = "Chevrolet Montana",
        licence = "JKL-5678",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "023",
        imageUrl = "https://www.example.com/fiat_uno_1990.jpg",
        year = "1990",
        name = "Fiat Uno 1990",
        licence = "MNO-3456",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "024",
        imageUrl = "https://www.example.com/ferrari_f430.jpg",
        year = "2005",
        name = "Ferrari F430",
        licence = "PQR-6789",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "025",
        imageUrl = "https://www.example.com/volkswagen_gol_2000.jpg",
        year = "2000",
        name = "Volkswagen Gol 2000",
        licence = "STU-9876",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "026",
        imageUrl = "https://www.example.com/chevrolet_prisma.jpg",
        year = "2018",
        name = "Chevrolet Prisma",
        licence = "VWX-8765",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "027",
        imageUrl = "https://www.example.com/toyota_fielder.jpg",
        year = "2019",
        name = "Toyota Fielder",
        licence = "XYZ-5678",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "028",
        imageUrl = "https://www.example.com/hyundai_creta.jpg",
        year = "2020",
        name = "Hyundai Creta",
        licence = "ABC-8765",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "029",
        imageUrl = "https://www.example.com/renault_logan.jpg",
        year = "2013",
        name = "Renault Logan",
        licence = "DEF-4567",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "030",
        imageUrl = "https://www.example.com/ford_ka_2002.jpg",
        year = "2002",
        name = "Ford Ka 2002",
        licence = "GHI-6789",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "031",
        imageUrl = "https://www.example.com/chevrolet_beat.jpg",
        year = "2017",
        name = "Chevrolet Beat",
        licence = "JKL-4567",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "032",
        imageUrl = "https://www.example.com/fiat_fiorino.jpg",
        year = "2010",
        name = "Fiat Fiorino",
        licence = "MNO-2345",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "033",
        imageUrl = "https://www.example.com/toyota_etios.jpg",
        year = "2015",
        name = "Toyota Etios",
        licence = "PQR-3456",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "034",
        imageUrl = "https://www.example.com/volkswagen_parati.jpg",
        year = "1985",
        name = "Volkswagen Parati",
        licence = "STU-5678",
        place = Location(lat = "-23.5505", long = "-46.6333")
    ),
    Car(
        id = "035",
        imageUrl = "https://www.example.com/fiat_toro.jpg",
        year = "2021",
        name = "Fiat Toro",
        licence = "VWX-2345",
        place = Location(lat = "-23.5505", long = "-46.6333")
    )
)
}