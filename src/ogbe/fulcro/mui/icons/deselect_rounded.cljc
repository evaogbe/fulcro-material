(ns ogbe.fulcro.mui.icons.deselect-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DeselectRounded" :default DeselectRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-deselect-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeselectRounded)))