(ns ogbe.fulcro.mui.icons.color-lens-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ColorLensRounded" :default ColorLensRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-color-lens-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ColorLensRounded)))