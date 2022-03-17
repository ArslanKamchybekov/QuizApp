package kg.geektech.quizapp.utils.extension

import kg.geektech.quizapp.domain.main.entity.HistoryEntity

fun fill(historyEntity: HistoryEntity, list: ArrayList<HistoryEntity>){
    for (i in 0..10){
        list.add(historyEntity)
    }
}