(ns ogbe.fulcro.mui.icons.palette-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PaletteRounded" :default PaletteRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-palette-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaletteRounded)))