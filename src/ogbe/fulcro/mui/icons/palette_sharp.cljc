(ns ogbe.fulcro.mui.icons.palette-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PaletteSharp" :default PaletteSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-palette-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaletteSharp)))