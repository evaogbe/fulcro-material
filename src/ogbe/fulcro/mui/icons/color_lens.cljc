(ns ogbe.fulcro.mui.icons.color-lens
  #?(:cljs (:require
            ["@mui/icons-material/ColorLens" :default ColorLens]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-color-lens
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ColorLens)))