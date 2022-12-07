(ns ogbe.fulcro.mui.icons.lan
  #?(:cljs (:require
            ["@mui/icons-material/Lan" :default Lan]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lan
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Lan)))