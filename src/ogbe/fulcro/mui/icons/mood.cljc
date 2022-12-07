(ns ogbe.fulcro.mui.icons.mood
  #?(:cljs (:require
            ["@mui/icons-material/Mood" :default Mood]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mood
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Mood)))