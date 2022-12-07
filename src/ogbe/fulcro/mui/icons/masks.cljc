(ns ogbe.fulcro.mui.icons.masks
  #?(:cljs (:require
            ["@mui/icons-material/Masks" :default Masks]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-masks
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Masks)))