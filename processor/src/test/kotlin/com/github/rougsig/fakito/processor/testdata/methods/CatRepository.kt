package com.github.rougsig.fakito.processor.testdata.methods

import com.github.rougsig.fakito.runtime.Fakito

interface CatRepository {
  fun fetchCats()

  fun fetchCatById(catId: String)

  fun cats(): List<Any>

  fun catById(catId: String): Any?

  fun deleteCats(catIds: Set<String>)

  fun updateCat(
    catId: String,
    newName: Any?,
    newHomes: List<String?>
  )
}

@Fakito(CatRepository::class)
interface CatRepositoryFake
