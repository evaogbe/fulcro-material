(ns ogbe.fulcro.mui.icons.palette-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PaletteOutlined" :default PaletteOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-palette-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaletteOutlined)))