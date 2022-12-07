(ns ogbe.fulcro.mui.icons.mood-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MoodRounded" :default MoodRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mood-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoodRounded)))