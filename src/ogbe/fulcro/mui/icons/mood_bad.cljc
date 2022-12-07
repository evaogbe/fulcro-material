(ns ogbe.fulcro.mui.icons.mood-bad
  #?(:cljs (:require
            ["@mui/icons-material/MoodBad" :default MoodBad]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mood-bad
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoodBad)))