(ns ogbe.fulcro.mui.icons.mood-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MoodSharp" :default MoodSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mood-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoodSharp)))