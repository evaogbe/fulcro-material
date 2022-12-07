(ns ogbe.fulcro.mui.icons.colorize-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ColorizeRounded" :default ColorizeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-colorize-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ColorizeRounded)))