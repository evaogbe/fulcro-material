(ns ogbe.fulcro.mui.icons.loupe-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LoupeRounded" :default LoupeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-loupe-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LoupeRounded)))