(ns ogbe.fulcro.mui.icons.shower
  #?(:cljs (:require
            ["@mui/icons-material/Shower" :default Shower]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shower
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Shower)))