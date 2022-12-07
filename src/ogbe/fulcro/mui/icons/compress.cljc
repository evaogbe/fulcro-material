(ns ogbe.fulcro.mui.icons.compress
  #?(:cljs (:require
            ["@mui/icons-material/Compress" :default Compress]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-compress
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Compress)))