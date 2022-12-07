(ns ogbe.fulcro.mui.icons.iso
  #?(:cljs (:require
            ["@mui/icons-material/Iso" :default Iso]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-iso
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Iso)))