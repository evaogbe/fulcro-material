(ns ogbe.fulcro.mui.icons.arrow-drop-up
  #?(:cljs (:require
            ["@mui/icons-material/ArrowDropUp" :default ArrowDropUp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-drop-up
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowDropUp)))