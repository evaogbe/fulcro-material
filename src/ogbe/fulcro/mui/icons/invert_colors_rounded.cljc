(ns ogbe.fulcro.mui.icons.invert-colors-rounded
  #?(:cljs (:require
            ["@mui/icons-material/InvertColorsRounded" :default InvertColorsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-invert-colors-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InvertColorsRounded)))