(ns ogbe.fulcro.mui.icons.palette-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PaletteTwoTone" :default PaletteTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-palette-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaletteTwoTone)))