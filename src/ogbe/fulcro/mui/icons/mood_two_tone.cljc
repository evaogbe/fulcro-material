(ns ogbe.fulcro.mui.icons.mood-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/MoodTwoTone" :default MoodTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mood-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoodTwoTone)))