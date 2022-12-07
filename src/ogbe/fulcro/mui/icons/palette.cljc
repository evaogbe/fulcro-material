(ns ogbe.fulcro.mui.icons.palette
  #?(:cljs (:require
            ["@mui/icons-material/Palette" :default Palette]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-palette
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Palette)))