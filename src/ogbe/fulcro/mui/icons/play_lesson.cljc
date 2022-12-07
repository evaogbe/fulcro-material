(ns ogbe.fulcro.mui.icons.play-lesson
  #?(:cljs (:require
            ["@mui/icons-material/PlayLesson" :default PlayLesson]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-play-lesson
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlayLesson)))